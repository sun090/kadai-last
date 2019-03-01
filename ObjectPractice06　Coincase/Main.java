package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here


        Coincase circle2 = new Coincase(2,4,1,4,1,5);

        System.out.println();

        System.out.println("500円は"+circle2.getArea500()+"枚");
        System.out.println("100円は"+circle2.getArea100()+"枚");
        System.out.println("50円は"+circle2.getArea50()+"枚");
        System.out.println("100円は"+circle2.getArea10()+"枚");
        System.out.println("5円は"+circle2.getArea5()+"枚");
        System.out.println("1円は"+circle2.getArea1()+"枚");

        System.out.println("合計："+circle2.getArea()+"円");
        //System.out.println(circle2.getCircumference());

        System.out.println(circle2.jpy500);
        int i=0;int y500=0;int y100=0;int y50=0;int y10=0;int y5=0;
        while (i<6){

        System.out.println("金額入力して");
        Scanner scanner1 = new Scanner(System.in);
            int gaku1=scanner1.nextInt();
        Scanner scannerm1 = new Scanner(System.in);
        System.out.println("枚数入力して");
            int mai1=scannerm1.nextInt();



          if(gaku1==500){y500=y500+mai1;}
            if(gaku1==100){y100=y100+mai1;}
            if(gaku1==50){y50=y50+mai1;}
            if(gaku1==10){y10=y10+mai1;}
            if(gaku1==5){y5=y5+mai1;}




        System.out.println("入力内容："+gaku1+"円"+mai1+"枚");i++;}


        System.out.println("500円玉"+y500+"枚");
        System.out.println("100円玉"+y100+"枚");
        System.out.println("50円玉"+y50+"枚");
        System.out.println("10円玉"+y10+"枚");
        System.out.println("5円玉"+y5+"枚");
        int total=y500*500+y100*100+y50*50+y10*10+y5*5;
        System.out.println("合計"+total+"円");

    }
}
