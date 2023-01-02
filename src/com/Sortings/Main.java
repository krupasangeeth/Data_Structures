package com.Sortings;

public class Main {
    public static void main(String[] args) {
        int[] arr = {10,5,7,2,22,16,1,15,8};
//        BubbleSort b = new BubbleSort();
//        b.bubbleSort(arr);
        SelectSort s = new SelectSort();
        s.selectionSort(arr);
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
    }
}
