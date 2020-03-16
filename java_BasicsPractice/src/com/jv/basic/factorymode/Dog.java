package com.jv.basic.factorymode;

public class Dog implements IAction {
    @Override
    public void move() {
        System.out.println("狗四条腿走路");
    }
}
