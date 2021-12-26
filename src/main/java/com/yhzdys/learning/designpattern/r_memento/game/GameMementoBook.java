package com.yhzdys.learning.designpattern.r_memento.game;

import java.util.ArrayList;
import java.util.List;

public class GameMementoBook {
    private final List<GameMemento> mementos = new ArrayList<>();

    public void save(GameMemento memento) {
        this.mementos.add(memento);
    }

    public GameMemento get(int index) {
        return this.mementos.get(index);
    }
}
