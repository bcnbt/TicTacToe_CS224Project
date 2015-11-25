package CS224;

public enum Token {
	X('X'), O('O'), EMPTY(' ');

	private final char letter;

	Token(char ch) {
		letter = ch;
	}

	char printLetter() {
		return letter;
	}

	public String printColor() {
		if (letter == 'X')
			return "X";
		if (letter == 'O')
			return "O";
		return "";
	}
}
