package sudoku.computationlogic;

import sudoku.problemdomain.SudokuGame;

public class SudokuUtilities {

    /**
     * Copy the values from one sudoku grid into another
     *
     * Note: O(n^2) Runtime Complexity
     */
    public static void copySudokuArrayValues(int[][] oldArray, int[][] newArray) {
        for (int xIndex = 0; xIndex < SudokuGame.GRID_BOUNDARY; xIndex++){
            System.arraycopy(oldArray[xIndex], 0, newArray[xIndex], 0, SudokuGame.GRID_BOUNDARY);
        }
    }

    /**
     * Creates and returns a new Array with the same values as the inputted Array.
     */
    public static int[][] copyToNewArray(int[][] oldArray) {
        int[][] newArray = new int[SudokuGame.GRID_BOUNDARY][SudokuGame.GRID_BOUNDARY];
        for (int xIndex = 0; xIndex < SudokuGame.GRID_BOUNDARY; xIndex++){
            System.arraycopy(oldArray[xIndex], 0, newArray[xIndex], 0, SudokuGame.GRID_BOUNDARY);
        }

        return newArray;
    }
}
