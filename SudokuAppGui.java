 
// * This program solves a sudoku problem using a recursive 
 //* method that fills the sudoku grid in order by rows and
 //* in each row, in left to right order by cell. It backtracks
 //* when all choices for a cell have been tried and none
 //* lead to a solution.



import java.util.Scanner;
import javax.swing.JOptionPane;


public class SudokuAppGui {
	public static void main(String[] args) {
		printDirections();

		String fname = JOptionPane.showInputDialog("Input file with sudoku problem: ");
		int[][] b = readBoard(fname);
		Sudoku sdk = new SudokuFrame(b);
		System.out.println("Sudoku Puzzle");
		System.out.println(sdk);
		solve(sdk);
	}

	/**
	 * read a 9 x 9 sudoku initial problem
	 * from input file named fname
	 */
	public static int[][] readBoard(String fname)
	{
		Scanner infile = In.openInputFile(fname);
		int[][] b = new int[9][9];

		for(int i = 0; i < 9; i++) {
			for(int j = 0; j < 9; j++) {
				b[i][j] = infile.nextInt();
			}
		}
		return b;
	}


	// Explain program to user.
	public static void printDirections() {
		String msg = 
		"This program solves a Sudoku'\n" +
		"problem, placing missing values so\n" +
		"that each row, column, and 3 x 3 cell\n" +
		"contains exactly the 9 values 1..9";
		
		JOptionPane.showMessageDialog(null, msg);
	}

	/**
	 * pre : Numbers have been filled in for rows 0 through (row - 1)
	 *       and for cells 0 to (col - 1) for this row.
	 * post: recursively searches for a solution filling the remaining
	 *       cells starting at the cell at row, col.
	 *       
	 *       Tries each number 1 - 9 to place in this cell until one is
	 *       found that (a) does not cause a conflict and (b) allows the 
	 *       remaining cells to be filled, giving a solution.
	 *       
	 *       If none can be placed in the cell at row, col that lead to a solution
	 *       then return false. There is no solution.  
	 * 
	 * @param sk
	 * @param row
	 * @param col
	 * @return  true if all rows have been successfully filled.
	 */
	public static boolean explore(Sudoku sk, int row, int col) {
	  // TODO

	}

	// Search for a solution to the sudoku problem with this
	// sudoku instance, reporting result.
	public static void solve(Sudoku sk) {
		if (!explore(sk, 0,0))
			JOptionPane.showMessageDialog(null, "No solution.");
		else {
			JOptionPane.showMessageDialog(null, "Solved!");
			System.out.println("Here is one solution:");
			System.out.println(sk);
		}
	}
}
