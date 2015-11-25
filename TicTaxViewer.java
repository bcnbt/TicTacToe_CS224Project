package CS224;

import CS224.ColumnFullException;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TicTaxViewer {
	private TicTax mainboard;
	private PlayerView player1;
	private PlayerView player2;
	private PlayerView currentPlayer;

	public TicTaxViewer() {
		super();
		mainboard = new TicTax();
		player1 = new PlayerView(Token.X);
		player2 = new PlayerView(Token.O);
		currentPlayer = player1;
	}

	public void printBoard() {
		System.out.println(mainboard);
	}

	public void play() throws ColumnFullException {
		currentPlayer = player1;
		while (true) {
			printBoard();
			int column = currentPlayer.askForColumn();
			int row = currentPlayer.askForRow();
			try {
				mainboard.dropToken(column, row, currentPlayer.getToken());
			} catch (ColumnFullException e) {
				System.out.println("Column " + column + " is full. Try again.");
				continue;
			}
		if (mainboard.hasPlayerWon(currentPlayer.getToken(), column ,row)) {
				printBoard();
				displayWinningOutput();
				 break;
			}
			currentPlayer = swapPlayer();
		}
	}
	

	private void displayWinningOutput() {
		System.out.println("The " + currentPlayer + " has won.");
	}

	private PlayerView swapPlayer() {
		if (currentPlayer == player1) {
			return player2;
		} else
			return player1;

	}

	public void actionPerformed(WinnerActionEvent arg0) {

	}
}

