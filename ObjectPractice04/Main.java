package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Person person= new Person();
        Person person1= new Person("森田","奈良");
        Person person2= new Person("木村","埼玉");
        Person person3= new Person("高山","東京");
        Person person4= new Person("茂木","沖縄");


        System.out.print("私の名前は");
        System.out.print(person1.name+"です。 ");
        System.out.print(person1.town);
        System.out.println("出身。");

        System.out.print("私の名前は");
        System.out.print(person2.name+"です。 ");
        System.out.print(person2.town);
        System.out.println("出身。");

        System.out.print("私の名前は");
        System.out.print(person3.name+"です。 ");
        System.out.print(person3.town);
        System.out.println("出身。");

        System.out.print("私の名前は");
        System.out.print(person4.name+"です。 ");
        System.out.print(person4.town);
        System.out.println("出身。");
    }
}
