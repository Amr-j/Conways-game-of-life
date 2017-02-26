
public class Life {
	private LifeBoard board;
	
	
	public Life(LifeBoard board){
		this.board = board;
	}
	
	public void flip(int row, int col){
		board.put(row, col, !board.get(row, col));
	}
	
	public void newGeneration(){
		boolean[][] temp = new boolean[board.getRows()][board.getCols()];
		for (int i = 0; i < board.getRows(); i++){
			for (int j = 0; j < board.getCols(); j++){
				int livingNeighbors = getNeighbours(board, i, j);
				if (board.get(i, j)) {
					if (livingNeighbors == 2 || livingNeighbors == 3){
						temp[i][j] = true;
					}
					if (livingNeighbors > 3 || livingNeighbors < 2){
						temp[i][j] = false;
					}
				} else {
					if (livingNeighbors == 3) temp[i][j] = true;
				}
			}
		}
		for (int i = 0; i < board.getRows(); i++) { 
			for (int j = 0; j < board.getCols(); j++ ) {
				board.put(i, j, temp[i][j]);
			}
		}
		board.increaseGeneration();
	}
	
	private int getNeighbours(LifeBoard board, int row, int col){
		int count = 0;
		for (int i = row-1; i <= row+1; i++){
			for (int j = col-1; j <= col + 1; j++){
				if ( i != row || j != col) { 
					if(board.get(i, j)) count++;
				}
			}
		}
		return count;
	}

}
