package ru.mirea.kapatsin.Lab1;
import java.lang.*;
public class Dog {
    public String name;
    public int age;
    public Dog(String n,int a){
        name = n;
        age = a;
    }
    public Dog(String n){
        name = n;
        age = 0;
    }
    public Dog(int a){
        name = "Dog";
        age = a;
    }
    public void setName(String name){
        this.name =name;
    }
    public String getName(String name) {
        return name;
    }
    public void setAge(int age){
        this.age =age;
    }
    public int getAge(int age){
        return age;
    }
    public String toString() {
        return this.name + ", age " + this.age;
    }
    public void intoHumanAge() {
        System.out.println(name + "'s age in human years is " + age * 7 + " years");
    }
}
