package com.jv.basic.test;

import com.jv.basic.factorymode.AnimalFactory;
import com.jv.basic.factorymode.IAction;
import com.jv.basic.factorymode.People;

public class TestFactory {
    public static void main(String[] args) {
        People people = (People) AnimalFactory.getPeople();
        people.move();
        people.eat();
    }
}
