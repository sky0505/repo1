package com.jv.basic.factorymode;

public class People implements IAction {

    @Override
    public void move() {
        System.out.println("人两只腿走路");
    }

    public void eat() {
        System.out.println("人吃东西");
    }
}
