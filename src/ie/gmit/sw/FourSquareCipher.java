package ie.gmit.sw;

public class FourSquareCipher {

	private char[][] squareOne = { { 'A', 'B', 'C', 'D', 'E' }, { 'F', 'G', 'H', 'I', 'K' },
			{ 'L', 'M', 'N', 'O', 'P' }, { 'Q', 'R', 'S', 'T', 'U' }, { 'V', 'W', 'X', 'Y', 'Z' }

	};

	private char[][] squareTwo = { { 'Z', 'G', 'P', 'T', 'F' }, { 'O', 'I', 'H', 'M', 'U' },
			{ 'W', 'D', 'R', 'C', 'N' }, { 'Y', 'K', 'E', 'Q', 'A' }, { 'X', 'V', 'S', 'B', 'L' }

	};

	private char[][] squareThree = { { 'M', 'F', 'N', 'B', 'D' }, { 'C', 'R', 'H', 'S', 'A' },
			{ 'X', 'Y', 'O', 'G', 'V' }, { 'I', 'T', 'U', 'E', 'W' }, { 'L', 'Q', 'Z', 'K', 'P' }

	};

	private char[][] squareFour = { { 'A', 'B', 'C', 'D', 'E' }, { 'F', 'G', 'H', 'I', 'K' },
			{ 'L', 'M', 'N', 'O', 'P' }, { 'Q', 'R', 'S', 'T', 'U' }, { 'V', 'W', 'X', 'Y', 'Z' }

	};

	public String encode(String plain) {
		String p = plain.toUpperCase();
		if (plain.length() % 2 == 1) {
			p += "X";
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < p.length(); i += 2) {
			sb.append(cipher_digraph(p.substring(i, i + 2)));
		}
		return sb.toString();
	}

	private String cipher_digraph(String s) {
		assert (s.length() == 2);
		Pair<Integer> row_col1 = compute_pos(s.charAt(0));
		Pair<Integer> row_col2 = compute_pos(s.charAt(1));
		// New Object
		StringBuilder a = new StringBuilder();
		// Appending
		a.append(squareTwo[row_col1.get_first()][row_col2.get_second()]);
		a.append(squareThree[row_col2.get_first()][row_col1.get_second()]);
		return a.toString();
	}

	Pair<Integer> compute_pos(char a) {
		// Compute The Position In The Un-Keyed Square
		if (a == 'J') {
			return compute_pos('I');
		}
		int pos = a - 'A';
		if (pos < 9) {
			Pair<Integer> p = new Pair<Integer>(pos / 5, pos % 5);
			return p;
		} else {
			Pair<Integer> p = new Pair<Integer>((pos - 1) / 5, (pos - 1) % 5);
			return p;
		}
	}
}
