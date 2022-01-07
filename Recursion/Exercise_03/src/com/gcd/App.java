package com.gcd;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter m : ");
        int m = sc.nextInt();
        System.out.println();
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        System.out.println("GCD of m = "+m+", and n = "+n+" is : "+gcd(m,n));
    }

    public static int gcd(int m,int n){

        if(m%n==0)
            return n;

        return gcd(n,m%n);
    }
}
