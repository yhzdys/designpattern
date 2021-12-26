package com.yhzdys.learning.designpattern.k_flyweight;

import com.yhzdys.learning.designpattern.k_flyweight.gobang.Color;
import com.yhzdys.learning.designpattern.k_flyweight.gobang.PieceBox;
import com.yhzdys.learning.designpattern.k_flyweight.gobang.piece.Piece;

/**
 * 享元模式
 * 允许使用对象共享来有效地支持大量细粒度对象
 */
public class FlyweightPattern {

    public static void main(String[] args) {
        Piece piece1 = PieceBox.getPiece(Color.BLACK);
        piece1.down(1, 2);

        Piece piece2 = PieceBox.getPiece(Color.WHITE);
        piece2.down(2, 2);

        Piece piece3 = PieceBox.getPiece(Color.BLACK);
        piece3.down(3, 2);

        Piece piece4 = PieceBox.getPiece(Color.WHITE);
        piece4.down(1, 2);

        System.out.println(piece1 == piece3);
        System.out.println(piece2 == piece4);
    }
}
