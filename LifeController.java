
public class LifeController {

	public static void main(String[] args) {
		LifeBoard board = new LifeBoard(9, 9);
		Life game = new Life(board);
		LifeView window = new LifeView(board);
		window.drawBoard();
		
		while (true) {	
			int command = window.getCommand();
			if (command == 3) {
				System.exit(0);
			}
			if (command == 1) {
				int r = window.getRow();
				int c = window.getCol();
				game.flip(r, c);
				window.update();
			}
			if (command == 2) {
				
				game.newGeneration();
				window.update();
			}
		}

	}

}
