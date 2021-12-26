package com.yhzdys.learning.designpattern.p_iterator;

import com.yhzdys.learning.designpattern.p_iterator.iterator.Iterable;
import com.yhzdys.learning.designpattern.p_iterator.iterator.Iterator;

import java.util.ArrayList;
import java.util.List;

public class StudentBook implements Iterable<String> {
    private final List<String> students = new ArrayList<>();

    public StudentBook() {
        students.add("张三");
        students.add("李四");
        students.add("王五");
    }

    @Override
    public Iterator<String> iterator() {
        return new StudentBookIterator();
    }

    private class StudentBookIterator implements Iterator<String> {
        private int index = 0;

        @Override
        public boolean hasNext() {
            return this.index < students.size();
        }

        @Override
        public String next() {
            String name = students.get(this.index);
            this.index++;
            return name;
        }
    }
}
