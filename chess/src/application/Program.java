package application;

import boardgame.Board;

/**
 * Encapsulation Constructors ToString(overriding)
 */
public class Program {

	public static void main(String[] args) {
		Board board = new Board(8, 8);
		System.out.println(board);
	}

}
