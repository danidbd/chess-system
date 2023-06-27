package Aplication;

import chess.ChessException;
import chess.ChessMach;
import chess.ChessPiece;
import chess.ChessPosition;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        ChessMach chessMach = new ChessMach();
        List<ChessPiece> captured = new ArrayList<>();

        while (! chessMach.getCheckMate()) {
           try{
                UI.clearScreen();

                UI.printMatch(chessMach, captured);
                System.out.println();
                System.out.print("Source: ");
                ChessPosition source = UI.readChessPosition(s);

                boolean[][] possibleMoves = chessMach.possibleMoves(source);
                UI.clearScreen();
                UI.printBoard(chessMach.getPieces(), possibleMoves);

                System.out.println();
                System.out.print("target: ");
                ChessPosition target = UI.readChessPosition(s);

                ChessPiece capturedPiece = chessMach.performChessMove(source, target);
                if (capturedPiece != null){
                    captured.add(capturedPiece);
                }
            }
            catch (ChessException e) {
                    System.out.println(e.getMessage());
               s.nextLine();
            }
            catch (InputMismatchException e) {
               System.out.println(e.getMessage());
                s.nextLine();
            }
        }
        UI.clearScreen();
        UI.printMatch(chessMach,captured);
    }
}
