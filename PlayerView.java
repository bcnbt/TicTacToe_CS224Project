package CS224;

import java.util.Scanner;

public class PlayerView {
	private static Scanner kb;
	private final Token token;

	static {
		kb = new Scanner(System.in);
	}

	public PlayerView(Token newToken) {
		token = newToken;
	}

	public int askForRow() {
		System.out.println("What row would you like to place a "
				+ token + " in?");
		return Integer.parseInt(kb.nextLine())-1;
	}
	public int askForColumn() {
		System.out.println("What column would you like to place a "
				+ token + " in?");
		return Integer.parseInt(kb.nextLine())-1;
	}

	public Token getToken() {
		return token;
	}

	@Override
	public String toString() {
		return token.printColor();
	}

}
