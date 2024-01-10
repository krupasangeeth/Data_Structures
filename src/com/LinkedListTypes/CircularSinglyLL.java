package com.LinkedListTypes;

public class CircularSinglyLL {
    public Node head;
    public Node tail;
    public int size;

    //Creation of CLL
    public Node createCSLL(int nodeValue){
        head = new Node();
        Node n=new Node();
        n.value=nodeValue;
        n.next=n;
        head=n;
        tail=n;
        size=1;
        return head;
    }
    //Insertion in to CLL
    public void insertInToCLL(int nodeValue,int location){
        Node n=new Node();
        n.value=nodeValue;
        if(head == null){
            createCSLL(nodeValue);
            return;
        } else if(location == 0){
            tail.next = n;
            n.next=head;
            head=n;
        } else if(location>=size){
            tail.next = n;
            n.next=head;
            tail=n;
        } else{
            Node tmp=head;
            for(int i=0;i<location-1;i++)
                tmp=tmp.next;
            n.next=tmp.next;
            tmp.next=n;
        }
        size++;
    }

    //Traversal of CLL
    public void traversalOfCLL(){
        if(head == null){
            System.out.println("Circular single Linked List does not exists");
            return;
        }
        else{
            Node tmp=head;
            for(int i=0;i<size;i++){
                System.out.print(tmp.value);
                System.out.print("-->>");
                tmp=tmp.next;
            }
            System.out.println("null");
        }
    }

    //Searching in Circular single Linked List
    public Boolean searchInCLL(int nodeValue){
        if(head!=null){
            Node tmp=head;
            for(int i=0;i<size;i++){
                if(tmp.value==nodeValue) {
                    i++;
                    System.out.println("Node found at location -> " + i);
                    return true;
                }
                tmp=tmp.next;
            }
        }
        System.out.println("Node does not exists");
        return false;
    }

    //Deletion of node in Circular Linked List
    public void deleteNodeCLL(int location){
        if(head==null)
        {
            System.out.println("Circular Linked List does not exists");
            return;
        }else if(location == 0){
            head=head.next;
            tail.next=head;
            size--;
            if(size==0){
                tail=null;
                head.next=null;
                head=null;
            }

        }else if(location >= size){
            Node tmp=head;
            for(int i=0;i<size-1;i++){
                tmp=tmp.next;
            }
            if(tmp==head){
                tail=null;
                head.next=null;
                head=null;
                size--;
                return;
            }
            tmp.next=head;
            tail=tmp;
            size--;

        }else{
            Node tmp=head;
            for(int i=0;i<location-1;i++)
                tmp=tmp.next;
            tmp.next=tmp.next.next;
        }
    }
    public void deleteCLL() {
        if (head == null)
            System.out.println("Circular single linked list does not exists");
        else {
            head = null;
            tail.next = null;
            tail = null;
            System.out.println("Circular single linked list deleted");
        }
    }
}
