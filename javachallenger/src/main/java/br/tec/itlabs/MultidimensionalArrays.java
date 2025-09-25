package br.tec.itlabs;

public class MultidimensionalArrays {
    public static void main(String[] args) {
//        String[][] tictactoeBoard = new String[3][3];
//
//        for (int row = 0; row < 3; row++) {
//            for (int column = 0; column < 3; column++) {
//                tictactoeBoard[row][column] = row + "," + column + "|";
//                System.out.print(tictactoeBoard[row][column]);
//            }
//
//            System.out.println();
//        }

        //Challenge
        String[][] simpsonsFoods = new String[2][2];

        simpsonsFoods[0][0] = "Donuts";
        simpsonsFoods[1][0] = "Broccoli";
        simpsonsFoods[1][1] = "Krusty burger";

        for (int lineIndex = 0, columnIndex; lineIndex < 2; lineIndex++) {
            columnIndex = 0;

            while (columnIndex < 2) {
                if (simpsonsFoods[lineIndex][0] == "Broccoli") {
                    simpsonsFoods[lineIndex][columnIndex++] = "Healthy";
                } else {
                    simpsonsFoods[lineIndex][columnIndex] = "Junk";
                    break;
                }
            }
        }

        System.out.println(simpsonsFoods[0][0] + "|" + simpsonsFoods[0][1] + "|" +
                simpsonsFoods[1][0] + "|" + simpsonsFoods[1][1]);
    }
}
