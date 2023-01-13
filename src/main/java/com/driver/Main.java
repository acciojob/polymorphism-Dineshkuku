package com.driver;

public class Main {
    public static void main(String[] args) {
        Product p = new Product();
        int x=0,y=0,z=0;
        double a=0,b=0;

        p.product(x,y);
        p.product(x,y,z);
        p.product(a, b);


    }
}

class Product{
    public int product(int x,int y){
        // System.out.println("calling 1st product function");
        return y;
    } 

    public int product(int x,int y,int z){
        // System.out.println("calling 2nd product function");
        return y;
    }
    public double product(double x, double y) {
        // System.out.println("calling 3rd product function");
        return y;
    }
}