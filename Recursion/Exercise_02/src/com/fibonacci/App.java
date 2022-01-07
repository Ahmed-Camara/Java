package com.fibonacci;

public class App {
    public static void main(String[] args) {
        System.out.println(fib(15));
    }

    public static long fib(long n){

        long f0 = 0;
        long f1 = 1;
        long c = 1;

        for(int i = 1; i <= n; i++){
            c = f0 + f1;
            f0 = f1;
            f1 = c;
        }

        return c;
    }
}
