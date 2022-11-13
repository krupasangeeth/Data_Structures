package com.BinarySearchTree;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTreeClass {
    BinarySTreeNode root;
    BinarySearchTreeClass(){
        root = null;
    }
    public void insertBNode(BinarySTreeNode node,int data){
        BinarySTreeNode newnode = new BinarySTreeNode();
        newnode.data = data;
        if(root == null){
            root = newnode;
            return;
        }else {
            if(node.left == null || node.right == null){
                if(data <= node.data){
                    node.left = newnode;
                    return;
                }

                else{
                    node.right = newnode;
                    return;
                }

            }
            if(data <= node.data )
                insertBNode(node.left,data);
            if(data > node.data )
                insertBNode(node.right,data);
        }
    }
    public void insert(int data){
        insertBNode(root,data);
        System.out.println("Node inserted : "+ data);
    }
    public void preOrder(BinarySTreeNode node){
        if(node == null)
            return;
        System.out.print(node.data+" ");
        preOrder(node.left);
        preOrder(node.right);
    }
    public void inOrder(BinarySTreeNode node){
        if(node == null)
            return;
        inOrder(node.left);
        System.out.print(node.data+" ");
        inOrder(node.right);
    }
    public void postOrder(BinarySTreeNode node){
        if(node == null)
            return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.data+" ");
    }
    public void levelOrder(){
        Queue<BinarySTreeNode> q = new LinkedList<BinarySTreeNode>();
        q.add(root);
        while(!q.isEmpty()){
            BinarySTreeNode node = q.remove();
            System.out.print(node.data+" ");
            if(node.left != null) q.add(node.left);
            if(node.right != null) q.add(node.right);
        }
    }
    public Boolean search(BinarySTreeNode node,int value)
    {
        if(node == null){
            System.out.println("Node - "+value+" not found in the BST");
            return false;
        }
        if(node.data == value)
        {
            System.out.println("Node - "+value+" found in the BST");
            return true;
        }else if(node.data < value){
            return search( node.right, value);
        }else
            return search( node.left, value);
    }
    public BinarySTreeNode minNode(BinarySTreeNode node){
        if(node.left == null)
            return node;
        return minNode(node.left);
    }
    public BinarySTreeNode delete(BinarySTreeNode node,int val){
        if(node == null)
        {
            System.out.println("Item not found");
            return null;
        }
        if(node.data < val){
           node.right = delete(node.right, val);
        } else if(node.data > val){
            node.left =  delete(node.left,val);
        }else{
            if(node.left != null && node.right != null){
                BinarySTreeNode temp = node;
                BinarySTreeNode minRightNode = minNode(node.right);
                node.data = minRightNode.data;
                node.right = delete(node.right,minRightNode.data);
            }else if(node.left != null){
                node = node.left;
            }else if(node.right != null){
                node = node.right;
            }else
                node = null;

        }
        return node;
    }
    public void deleteBST(){
        root = null;
        System.out.println("Tree deleted Succesfully");
    }
}
