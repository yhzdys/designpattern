package com.yhzdys.learning.designpattern.o_interpreter;

import com.yhzdys.learning.designpattern.o_interpreter.interpreter.AndExpression;
import com.yhzdys.learning.designpattern.o_interpreter.interpreter.OrExpression;
import com.yhzdys.learning.designpattern.o_interpreter.interpreter.TerminalExpression;

/**
 * 解释器模式
 * <p>
 * 提供了评估语言的语法或表达式的方式，它属于行为型模式。
 * 这种模式实现了一个表达式接口，该接口解释一个特定的上下文。这种模式被用在 SQL 解析、符号处理引擎等。
 */
public class InterpreterPattern {

    public static void main(String[] args) {
        TerminalExpression expression1 = new TerminalExpression("张三");
        TerminalExpression expression2 = new TerminalExpression("李四");
        AndExpression andExpression = new AndExpression(expression1, expression2);
        OrExpression orExpression = new OrExpression(expression1, expression2);
        System.out.println(andExpression.interpret("张三"));
        System.out.println(orExpression.interpret("张三"));
    }
}
