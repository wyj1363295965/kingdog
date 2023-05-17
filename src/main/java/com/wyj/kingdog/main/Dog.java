package com.wyj.kingdog.main;

public class Dog extends Animal {

    static {
        System.out.println("33333");
    }

    {
        System.out.println("66666");
    }

    public Dog() {
        System.out.println("44444");
    }

    public static void main(String[] args) {
        Dog dog = new Dog();

    }
}
