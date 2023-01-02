package com.Sortings;
//Tc => O(n^2)
public class SelectSort {
    public void selectionSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            int minIndex = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[minIndex])
                    minIndex = j;
            }
            if(minIndex != i){
                int tmp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = tmp;
            }
        }
    }
}
