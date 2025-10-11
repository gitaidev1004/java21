package com.example.app;
import java.util.concurrent.RecursiveTask;
import java.util.concurrent.ForkJoinPool;

public class ConcurrentExample {
    // 병렬 합산 대상 배열
    private static final int[] arr = new int[10_000_000];
    static {
        // 배열에 1부터 10,000,000까지 값 채우기
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
    }

    public static void main(String[] args) {
        ForkJoinPool pool = new ForkJoinPool(Runtime.getRuntime().availableProcessors());

        long start = System.currentTimeMillis();

        // SumTask 실행
        Long total = pool.invoke(new SumTask(arr, 0, arr.length));
        long end = System.currentTimeMillis();
        System.out.println("총합: " + total);
        System.out.println("실행 시간: " + (end - start) + "ms");
        pool.shutdown();
    }

    // 병렬 합계를 위한 RecursiveTask
    static class SumTask extends RecursiveTask<Long> {
        private static final int THRESHOLD = 10_000; // 분할 기준
        private final int[] array;
        private final int start;
        private final int end;
        public SumTask(int[] array, int start, int end) {
            this.array = array;
            this.start = start;
            this.end = end;
        }
        @Override
        protected Long compute() {
            int length = end - start;
            if (length <= THRESHOLD) {
                long sum = 0;
                for (int i = start; i < end; i++) {
                    sum += array[i];
                }
                return sum;
            } else {
                int mid = start + length / 2;
                SumTask left = new SumTask(array, start, mid);
                SumTask right = new SumTask(array, mid, end);
                left.fork();                     // 비동기 실행
                long rightResult = right.compute(); // 현재 스레드에서 우측 실행
                long leftResult = left.join();      // 좌측 결과 기다림
                return leftResult + rightResult;
            }
        }
    }
}