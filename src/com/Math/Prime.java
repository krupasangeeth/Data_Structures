package com.Math;

/**
 * isPrime
 */
public class Prime {
    public static void main(String[] args) {
        int n=40;
        for(int i=2;i<=n;i++){
            System.out.println(i+" is prime "+ isPrime(i));
        }
        
    }

    private static Boolean isPrime(int n) {
        for(int i=2;i*i<=n;i+=2){
            if(n%i==0)
                return false;
        }
        return true;
        
    }
}