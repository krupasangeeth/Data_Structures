package com.LinkedListTypes;

import com.company.DoublyNode;

public class DoublyLL {

    public DoublyNode head;
    public DoublyNode tail;
    public int size;
    public DoublyNode creationDLL(int val){
        head=new DoublyNode();
        DoublyNode newNode = new DoublyNode();
        newNode.value=val;
        newNode.next = null;
        newNode.prev = null;
        head = newNode;
        tail = newNode;
        size=1;
        return head;
    }

    public void insertDLL(int val,int position){
        DoublyNode newNode=new DoublyNode();
        newNode.value=val;
        if(head == null){
            creationDLL(val);
            return;
        }else if(position == 0){
            newNode.next=head;
            newNode.prev=null;
            head.prev=newNode;
            head=newNode;

        } else if(position >= size ){
            newNode.next=null;
            tail.next=newNode;
            newNode.prev=tail;
            tail=newNode;
        } else{
            DoublyNode temp=head;
           int index=0;
           while(index<position-1){
               temp=temp.next;
               index++;
           }
           newNode.next=temp.next;
           newNode.prev=temp;
           temp.next=newNode;
           newNode.next.prev=newNode;

        }
        size++;
    }
    public void traverseDll(){
        if(head == null)
            System.out.println("Doubly Linked List does not exists");
        else {
            DoublyNode dummy=head;
            for(int i=0;i<size;i++){
                System.out.print(dummy.value);
                System.out.print("-->>");
                dummy=dummy.next;
            }
            System.out.println("null");
        }
    }
    public void reverseTraverseDll(){
        if(head == null)
            System.out.println("Doubly Linked List does not exists");
        else {
            DoublyNode dummy=tail;
            while(dummy!=null){
                System.out.print(dummy.value);
                System.out.print("<<--");
                dummy=dummy.prev;
            }
            System.out.println("null");
        }

    }
    public boolean searchNode(int val){
        if(head != null){
            DoublyNode dummy=head;
            for(int i=0;i<size;i++){
                if(val == dummy.value)
                {
                    System.out.println("Node found at position "+i);
                    return true;
                }
                dummy=dummy.next;
            }
        }
        System.out.println("Node not found");
        return false;
    }

    public void deleteNodeDLL(int position){
        if(head == null){
            System.out.println("Doubly Linked list does not exists");
            return;
        } else if(position == 0){
            if(size == 1){
                head = null;
                tail = null;
            }else{
                head = head.next;
                head.prev = null;
            }
            size--;

        } else if(position >= size){
            if(size == 1){
                head = null;
                tail = null;
            }else{
                tail = tail.prev;
                tail.next = null;
            }
            size--;
        } else{

        }

    }

}
