package MultidimentionalArrays.Exercises;

import java.util.Scanner;

public class NavyBattleFromExam {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String[][] matrix = new String[n][n];



        fillMatrix(matrix, scanner);

        int submarineRow = -1; //текущия ред на подводницата
        int submarineCol = -1; //текущата колона на подводницата
        int countHits = 0; //бр. пъти, в които е уцелена подводницата
        int countCruiser = 0; //бр. на достигнатите круиз.

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {

                if (matrix[row][col].equals("S")){
                    submarineRow = row;
                    submarineCol = col;
                }

            }

        }
        String command = scanner.nextLine();

        while (true) {
            //започваме движението
            matrix[submarineRow][submarineCol] = "-";
            //преместваме подводницата

            if (command.equals("up")){
                submarineRow --;

            } else if (command.equals("down")) {
                submarineRow ++;

            } else if (command.equals("left")) {
                submarineCol --;


            } else if (command.equals("right")) {
                submarineCol ++;

            }
            String submarinePosition = matrix[submarineRow][submarineCol]; //на какво място се е преместила подводницата
            if (submarinePosition.equals("-")) {
                matrix[submarineRow][submarineCol] = "S";

            } else if (submarinePosition.equals("*")) {

                matrix[submarineRow][submarineCol] = "S";
                countHits ++;

                if (countHits == 3){

                    System.out.printf("Mission failed, U-9 disappeared! Last known coordinates [%d, %d]!%n", submarineRow, submarineCol);
                    break;
                }


            } else if (submarinePosition.equals("C")) {
                matrix[submarineRow][submarineCol] = "S";

                countCruiser++;
                if (countCruiser == 3) {

                    System.out.println("Mission accomplished, U-9 has destroyed all battle cruisers of the enemy!");
                    break;
                }

            }

            command = scanner.nextLine();
        }
        printMatrix(matrix);

    }
    private static void fillMatrix(String[][] matrix, Scanner scanner) {
        for (int row = 0; row < matrix.length; row++) {
            matrix[row] = scanner.nextLine().split("");

        }
    }
    private static void printMatrix(String[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                System.out.print(matrix[row][col]);
            }
            System.out.println();
        }

    }
}
