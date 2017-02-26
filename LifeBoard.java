public class LifeBoard {
	private int rows, cols, gen;	
	public boolean[][] theBoard; 

	/** Creates the game's board with rows and columns cols. The board is empty in the beginning, with all squares
	    empty and generation number is 1. */	
	public LifeBoard(int rows, int cols) {
		this.rows = rows;
		this.cols = cols;
		theBoard = new boolean[rows+2][cols+2];
		this.gen = 1;
	}

	/** Returns true if there is a living cell with index row, col, otherwise returns false. 
	    If index row, col is outside of the board false is returned */
	public boolean get(int row, int col) {
		row = row + 1;
		col = col + 1;
		if(row >= 1 && col >= 1) {
			if(row <= this.rows && col <= this.cols) { 
				return theBoard[row][col];
			}
		}
		return false;
	}

	/** Stores value val in the square with index row, col */
	public void put(int row, int col, boolean val) {
		row = row + 1;
		col = col + 1;
		if(row >= 0 && col >= 0) {
			if (row <= this.rows && col <= this.cols) { 
				theBoard[row][col] = val;
			}
		}
	}

	/** Returns number of rows */
	public int getRows() {
		return this.rows;
	}

 	/** Returns number of columns */
	public int getCols() {
		return this.cols;
	}

	/** Returns the current generation number */
	public int getGeneration() {
		return this.gen;
	}

	/** Increase generation number with 1 */
	public void increaseGeneration() {
		gen++;
	}
}
