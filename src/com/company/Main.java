package com.company;

public class Main {

    public static void main(String[] args) {
        Operator op = new Operator(new StringBuilder("2+12/2+3*7"));
        Result r = new Result(op.Calculator(),true);
        r.display();
    }
}
