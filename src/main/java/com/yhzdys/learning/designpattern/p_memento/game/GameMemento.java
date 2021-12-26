package com.yhzdys.learning.designpattern.p_memento.game;

/**
 * 游戏分数备忘录
 */
public class GameMemento {
    private final int score;

    public GameMemento(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }
}
