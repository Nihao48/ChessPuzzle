package com.example.myapplication;


import com.example.myapplication.Coordinates;
import com.example.myapplication.Position;

import java.util.ArrayList;

public class Piece {
    public boolean Killable(int coorX, int coorY, int coorXI, int coorYI, Position[][] board) {
        return board[coorX][coorY].getPiece().isWhite() != board[coorXI][coorYI].getPiece().isWhite();
    }

    private boolean isWhite;
    Piece(boolean isWhite) {
        this.isWhite = isWhite;
    }

    public ArrayList<Coordinates> AllowedMoves(Coordinates coordinates , Position[][] board){
        ArrayList<Coordinates> allowedMoves = new ArrayList<>();
        Coordinates c;
        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                c = new Coordinates(i,j);
                allowedMoves.add(c);
            }
        }
        return allowedMoves;
    }
    public boolean isWhite() {
        return isWhite;
    }
    public void setWhite(boolean isWhite){ this.isWhite=isWhite; }
}