package ru.mirea.kapatsin.Lab1;
import java.lang.*;
public class TestDog {
    public static void main(String[] args) {
        Dog d1 = new Dog("Bob", 3);
        Dog d2 = new Dog("Jack", 11);
        Dog d3 = new Dog("Graf");
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        d1.intoHumanAge();
        d2.intoHumanAge();
        d3.intoHumanAge();
    }
}
