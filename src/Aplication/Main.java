package Aplication;

import bordgame.Bord;
import bordgame.Position;
import chess.ChessMach;

public class Main {
    public static void main(String[] args) {
        ChessMach chessMach = new ChessMach();
        UI.printBord(chessMach.getPieces());
    }
}