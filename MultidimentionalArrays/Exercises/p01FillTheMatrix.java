package MultidimentionalArrays.Exercises;

import java.util.Scanner;

public class p01FillTheMatrix {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        String input = scanner.nextLine();
        int n = Integer.parseInt(input.split(", ")[0]);
        String pattern = input.split(", ")[1];

        int[][] matrix = new int[n][n];

        if (pattern.equals("A")) {
            FillMatrixPatternA(matrix);

        } else if (pattern.equals("B")) {
            fillMatrixPatternB(matrix);



        }
        printMatrix(matrix);

    }

    private static void printMatrix(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                System.out.print(matrix[row][col] + " ");

            }
            System.out.println();

        }
    }

    private static void fillMatrixPatternB(int[][] matrix) {
        int currentNum = 1;
        for (int col = 0; col < matrix.length; col++) {
            if ((col + 1) % 2 == 0) {
                for (int row = matrix.length - 1; row >= 0; row--) {
                    matrix[row][col] = currentNum;
                    currentNum++;

                }
            }else {
                for (int row = 0; row < matrix.length ; row++) {
                    matrix[row][col] = currentNum;
                    currentNum++;

                }
            }

        }
    }

    private static void FillMatrixPatternA(int[][] matrix) {
        int currentNum = 1;
        for (int col= 0; col < matrix.length; col++) {
            for (int row = 0; row < matrix.length; row++) {
                matrix[row][col] = currentNum;
                currentNum++;


            }

        }
    }
}
