package com.example.app;
import java.util.*;
import java.util.stream.*;

public class ArrayStats {
    public static void main(String[] args) {
        System.out.println("=== 배열 기반 통계 프로그램 ===");
        System.out.println("숫자를 한 줄에 하나씩 입력하세요. 종료하려면 'q' 또는 빈 줄을 입력하세요.");
        List<Double> values = readNumbersFromConsole();
        if (values.isEmpty()) {
            System.out.println("입력된 값이 없습니다. 종료합니다.");
            return;
        }

        double[] arr = values.stream().mapToDouble(Double::doubleValue).toArray();
        Arrays.sort(arr);

        int n = arr.length;
        double sum = sum(arr);
        double mean = mean(arr);
        double median = median(arr);
        double min = arr[0];
        double max = arr[n-1];
        double variance = variancePopulation(arr, mean); // 모집단 분산
        double stddev = Math.sqrt(variance);
        List<Double> modes = mode(arr, 3); // 소수점 3자리 반올림 기준

        System.out.println();
        System.out.println("결과:");
        System.out.printf("count = %d%n", n);
        System.out.printf("sum   = %.6f%n", sum);
        System.out.printf("mean  = %.6f%n", mean);
        System.out.printf("median= %.6f%n", median);
        System.out.printf("min   = %.6f%n", min);
        System.out.printf("max   = %.6f%n", max);
        System.out.printf("variance(pop) = %.6f%n", variance);
        System.out.printf("stddev = %.6f%n", stddev);
        System.out.printf("mode(s) = %s%n", modes);
        System.out.printf("p90 = %.6f%n", percentile(arr, 90));
        System.out.printf("p25 = %.6f%n", percentile(arr, 25));
    }

    // 입력 처리
    private static List<Double> readNumbersFromConsole() {
        Scanner sc = new Scanner(System.in);
        List<Double> list = new ArrayList<>();
        int lineNo = 0;
        while (true) {
            System.out.print("> ");
            String line = sc.nextLine();
            lineNo++;
            if (line == null || line.trim().isEmpty() || line.trim().equalsIgnoreCase("q")) break;
            try {
                double v = Double.parseDouble(line.trim());
                if (Double.isFinite(v)) list.add(v);
                else System.out.println("유한한 숫자만 입력하세요 (NaN/Infinity 불가).");
            } catch (NumberFormatException ex) {
                System.out.println("잘못된 숫자 형식: " + line + " (무시됨)");
            }
        }
        // sc.close(); // System.in을 닫지 않음 (다른 코드에서 재사용할 수 있도록)
        return list;
    }

    // 합계
    private static double sum(double[] a) {
        return Arrays.stream(a).sum();
    }

    // 평균
    private static double mean(double[] a) {
        return Arrays.stream(a).average().orElse(Double.NaN);
    }

    // 중앙값
    private static double median(double[] a) {
        int n = a.length;
        if (n == 0) return Double.NaN;
        if (n % 2 == 1) return a[n/2];
        return (a[n/2 - 1] + a[n/2]) / 2.0;
    }

    // 모집단 분산 (denominator = n)
    private static double variancePopulation(double[] a, double mean) {
        return Arrays.stream(a).map(x -> (x - mean) * (x - mean)).sum() / a.length;
    }

    // 분위수 (nearest-rank, 1..100)
    private static double percentile(double[] a, double p) {
        if (a.length == 0) return Double.NaN;
        if (p <= 0) return a[0];
        if (p >= 100) return a[a.length - 1];
        int n = a.length;
        // nearest-rank method
        int idx = (int) Math.ceil(p / 100.0 * n) - 1;
        idx = Math.max(0, Math.min(n - 1, idx));
        return a[idx];
    }

    // 최빈값 (roundDigits: 소수점 반올림 자리수로 그룹화)
    private static List<Double> mode(double[] a, int roundDigits) {
        if (a.length == 0) return Collections.emptyList();
        Map<Double, Integer> freq = new HashMap<>();
        for (double v : a) {
            double key = roundTo(v, roundDigits);
            freq.put(key, freq.getOrDefault(key, 0) + 1);
        }
        int max = freq.values().stream().max(Integer::compareTo).orElse(0);
        return freq.entrySet().stream()
                .filter(e -> e.getValue() == max)
                .map(Map.Entry::getKey)
                .sorted()
                .collect(Collectors.toList());
    }

    private static double roundTo(double v, int digits) {
        double factor = Math.pow(10, digits);
        return Math.round(v * factor) / factor;
    }
}