package com.example.app;
import java.util.Arrays;
import java.util.concurrent.*;

public class SumTask extends RecursiveTask<Long> {
    private static final int THRESHOLD = 10_000;
    private final long[] arr; private final int lo, hi;
    public SumTask(long[] arr, int lo, int hi) { this.arr=arr; this.lo=lo; this.hi=hi;}
    @Override
    protected Long compute() {
        if (hi - lo <= THRESHOLD) {
            long s=0; for(int i=lo;i<hi;i++) s+=arr[i]; return s;
        }
        int mid=(lo+hi)/2;
        SumTask left=new SumTask(arr, lo, mid);
        SumTask right=new SumTask(arr, mid, hi);
        left.fork();
        long rightResult = right.compute();
        long leftResult = left.join();
        return leftResult + rightResult;
    }
    public static void main(String[] args) {
        ForkJoinPool pool = new ForkJoinPool();
        long[] arr = new long[1_000_000]; Arrays.setAll(arr, i->1);
        System.out.println(pool.invoke(new SumTask(arr,0,arr.length)));
        pool.shutdown();
    }
}