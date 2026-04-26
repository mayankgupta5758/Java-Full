import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class hg {
    public static boolean isSafe(int[][] board, int row, int col, int num) {

        for (int i = 0; i < 9; i++) {
            if (board[row][i] == num)
                return false;
            if (board[i][col] == num)
                return false;
        }

        int startRow = row - row % 3;
        int startCol = col - col % 3;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[startRow + i][startCol + j] == num)
                    return false;
            }
        }

        return true;
    }

    public static boolean fillBoard(int[][] board) {

        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {

                if (board[row][col] == 0) {

                    List<Integer> numbers = new ArrayList<>();

                    for (int i = 1; i <= 9; i++)
                        numbers.add(i);

                    Collections.shuffle(numbers); // random order

                    for (int num : numbers) {

                        if (isSafe(board, row, col, num)) {

                            board[row][col] = num;

                            if (fillBoard(board))
                                return true;

                            board[row][col] = 0;
                        }
                    }

                    return false;
                }
            }
        }

        return true;
    }

    public static void printGrid(int[][] grid) {

        for (int i = 0; i < 9; i++) {

            if (i % 3 == 0 && i != 0) {
                System.out.println("------+-------+------");
            }

            for (int j = 0; j < 9; j++) {

                if (j % 3 == 0 && j != 0) {
                    System.out.print("| ");
                }

                if (grid[i][j] == 0)
                    System.out.print("_ ");
                else
                    System.out.print(grid[i][j] + " ");
            }

            System.out.println();
        }
    }

    	public static void fillGrid(int[][] grid, int fillNum) {

		Random rand = new Random();

		boolean success = false;

		while (!success) {

			for (int i = 0; i < 9; i++)
				for (int j = 0; j < 9; j++)
					grid[i][j] = 0;

			int filled = 0;
			int attempts = 0;

			while (filled < fillNum && attempts < 10000) {

				int row = rand.nextInt(9);
				int col = rand.nextInt(9);
				int num = rand.nextInt(9) + 1;

				if (grid[row][col] == 0 && isSafe(grid, row, col, num)) {

					grid[row][col] = num;
					filled++;
				}

				attempts++;
			}

			if (filled == fillNum)
				success = true;
		}
	}

    public static void main(String[] args) {

        int[][] board = new int[9][9];

        // fillBoard(board);

        // printBoard(board);

        fillGrid(board, 81);
        printGrid(board);
    }
}