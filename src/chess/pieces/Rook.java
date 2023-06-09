package chess.pieces;

import bordgame.Bord;
import chess.ChessPiece;
import chess.Color;

public class Rook extends ChessPiece {
    public Rook(Bord bord, Color color) {
        super(bord, color);
    }

    @Override
    public String toString() {
        return "R";
    }
}
