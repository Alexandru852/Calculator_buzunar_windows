package com.company;

public class Result
{
    final double value;
    final boolean validity;

    public Result(double val, boolean valid) {
        if (valid) {
            validity = true;
            value = val;
        } else {
            validity = false;
            value = 0;
        }
    }

    public void display() {
        if (validity) {
            System.out.println(" " + Double.toString(value) + " ");
        } else {
            System.out.println(" ERR operatie! ");
        }
    }

}
