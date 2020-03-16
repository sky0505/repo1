package com.jv.basic.factorymode;

public class AnimalFactory {
    public static IAction getPeople(){
        return new People();
    }
    public static IAction getDog(){
        return new Dog();
    }
}
