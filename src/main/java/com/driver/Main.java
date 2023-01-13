package com.driver;

public class Main {

    public static class Product{
        public int product(int x,int y){
            return x*y;
        } 
    
        public int product(int x,int y,int z){
            return x*y*z;
        }
        public double product(double x, double y) {
            return x*y;
        }
    }

    public static void main(String[] args) {
        Product p = new Product();
        int x=1,y=1,z=1;
        Double a = 1.5, b = 2.5;

        System.out.println(p.product(x,y));
        System.out.println(p.product(x,y,z));
        System.out.println(p.product(a, b));
        
    }
}