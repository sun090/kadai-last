package com.company;

public class Coincase {
    public int jpy500;
    public int jpy100;
    public int jpy50;
    public int jpy10;
    public int jpy5;
    public int jpy1;

    public Coincase() {
        this.jpy1 = 5;
    }

    public Coincase(int jpy500,int jpy100,int jpy50,int jpy10,int jpy5,int jpy1) {
        this.jpy500 = jpy500;
        this.jpy100=jpy100;
        this.jpy50=jpy50;
        this.jpy10=jpy10;
        this.jpy5=jpy5;
        this.jpy1=jpy1;


    }

    public double getArea() {
        return (jpy500* 500+jpy100*100+jpy50*50+jpy10*10+jpy5*5+jpy1*1 );
    }
    public double getArea500() {
        return (jpy500 );
    }
    public double getArea100() {
        return (jpy100 );
    }
    public double getArea50() {
        return (jpy50 );
    }
    public double getArea10() {
        return (jpy10 );
    }
    public double getArea5() {
        return (jpy5 );
    }
    public double getArea1() {
        return (jpy1 );
    }





    public double getCircumference() {
        return (2 * jpy500 * 3.14);
    }
}
