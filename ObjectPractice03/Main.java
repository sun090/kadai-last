package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(20);
        System.out.println(circle1.getArea());
        System.out.println(circle1.getCircumference());
        System.out.println(circle2.getArea());
        System.out.println(circle2.getCircumference());
    }
}
