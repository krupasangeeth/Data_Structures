package com.ArrayBasedProblems;

import java.util.ArrayList;
import java.util.Scanner;

public class cielingOfArray {

    public static void main(String[] args) {
	// write your code here
        int[] a={1,4,7,23,78,123,234,567,890,};
        int target=100;
        System.out.println(cielArray(a,target));

    }
    static int cielArray(int[] arr,int target){
        int ciel=0,s=0,e=arr.length-1;
        int mid=(s+e)/2;
        while(s<=e){
            if(arr[mid]>target){
                e=mid-1;
            }
            else
                s=mid+1;
            mid=(s+e)/2;
        }
        return arr[e];
    }
}
