package Aplication;

import bordgame.boardgame.board;
import chess.ChessMach;

public class Main {
    public static void main(String[] args) {
        ChessMach chessMach = new ChessMach();
        UI.printboard(chessMach.getPieces());
    }
}