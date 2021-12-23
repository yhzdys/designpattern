package com.yhzdys.learning.designpattern.c_builder;

import com.yhzdys.learning.designpattern.c_builder.product.Computer;

/**
 * 将一个复杂对象的构建与其表示分离，使得同样的构建过程可以创建不同的表示
 */
public class BuilderPattern {

    public static void main(String[] args) {
        Computer computer = new Computer.Builder("AMD Ryzen7 3700X", "Asus Strix B550-i Gaming")
                .setCases("Ghost S1")
                .setRom("WD Black SN750 500G")
                .build();
        System.out.println(computer);
    }
}
