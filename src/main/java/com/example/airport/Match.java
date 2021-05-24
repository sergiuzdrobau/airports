package com.example.airport;

public class Match {
    private int a;
    private int b;
    private int c;
    private int d;


    public Integer ariaPatrat(int a){
        return a*a;
    }

    public Integer perimetruPatrat(int a){
        return 4*a;
    }

    public Integer perimetruDreptunghi(int a, int b){
        return 2 * (a+b);
    }

    public Boolean isEquilateral(int a, int b, int c){
        if ((a==b) & (a==c) & (b==c)){
            return true;
        }
        else return false;
    }


















































    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }

    @Override
    public String toString() {
        return "Match{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", d=" + d +
                '}';
    }
}
