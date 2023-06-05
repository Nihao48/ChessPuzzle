package com.example.myapplication;

import com.example.myapplication.Coordinates;
import com.example.myapplication.Position;

import java.util.ArrayList;

public class Knight extends Piece{

    public Knight(boolean white) {
        super(white);
    }
    public boolean Killable(int coorX, int coorY, int coorXI, int coorYI, Position[][] board) {
        return board[coorX][coorY].getPiece().isWhite() != board[coorXI][coorYI].getPiece().isWhite();
    }

    @Override
    public ArrayList<Coordinates> AllowedMoves(Coordinates coordinates , Position[][] board){
        ArrayList<Coordinates> allowedMoves = new ArrayList<>();
        allowedMoves.clear();
        Coordinates c;

        if (coordinates.getX()+2 <8 && coordinates.getY()-1 >=0){
            if(board[coordinates.getX()+2][coordinates.getY()-1].getPiece() ==null || Killable(coordinates.getX(),coordinates.getY(),coordinates.getX() + 2, coordinates.getY() - 1, board)) {
                c = new Coordinates(coordinates.getX() + 2, coordinates.getY() - 1);
                allowedMoves.add(c);
            }
        }

        if (coordinates.getX()+1 <8 && coordinates.getY()-2 >=0) {
            if (board[coordinates.getX() + 1][coordinates.getY() - 2].getPiece() == null || Killable(coordinates.getX(), coordinates.getY(), coordinates.getX() + 1, coordinates.getY() - 2, board)) {
                c = new Coordinates(coordinates.getX() + 1, coordinates.getY() - 2);
                allowedMoves.add(c);
            }
        }

        if (coordinates.getX() - 2 >= 0 && coordinates.getY() - 1 >= 0) {
            if (board[coordinates.getX() - 2][coordinates.getY() - 1].getPiece() == null || Killable(coordinates.getX(), coordinates.getY(), coordinates.getX() - 2, coordinates.getY() - 1, board)) {
                c = new Coordinates(coordinates.getX() - 2, coordinates.getY() - 1);
                allowedMoves.add(c);
            }
        }

        if (coordinates.getX() - 1 >= 0 && coordinates.getY() - 2 >= 0) {
            if (board[coordinates.getX() - 1][coordinates.getY() - 2].getPiece() == null || Killable(coordinates.getX(), coordinates.getY(), coordinates.getX() - 1, coordinates.getY() - 2, board)) {
                c = new Coordinates(coordinates.getX() - 1, coordinates.getY() - 2);
                allowedMoves.add(c);
            }
        }

        if (coordinates.getX() + 2 < 8 && coordinates.getY() + 1 < 8) {
            if (board[coordinates.getX() + 2][coordinates.getY() + 1].getPiece() == null || Killable(coordinates.getX(), coordinates.getY(), coordinates.getX() + 2, coordinates.getY() + 1, board)) {
                c = new Coordinates(coordinates.getX() + 2, coordinates.getY() + 1);
                allowedMoves.add(c);
            }
        }

        if (coordinates.getX() + 1 < 8 && coordinates.getY() + 2 < 8) {
            if (board[coordinates.getX() + 1][coordinates.getY() + 2].getPiece() == null || Killable(coordinates.getX(), coordinates.getY(), coordinates.getX() + 1, coordinates.getY() + 2, board)) {
                c = new Coordinates(coordinates.getX() + 1, coordinates.getY() + 2);
                allowedMoves.add(c);
            }
        }

        if (coordinates.getX() - 2 >= 0 && coordinates.getY() + 1 < 8) {
            if (board[coordinates.getX() - 2][coordinates.getY() + 1].getPiece() == null || Killable(coordinates.getX(), coordinates.getY(), coordinates.getX() - 2, coordinates.getY() + 1, board)) {
                c = new Coordinates(coordinates.getX() - 2, coordinates.getY() + 1);
                allowedMoves.add(c);
            }
        }

        if (coordinates.getX() - 1 >= 0 && coordinates.getY() + 2 < 8) {
            if (board[coordinates.getX() - 1][coordinates.getY() + 2].getPiece() == null || Killable(coordinates.getX(), coordinates.getY(), coordinates.getX() - 1, coordinates.getY() + 2, board)) {
                c = new Coordinates(coordinates.getX() - 1, coordinates.getY() + 2);
                allowedMoves.add(c);
            }
        }

                return allowedMoves;
            }
        }
