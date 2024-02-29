
package chess.system;

import chess.ChessMatch;


public class ChessSystem {

    
    public static void main(String[] args) {
        
        ChessMatch chessMatch = new ChessMatch();
        UI.printBoard(chessMatch.getPieces());
    }
    
}
