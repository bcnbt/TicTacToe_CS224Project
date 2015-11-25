package CS224;

public enum Square {
	A('A'), B('B'), C('C'), D('D'), E('E'), F('F'), G('G'), H('H'), I('I');

	private final char letter;

	Square(char ch) {
		letter = ch;
	}

	char printLetter() {
		return letter;
	}

	public int getRow() {
		if (letter == 'A')
			return 3;
		if (letter == 'B')
			return 3;
		if (letter == 'C')
			return 3;
		if (letter == 'D')
			return 2;
		if (letter == 'E')
			return 2;
		if (letter == 'F')
			return 2;
		if (letter == 'G')
			return 1;
		if (letter == 'H')
			return 1;
		if (letter == 'I')
			return 1;
		return 0;
	}
	public int getColumn() {
		if (letter == 'A')
			return 1;
		if (letter == 'B')
			return 2;
		if (letter == 'C')
			return 3;
		if (letter == 'D')
			return 1;
		if (letter == 'E')
			return 2;
		if (letter == 'F')
			return 3;
		if (letter == 'G')
			return 1;
		if (letter == 'H')
			return 2;
		if (letter == 'I')
			return 3;
		return 0;
	}

	public static Object nextLetter() {
		// TODO Auto-generated method stub
		return null;
	}
}

