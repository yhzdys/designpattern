package com.yhzdys.learning.designpattern.c_builder.product;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Computer {

    private String cpu;
    private String motherBoard;
    private String ram;
    private String rom;
    private String cases;

    public Computer(Builder builder) {
        this.cpu = builder.cpu;
        this.motherBoard = builder.motherBoard;
        this.ram = builder.ram;
        this.rom = builder.rom;
        this.cases = builder.cases;
    }

    public static class Builder {
        private final String cpu;
        private final String motherBoard;

        private String ram;
        private String rom;
        private String cases;

        public Builder(String cpu, String motherBoard) {
            this.cpu = cpu;
            this.motherBoard = motherBoard;
        }

        public Computer build() {
            return new Computer(this);
        }

        public Builder setRam(String ram) {
            this.ram = ram;
            return this;
        }

        public Builder setRom(String rom) {
            this.rom = rom;
            return this;
        }

        public Builder setCases(String cases) {
            this.cases = cases;
            return this;
        }
    }
}
