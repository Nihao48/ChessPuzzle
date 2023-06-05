package com.example.myapplication;

import java.util.ArrayList;

import com.example.myapplication.Coordinates;
import com.example.myapplication.Position;

public class King extends Piece {

    public King(boolean white) {
        super( white);
    }

    @Override
    public ArrayList<Coordinates> AllowedMoves(Coordinates coordinates , Position[][] board){
        ArrayList<Coordinates> allowedMoves = new ArrayList<>();
        allowedMoves.clear();
        Coordinates c;

        if((coordinates.getX()+1) <8 && (coordinates.getY()+1)<8){
            if(board[coordinates.getX()+1][coordinates.getY()+1].getPiece() == null){
                c = new Coordinates(coordinates.getX()+1 , coordinates.getY()+1);
                allowedMoves.add(c);
            }else{
                if(Killable(coordinates.getX(),coordinates.getY(), coordinates.getX() + 1, coordinates.getY() + 1, board)){
                    c = new Coordinates(coordinates.getX()+1 , coordinates.getY()+1);
                    allowedMoves.add(c);
                }
            }
        }

        if((coordinates.getY()+1)<8){
            if(board[coordinates.getX()][coordinates.getY()+1].getPiece() == null){
                c = new Coordinates(coordinates.getX() , coordinates.getY()+1);
                allowedMoves.add(c);
            }else{
                if(Killable(coordinates.getX(),coordinates.getY(), coordinates.getX(), coordinates.getY() + 1, board)){
                    c = new Coordinates(coordinates.getX() , coordinates.getY()+1);
                    allowedMoves.add(c);
                }
            }
        }

        if((coordinates.getX()-1) >=0 && (coordinates.getY()+1)<8){
            if(board[coordinates.getX()-1][coordinates.getY()+1].getPiece() == null){
                c = new Coordinates(coordinates.getX()-1 , coordinates.getY()+1);
                allowedMoves.add(c);
            }else{
                if(Killable(coordinates.getX(),coordinates.getY(), coordinates.getX() - 1, coordinates.getY() + 1, board)){
                    c = new Coordinates(coordinates.getX()-1 , coordinates.getY()+1);
                    allowedMoves.add(c);
                }
            }
        }

        if((coordinates.getX()+1) <8 ){
            if(board[coordinates.getX()+1][coordinates.getY()].getPiece() == null){
                c = new Coordinates(coordinates.getX()+1 , coordinates.getY());
                allowedMoves.add(c);
            }else{
                if(Killable(coordinates.getX(),coordinates.getY(), coordinates.getX() + 1, coordinates.getY(), board)){
                    c = new Coordinates(coordinates.getX()+1 , coordinates.getY());
                    allowedMoves.add(c);
                }
            }
        }

        if((coordinates.getX()-1) <8 ){
            if(board[coordinates.getX()-1][coordinates.getY()].getPiece() == null){
                c = new Coordinates(coordinates.getX()-1 , coordinates.getY());
                allowedMoves.add(c);
            }else{
                if(Killable(coordinates.getX(),coordinates.getY(), coordinates.getX() - 1, coordinates.getY(), board)){
                    c = new Coordinates(coordinates.getX()-1 , coordinates.getY());
                    allowedMoves.add(c);
                }
            }
        }

        if((coordinates.getX()+1) <8 && (coordinates.getY()-1)>=0){
            if(board[coordinates.getX()+1][coordinates.getY()-1].getPiece() == null){
                c = new Coordinates(coordinates.getX()+1 , coordinates.getY()-1);
                allowedMoves.add(c);
            }else{
                if(Killable(coordinates.getX(),coordinates.getY(), coordinates.getX() + 1, coordinates.getY() - 1, board)){
                    c = new Coordinates(coordinates.getX()+1 , coordinates.getY()-1);
                    allowedMoves.add(c);
                }
            }
        }

        if((coordinates.getY()-1)>=0){
            if(board[coordinates.getX()][coordinates.getY()-1].getPiece() == null){
                c = new Coordinates(coordinates.getX() , coordinates.getY()-1);
                allowedMoves.add(c);
            }else{
                if(Killable(coordinates.getX(),coordinates.getY(), coordinates.getX(), coordinates.getY() - 1, board)){
                    c = new Coordinates(coordinates.getX() , coordinates.getY()-1);
                    allowedMoves.add(c);
                }
            }
        }

        if((coordinates.getX()-1) <8 && (coordinates.getY()-1)>=0){
            if(board[coordinates.getX()-1][coordinates.getY()-1].getPiece() == null){
                c = new Coordinates(coordinates.getX()-1 , coordinates.getY()-1);
                allowedMoves.add(c);
            }else{
                if(Killable(coordinates.getX(),coordinates.getY(), coordinates.getX() - 1, coordinates.getY() - 1, board)){
                    c = new Coordinates(coordinates.getX()-1 , coordinates.getY()-1);
                    allowedMoves.add(c);
                }
            }
        }



        return allowedMoves;
    }
}
