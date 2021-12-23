package com.yhzdys.learning.designpattern.k_flyweight.gobang.piece;

import com.yhzdys.learning.designpattern.k_flyweight.gobang.Color;

public class WhitePiece implements Piece {
    // 内部状态，共享
    private final Color color = Color.WHITE;

    @Override
    public void down(int x, int y) {
        System.out.println("down white piece x:" + x + " y:" + y);
    }
}
