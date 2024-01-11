package com.Math;

import java.util.ArrayList;

public class Factors {
    public static void main(String[] args) {
        factors(20);
    }

    private static void factors(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1;i*i<=n;i++){
            if(n%i==0)
                if(i==n/i)
                    System.err.print(i+" ");
                else{
                    System.out.print(i+" ");
                    list.add(n/i);
                }         
        }
        for(int i=list.size()-1;i>=0;i--){
            System.out.print(list.get(i)+" ");
        }
    }
}