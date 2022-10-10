package com.Tree;
import java.util.*;
import java.util.LinkedList;
import java.util.Queue;

public class TreeNodeLL {
     BinaryTreeNode root;

    public void createTree(){
        this.root=null;
    }

    //Pre Order traversal
    void preOrder(BinaryTreeNode root){
        if(root == null)
            return;
        System.out.print(root.data+"->");
        preOrder(root.left);
        preOrder(root.right);
    }

    //In order Traversal
    void inOrder(BinaryTreeNode root){
        if(root == null)
            return;
        inOrder(root.left);
        System.out.print(root.data+"->");
        inOrder(root.right);
    }

    //Post Order Traversal
    void postOrder(BinaryTreeNode root){
        if(root == null)
            return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+"->");
    }
    void levelOrder(){
    Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
    q.add(root);
    while(!q.isEmpty()){
        BinaryTreeNode node = q.remove();
        System.out.print(node.data+"->");
        if(node.left != null)
            q.add(node.left);
        if(node.right != null)
            q.add(node.right);
    }

    }
}
