package com.yhzdys.learning.designpattern.o_interpreter.interpreter;

public class TerminalExpression implements Expression {
    private String data;

    public TerminalExpression(String date) {
        this.data = date;
    }

    @Override
    public boolean interpret(String context) {
        return context.contains(this.data);
    }
}
