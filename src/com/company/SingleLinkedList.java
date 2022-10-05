package com.company;

public class SingleLinkedList {
    public Node head;
    public Node tail;
    public int size;

    //Creating Single Linked List
    public Node createSingleLL(int nodeValue){
        head = new Node();
        Node node=new Node();
        node.value=nodeValue;
        head=node;
        tail = node;
        size=1;
        return head;
    }

    //Inserting into Single Linked List
    public void insertInToLL(int nodeValue, int location){  // O(n)
        Node node=new Node();
        node.value=nodeValue;
        if(head==null){
            createSingleLL(nodeValue);
            return;
        } else if(location == 0){
            node.next=head;
            head=node;
        } else if(location >= size){
            node.next=null;
            tail.next=node;
            tail=node;
        } else{
            int index=0;
            Node temp=head;
            while(index <= location-1){     // O(n)
                temp=temp.next;
                index++;
            }
            node.next=temp.next;
            temp.next=node;
        }
    size++;
    }

    //Searching in Single Linked List
    public Boolean searchLL(int nodeValue){
        if(head != null){
            Node n = head;
            for(int i=0;i<size;i++){
                if(n.value == nodeValue){
                    i=i+1;
                    System.out.println("Value found at position : " + i);
                return true;
                }
                n=n.next;
            }
            System.out.println("Value not Found!!!");
        }
        return false;
    }

    //Traversal of Single Linked List
    public void traversalOfLL(){
        if(head == null)
            System.out.println("Single Linked List does not exists");
        else {
            Node n = head;
            while (n != null) {
                System.out.print(n.value);
                System.out.print("-->>");

                n = n.next;
            }
            System.out.println("null");
        }
    }

    //Deletion of node in Single Linked List
    public void deletionOfNode(int location){
        if(head == null) {
            System.out.println("Single Linked List does not exists");
            return;
        }
        else if(location == 0){
            head=head.next;
            size--;
            if(size == 0)
                tail=null;
        }else if(location >= size){
            Node n= head;
            for(int i=0;i<size-1;i++){
                n=n.next;
            }
            if(n == head){
                head=tail=null;
                size--;
                return;
            }
            n.next=null;
            tail=n;
            size--;


        }else{
            Node n= head;
            for (int i=0;i<location-1;i++){
                n=n.next;
            }
            n.next=n.next.next;
            size--;

        }
    }
    public void deleteSLL(){
        head=null;
        tail=null;
        System.out.println("Single Linked List is deleted");
    }
}
