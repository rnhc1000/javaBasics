package application;

import chess.ChessPiece;

public class UI {

	public static void printBoard(ChessPiece[][] pieces) {

		int lenPieces = pieces.length;
		/**
		 * a chess board is a square array....
		 */

		for (int i = 0; i < lenPieces; i++) {
			System.out.print(8 - i + " ");
			for (int j = 0; j < lenPieces; j++) {
				printPiece(pieces[i][j]);
			}
			System.out.print("\n");
		}
		System.out.println("  a b c d e f g h");

	}

	private static void printPiece(ChessPiece piece) {

		if (piece == null) {
			System.out.print("-");
		} else {
			System.out.print(piece);
		}
		System.out.print(" ");
	}

}
