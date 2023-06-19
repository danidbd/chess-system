package chess;

import bordgame.Bord;
import bordgame.Position;
import chess.pieces.King;
import chess.pieces.Rook;

public class ChessMach {
    private Bord bord;

    public ChessMach(){
        bord = new Bord(8, 8);
        initialSetup();
    }
    public ChessPiece[][] getPieces(){
        ChessPiece[][] mat = new ChessPiece[bord.getRow()][bord.getColumns()];
        for (int i=0; i<bord.getRow(); i++ ){
            for (int j=0; j< bord.getColumns();j++){
                mat[i][j] = (ChessPiece) bord.piece(i, j);
            }
        }
        return mat;
    }
    private void placeNewPiece(char column, int row, ChessPiece piece){
        bord.placePiece(piece, new ChessPositin(column, row).toPosition());
    }
    private void initialSetup(){
        placeNewPiece('b', 6, new Rook(bord, Color.WHITE));
        placeNewPiece('e', 8, new King(bord, Color.BLACK));
        placeNewPiece('e', 1, new King(bord, Color.WHITE));
    }
}
