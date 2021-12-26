package com.yhzdys.learning.designpattern.p_iterator;

import com.yhzdys.learning.designpattern.p_iterator.iterator.Iterator;

/**
 * 迭代器模式
 * 提供一种方法顺序访问一个容器对象中的各个元素，而又不需要暴露该对象的内部表示。
 */
public class IteratorPattern {

    public static void main(String[] args) {
        StudentBook studentBook = new StudentBook();

        Iterator<String> iterator = studentBook.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
