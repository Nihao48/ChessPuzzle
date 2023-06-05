package com.example.myapplication;

import com.example.myapplication.Coordinates;
import com.example.myapplication.Position;

import java.util.ArrayList;

public class Pawn extends Piece{

    public Pawn(boolean white) {
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

        if(board[coordinates.getX()][coordinates.getY()].getPiece().isWhite()){

            if(coordinates.getX()<8 && coordinates.getX()>=0 && (coordinates.getY()-1)<8 && (coordinates.getY()-1)>=0){
                if(board[coordinates.getX()][coordinates.getY()-1].getPiece()==null){
                    c=new Coordinates(coordinates.getX() , coordinates.getY() - 1);
                    allowedMoves.add(c);

                    if((coordinates.getY() == 6) && (board[coordinates.getX()][coordinates.getY() - 2].getPiece() == null)){
                        c = new Coordinates(coordinates.getX(), coordinates.getY() - 2);
                        allowedMoves.add(c);
                    }
                }
            }

            if((coordinates.getX()+1)<8 && (coordinates.getX()+1)>=0 && (coordinates.getY()-1)<8 && (coordinates.getY()-1)>=0) {
                if (board[coordinates.getX() + 1][coordinates.getY() - 1].getPiece() != null) {
                    if(Killable(coordinates.getX(),coordinates.getY(), coordinates.getX() + 1, coordinates.getY() - 1, board)){
                        c = new Coordinates(coordinates.getX() + 1, coordinates.getY() - 1);
                        allowedMoves.add(c);
                    }
                }

            }

            if((coordinates.getX()-1)<8 && (coordinates.getX()-1)>=0 && (coordinates.getY()-1)<8 && (coordinates.getY()-1)>=0) {
                if (board[coordinates.getX() - 1][coordinates.getY() - 1].getPiece() != null) {
                    if(Killable(coordinates.getX(),coordinates.getY(), coordinates.getX() - 1, coordinates.getY() - 1, board)){
                        c = new Coordinates(coordinates.getX() - 1, coordinates.getY() - 1);
                        allowedMoves.add(c);
                    }
                }
            }

        }else{

            if((coordinates.getX())<8 && (coordinates.getX())>=0 && (coordinates.getY()+1)<8 && (coordinates.getY()+1)>=0) {
                if (board[coordinates.getX()][coordinates.getY() + 1].getPiece() == null) {
                    c = new Coordinates(coordinates.getX(), coordinates.getY() + 1);
                    allowedMoves.add(c);

                    if(coordinates.getY() == 1 && (board[coordinates.getX()][coordinates.getY() + 2].getPiece() == null)){
                        c = new Coordinates(coordinates.getX(), coordinates.getY() + 2);
                        allowedMoves.add(c);
                    }
                }
            }

            if((coordinates.getX()+1)<8 && (coordinates.getX()+1)>=0 && (coordinates.getY()+1)<8 && (coordinates.getY()+1)>=0) {
                if (board[coordinates.getX() + 1][coordinates.getY() + 1].getPiece() != null) {
                    if(Killable(coordinates.getX(),coordinates.getY(), coordinates.getX() + 1, coordinates.getY() + 1, board)){
                        c = new Coordinates(coordinates.getX() + 1, coordinates.getY() + 1);
                        allowedMoves.add(c);
                    }
                }
            }

            if((coordinates.getX()-1)<8 && (coordinates.getX()-1)>=0 && (coordinates.getY()+1)<8 && (coordinates.getY()+1)>=0) {
                if (board[coordinates.getX() - 1][coordinates.getY() + 1].getPiece() != null) {
                    if(Killable(coordinates.getX(),coordinates.getY(), coordinates.getX() - 1, coordinates.getY() + 1, board)){
                        c = new Coordinates(coordinates.getX() - 1, coordinates.getY() + 1);
                        allowedMoves.add(c);
                    }
                }
            }

        }

        return allowedMoves;
    }
}
