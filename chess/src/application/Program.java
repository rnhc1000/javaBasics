package application;

import chess.ChessMatch;

/**
 * Encapsulation Constructors ToString(overriding)
 */
public class Program {

	public static void main(String[] args) {
		ChessMatch chessMatch = new ChessMatch();
		UI.printBoard(chessMatch.getPieces());
	}

}
