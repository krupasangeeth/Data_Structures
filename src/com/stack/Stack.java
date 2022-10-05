package com.stack;
import com.company.SingleLinkedList;

public class Stack {
    SingleLinkedList l;
    public Stack(){
        l=new SingleLinkedList();
    }
    public int top;
    public int[] arr;
    public Stack(int size){
        this.arr=new int[size];
        this.top=-1;
        System.out.println("The stack is created with size "+size);
    }

    //isEmpty
    public Boolean isEmpty(){
        if(top == -1)
            return true;
        return false;
    }

    //IsFull
    public Boolean isFull(){
        if(top == arr.length-1)
            return true;
        return false;
    }

    //Push
    public void push(int val) {
        if (isFull())
            System.out.println("Stack is Full");
        else {
            arr[++top] = val;
            System.out.println("Item pushed : " + val);
        }
    }

    //Pop
    public int pop(){
            if(isEmpty()){
                System.out.println("Stack is Empty");
                return -1;
            }
            else{
                int popItem=arr[top];
                top--;
                System.out.println("Item poped");
                return popItem;
            }
    }

    //Peek
    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return -1;
        }else{
            return arr[top];
        }

    }

    //Delete
    public void deleteStack(){
        arr=null;
        System.out.println("Stack is Sucessfully deleted");
    }
    //Stack Using Linked List
    //Push
    public void pushStackLL(int val){
        l.insertInToLL(val,0);
        System.out.println("Item pushed : " + val);
    }
    public boolean isEmptyLL(){
        if(l.head == null )
            return false;
        return true;
    }
    public int popStackLL(){
        int res=-1;
        if(isEmptyLL()){

        }
        return 0;
    }


}
