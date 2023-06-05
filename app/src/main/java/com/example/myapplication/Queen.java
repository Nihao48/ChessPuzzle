package com.example.myapplication;

import com.example.myapplication.Coordinates;
import com.example.myapplication.Position;

import java.util.ArrayList;

public class Queen extends Piece{

    public Queen(boolean white) {
        super(white);
    }

    public boolean Killable(int coorX, int coorY, int coorXI, int coorYI, Position[][] board) {
        return board[coorX][coorY].getPiece().isWhite() != board[coorXI][coorYI].getPiece().isWhite();
    }

    @Override
    public ArrayList<Coordinates> AllowedMoves(Coordinates coordinates , Position[][] board){
        ArrayList<Coordinates> allowedMoves = new ArrayList<>();
        Coordinates c;


        for(int i=1 ; i<8 ; i++){
            if((coordinates.getX()+i)<8 && (coordinates.getY()+i)<8){
                if(board[coordinates.getX()+i][coordinates.getY()+i].getPiece() == null){
                    c = new Coordinates(coordinates.getX()+i , coordinates.getY()+i);
                    allowedMoves.add(c);
                } else {
                    if (Killable(coordinates.getX(), coordinates.getY(), coordinates.getX() + i, coordinates.getY() + i, board)) {
                        c = new Coordinates(coordinates.getX() + i, coordinates.getY() + i);
                        allowedMoves.add(c);

                    }
                    break;
                }
            }
        }
        for(int i=1 ; i<8 ; i++){
            if((coordinates.getX()-i)>=0 && (coordinates.getY()+i)<8){
                if(board[coordinates.getX()-i][coordinates.getY()+i].getPiece() == null){
                    c = new Coordinates(coordinates.getX()-i , coordinates.getY()+i);
                    allowedMoves.add(c);
                } else {
                    if (Killable(coordinates.getX(), coordinates.getY(), coordinates.getX() - i, coordinates.getY() + i, board)) {
                        c = new Coordinates(coordinates.getX() - i, coordinates.getY() + i);
                        allowedMoves.add(c);
                    }
                    break;
                }


            }
        }
        for(int i=1 ; i<8 ; i++){
            if((coordinates.getX()-i)>=0 && (coordinates.getY()-i)>=0){
                if(board[coordinates.getX()-i][coordinates.getY()-i].getPiece() == null){
                    c = new Coordinates(coordinates.getX()-i , coordinates.getY()-i);
                    allowedMoves.add(c);
                } else {
                    if (Killable(coordinates.getX(), coordinates.getY(), coordinates.getX() - i, coordinates.getY() - i, board)) {
                        c = new Coordinates(coordinates.getX() - i, coordinates.getY() - i);
                        allowedMoves.add(c);

                    }
                    break;
                }

            }
        }
        for(int i=1 ; i<8 ; i++){
            if((coordinates.getX()+i)<8 && (coordinates.getY()-i)>=0){
                if(board[coordinates.getX()+i][coordinates.getY()-i].getPiece() == null){
                    c = new Coordinates(coordinates.getX()+i , coordinates.getY()-i);
                    allowedMoves.add(c);
                }else{
                    if(Killable(coordinates.getX(),coordinates.getY(),coordinates.getX()+i,coordinates.getY()-i,board)){
                        c = new Coordinates(coordinates.getX()+i , coordinates.getY()-i);
                        allowedMoves.add(c);

                    }
                    break;
                }

            }
        }
        for(int i=(coordinates.getX()+1) ; i<8 ;i++){
            if(board[i][coordinates.getY()].getPiece() == null){
                c = new Coordinates(i , coordinates.getY());
                allowedMoves.add(c);
            }else{
                if(Killable(coordinates.getX(),coordinates.getY(),i,coordinates.getY(),board)){
                    c = new Coordinates(i , coordinates.getY());
                    allowedMoves.add(c);
                }
                break;
            }
        }

        for(int i=(coordinates.getX()-1) ; i>=0 ; i--){
            if(board[i][coordinates.getY()].getPiece() == null){
                c = new Coordinates(i , coordinates.getY());
                allowedMoves.add(c);
            }else{
                if(Killable(coordinates.getX(),coordinates.getY(),i,coordinates.getY(),board)){
                    c = new Coordinates(i , coordinates.getY());
                    allowedMoves.add(c);
                }
                break;
            }
        }

        for(int i=(coordinates.getY()-1) ; i>=0 ; i--){
            if(board[coordinates.getX()][i].getPiece() == null){
                c = new Coordinates( coordinates.getX() , i);
                allowedMoves.add(c);
            }else{
                if(Killable(coordinates.getX(),coordinates.getY(),coordinates.getX(),i,board)){
                    c = new Coordinates( coordinates.getX() , i);
                    allowedMoves.add(c);
                }
                break;
            }
        }

        for(int i=(coordinates.getY()+1) ; i<8 ;i++){
            if(board[coordinates.getX()][i].getPiece() == null){
                c = new Coordinates(coordinates.getX() , i);
                allowedMoves.add(c);
            }else{
                if(Killable(coordinates.getX(),coordinates.getY(),coordinates.getX(),i,board)){
                    c = new Coordinates(coordinates.getX() , i);
                    allowedMoves.add(c);
                }
                break;
            }
        }

        return allowedMoves;
    }

}
