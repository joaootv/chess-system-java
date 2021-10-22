package application;

import chess.ChessMatch;

public class Program {

	public static void main(String[] args) {
		
		ChessMatch chassMatch = new ChessMatch();
		UI.printBoard(chassMatch.getPieces());
	}

}
