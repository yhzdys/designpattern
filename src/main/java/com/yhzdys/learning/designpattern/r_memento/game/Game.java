package com.yhzdys.learning.designpattern.r_memento.game;

public class Game {
    private int score;

    public GameMemento save() {
        return new GameMemento(this.score);
    }

    public void reloadMemento(GameMemento memento) {
        System.out.println("reload game memento");
        this.score = memento.getScore();
    }

    public void play() {
        System.out.println("start play game~");
        this.score++;
    }

    public void exit() {
        System.out.println("exit game");
        this.score = 0;
    }

    public void showScore() {
        System.out.println("game score: " + this.score);
    }

}
