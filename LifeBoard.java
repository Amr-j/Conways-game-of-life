public class LifeBoard {
	private int rows, cols, gen;	
	public boolean[][] theBoard; 

	/** Skapar en spelplan med rows rader och cols kolonner. Spelplanen �r fr�n
	    b�rjan tom, dvs alla rutorna �r tomma och generationsnumret �r 1. */	
	public LifeBoard(int rows, int cols) {
		this.rows = rows;
		this.cols = cols;
		theBoard = new boolean[rows+2][cols+2];
		this.gen = 1;
	}

	/** Ger true om det finns en individ i rutan med index row, col, false annars. 
	    Om index row, col �r utanf�r spelplanen returneras false */
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

	/** Lagrar v�rdet val i rutan med index row, col */
	public void put(int row, int col, boolean val) {
		row = row + 1;
		col = col + 1;
		if(row >= 0 && col >= 0) {
			if (row <= this.rows && col <= this.cols) { 
				theBoard[row][col] = val;
			}
		}
	}

	/** Tar reda p� antalet rader */
	public int getRows() {
		return this.rows;
	}

 	/** Tar reda p� antalet kolonner */
	public int getCols() {
		return this.cols;
	}

	/** Tar reda p� aktuellt generationsnummer */
	public int getGeneration() {
		return this.gen;
	}

	/** �kar generationsnumret med ett */
	public void increaseGeneration() {
		gen++;
	}
}