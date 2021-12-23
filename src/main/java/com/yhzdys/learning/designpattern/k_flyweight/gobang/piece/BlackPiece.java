package com.yhzdys.learning.designpattern.k_flyweight.gobang.piece;

import com.yhzdys.learning.designpattern.k_flyweight.gobang.Color;

public class BlackPiece implements Piece {
    // 内部状态，共享
    private final Color color = Color.BLACK;

    @Override
    public void down(int x, int y) {
        System.out.println("down black piece x:" + x + " y:" + y);
    }
}
