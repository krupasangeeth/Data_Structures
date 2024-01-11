package com.Math;

public class GCD_LCM {
    public static void main(String[] args) {
        System.out.println(gcd(9,18));
        System.out.println(lcm(9,18));
    }

    private static int lcm(int a, int b) {
        return (a*b)/gcd(a,b);
    }

    private static int gcd(int a, int b) {
        if(b==0)
            return a;
        return gcd(b, a%b);
        
    }
}
