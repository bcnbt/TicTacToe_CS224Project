package CS224;

import java.util.Arrays;

import CS224.ColumnFullException;
import CS224.Token;

public class TicTax {
	private final static int rows = 3;
	private final static int columns = 3;
	private Token[][] board;

	public TicTax() {
		board = new Token[columns][rows];
		for (Token[] row : board) {
			Arrays.fill(row, Token.EMPTY);
		}
	}

	public void dropToken(int column, int row ,Token token) throws ColumnFullException {
		board[row][column] = token;
	}

	@Override
	public String toString() {
		String output = "";
		for (int i = 0; i < rows; i++) {
			output = createLine(i) + output;
		}
		return output;
	}

	public String createLine(int i) {
		String line = "  ";
		for (int j = 0; j < columns; j++) {
			line = line + board[i][j].printLetter() + " ";
		}
		return line + "\n";
	}

	public boolean hasPlayerWon(Token token, int column , int row)
			throws ColumnFullException {
		return VerticalWin(token, row) || horizontalWin(token, column)
				|| leftDownRightUpWin(token, column)
				|| LeftUpRightDownWin(token, column);
	}

	private boolean horizontalWin(Token token, int column) {
		return (board[column][2] != Token.EMPTY && board[column][2] == board[column][1]
				&& board[column][1] == board[column][0]);
		
	}

	private boolean VerticalWin(Token token, int row){
		return ((board[0][row] != Token.EMPTY && board[0][row] == board[1][row]
					&& board[1][row] == board[2][row]));
			
	}

	private boolean LeftUpRightDownWin(Token token, int column){
			return (board[0][2] != Token.EMPTY && board[0][2] == board[1][1]
					&& board[1][1] == board[2][0]);
	}

	private boolean leftDownRightUpWin(Token token, int column){
		return (board[0][0] != Token.EMPTY && board[0][0] == board[1][1]
				&& board[1][1] == board[2][2]);
	}
	
	private int findLowestEmptyPosition(int column) throws ColumnFullException {
		for (int i = 0; i < rows; i++) {
			if (board[i][column] == Token.EMPTY) {
				return i;
			}
		}
		throw new ColumnFullException();
	}

	private int getMiddle(int column) throws ColumnFullException {
		return 3;
	}

} 
