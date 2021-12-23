package com.yhzdys.learning.designpattern.k_flyweight.gobang;

import com.yhzdys.learning.designpattern.k_flyweight.gobang.piece.BlackPiece;
import com.yhzdys.learning.designpattern.k_flyweight.gobang.piece.Piece;
import com.yhzdys.learning.designpattern.k_flyweight.gobang.piece.WhitePiece;

import java.util.HashMap;
import java.util.Map;

public class PieceBox {
    private static final Map<Color, Piece> box = new HashMap<>();

    static {
        box.put(Color.BLACK, new BlackPiece());
        box.put(Color.WHITE, new WhitePiece());
    }

    public static Piece getPiece(Color color) {
        return box.get(color);
    }
}
