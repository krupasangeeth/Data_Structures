package com.stack;

public class Main {
    public static void main(String[] args) {
        Stack s=new Stack(10);
        System.out.println(s.isEmpty());
        s.push(4);
        s.push(6);
        s.push(7);
        s.push(10);
        s.push(15);
        s.push(23);
        System.out.println(s.top);
        s.pop();
        System.out.println(s.top);
        s.pop();
        System.out.println(s.peek());
        s.peek();



    }
}
