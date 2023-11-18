package com.driver;

public class Main {

    public static void main(String[] args) {
        Product p = new Product();
        System.out.println(p.product(12, 14));
        System.out.println(p.product(12, 14, 26));
        System.out.println(p.product(12.12, 14.43));
    }

    public static class Product {
        public int product(int x, int y) {
            return x * y;
        }

        public int product(int x, int y, int z) {
            return x * y * z;
        }


        public double product(double x, double y) {
            return x * y;
        }
    }

}