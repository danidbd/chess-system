package chess;

import bordgame.Bord;

public class ChessMach {
    private Bord bord;

    public ChessMach(){
        bord = new Bord(8, 8);
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
}
