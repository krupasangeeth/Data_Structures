package com.company;
// import java.lang.*;
// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.Scanner;

import com.LinkedListTypes.DoublyLL;

public class Main {

    public static void main(String[] args) {

       //Doubly Linked List
       DoublyLL d=new DoublyLL();
       d.creationDLL(15);
       d.insertDLL(20,0);
       d.insertDLL(22,2);
       d.insertDLL(9,2);
       d.insertDLL(35,3);
        d.insertDLL(36,3);
        d.insertDLL(72,6);
        d.insertDLL(100,0);
        d.traverseDll();
        d.reverseTraverseDll();
        d.searchNode(90);




















        //Circular Single Linked List
//        CircularSinglyLL c= new CircularSinglyLL();
//        c.createCSLL(10);
//        c.insertInToCLL(20,0);
//        c.insertInToCLL(30,5);
//        c.insertInToCLL(25,1);
//        c.insertInToCLL(50,10);
//        c.insertInToCLL(70,0);
//        c.insertInToCLL(100,0);
//        c.insertInToCLL(200,0);
//        c.insertInToCLL(500,8);
//        c.insertInToCLL(800,8);
//        System.out.println(c.head.value);
//        System.out.println(c.head.next.value);
//        System.out.println(c.tail.value);
//        c.traversalOfCLL();
//        //c.searchInCLL(2000);
//        c.deleteNodeCLL(3);
//        c.traversalOfCLL();
//        c.deleteCLL();
//        c.traversalOfCLL();

















        //Single Linked List
//        SingleLinkedList s = new SingleLinkedList();
//        s.createSingleLL(10);
//        s.insertInToLL(20,0);
//        s.insertInToLL(30,5);
//        s.insertInToLL(25,1);
//        s.insertInToLL(50,10);
//        s.insertInToLL(70,0);
//        s.insertInToLL(100,0);
//
//        s.traversalOfLL();
//        Boolean b=s.searchLL(100);
//        s.deleteSLL();
//        s.traversalOfLL();



























        // write your code here
//        Scanner sc=new Scanner(System.in);
//        ArrayList<Integer> list= new ArrayList<>();
//        list.add(2);
//        list.add(22);
//        list.add(52);
//        list.add(75);
//        list.add(2456);
//
//        System.out.println(list);
//
//        list.set(0,209);
//        list.add(1,89);
//
//        System.out.println(list);
////        int[] arr = new int[5];
////        for(int i=0;i < arr.length;i++) {
////            arr[i] = sc.nextInt();
////        }
////        for(int i=0;i < arr.length;i++){
////            System.out.println(arr[i]);
////        }
////        for (int z : arr) {
////            System.out.print(z);
////        }
////        change(arr);
////        System.out.println(Arrays.toString(arr));
////        String[] str=new String[4];
////        for (int i=0;i < str.length;i++)
////        {
////            str[i]=sc.next();
////        }
////        System.out.println(Arrays.toString(str));
//    }
//    static void change(int[] arr){
//        arr[0]=99;
   }
}
