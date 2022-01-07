package com.factorial;

import java.math.BigInteger;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter a large number : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.println("The factorial of "+n+" is : "+findFactorial(n).toString());
    }


    public static BigInteger findFactorial(int n){

        BigInteger num = new BigInteger(String.valueOf(n));
        return findFactorial(num,BigInteger.ONE);
    }

    private static BigInteger findFactorial(BigInteger num,BigInteger result){

        if(num.equals(BigInteger.ZERO))
            return result;

        result = num.multiply(result);
        return findFactorial(num.subtract(BigInteger.ONE),result);
    }
}
