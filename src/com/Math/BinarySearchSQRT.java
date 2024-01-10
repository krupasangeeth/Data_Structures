package com.Math;

public class BinarySearchSQRT {
    public static void main(String[] args) {
        int n=40;
        int p=2;//precision
        System.out.println(squareRoot(n,p));
    }

    static double squareRoot(int n,int p){
        int s=0,e=n;
        while(s<=e){
            int m = s+((e-s)/2);
            if(m*m==n) return m;
            else if(m*m>n) e=m-1;
            else s=m+1;
        }
        double root=e,incr=0.1;
        for(int i=0;i<p;i++){
            while(root * root <=n)
                root+=incr;
            root-=incr;
            incr/=10;
        }
        return root;
    }
}
