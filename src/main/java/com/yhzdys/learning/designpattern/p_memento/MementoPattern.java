package com.yhzdys.learning.designpattern.p_memento;

import com.yhzdys.learning.designpattern.p_memento.game.Game;
import com.yhzdys.learning.designpattern.p_memento.game.GameMemento;
import com.yhzdys.learning.designpattern.p_memento.game.GameMementoBook;

/**
 * 备忘录模式
 * 在不破坏封闭的前提下捕获一个对象的内部状态，并在该对象之外保存这个状态，从而可以将对象恢复到原先保存的状态
 */
public class MementoPattern {

    public static void main(String[] args) {
        GameMementoBook gameMementoBook = new GameMementoBook();
        Game game = new Game();

        game.play();
        game.play();
        game.showScore();
        GameMemento memento1 = game.save();
        gameMementoBook.save(memento1);
        game.exit();
        game.showScore();

        game.reloadMemento(gameMementoBook.get(0));
        game.showScore();
    }

}
