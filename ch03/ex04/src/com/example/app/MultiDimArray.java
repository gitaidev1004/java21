package com.example.app;

public class MultiDimArray {
    public static void main(String[] args) {
        // 정방형 2D 배열 (3행 4열)
        int[][] grid = new int[3][4];
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[r].length; c++) {
                grid[r][c] = r * 10 + c;
            }
        }
        // 출력
        for (int[] row : grid) {
            for (int val : row) System.out.print(val + " ");
            System.out.println();
        }

        // 가변길이 배열 (jagged)
        int[][] jagged = new int[3][];
        jagged[0] = new int[2];
        jagged[1] = new int[4];
        jagged[2] = new int[1];
        jagged[1][3] = 99; // 각 행은 독립적

        System.out.println(java.util.Arrays.deepToString(jagged));
    }
}