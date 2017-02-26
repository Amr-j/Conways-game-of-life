public class TestLifeBoard {
	public static void main(String[] args) {
		LifeBoard board = new LifeBoard(4, 4);
		LifeView window = new LifeView(board);
		window.drawBoard();
		
		if (board.getRows() == 4 && board.getCols() == 4) {
			System.out.println("getRows och getCols ok");
		} else {
			System.out.println("Fel vid anrop av getRows eller getCols");
		}	
		
		board.put(0, 0, true);
		board.put(1, 1, false);
		board.put(3, 3, true);
		if (board.get(0, 0) && !board.get(1, 1) && !board.get(-1, -1) && !board.get(3, 3)) {
			System.out.println("put och get ok");
		} else {
			System.out.println("Fel vid anrop av put eller get");
		}
		window.update();
		
		board.increaseGeneration();
		if (board.getGeneration() == 2 ) {
			System.out.println("getGeneration ok");
		} else {
			System.out.println("Fel vid anrop av getGeneration");
		}
		while (true) {	
			if (window.getCommand() == 3) {
				System.exit(0);
			}
		}
	}
}