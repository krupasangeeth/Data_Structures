package com.Tree;
// import java.util.*;
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
    public void levelOrder(){
    Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
    q.add(root);
    if(root == null){
        System.out.println("Tree is empty");
        return;
    }

    while(!q.isEmpty()){
        BinaryTreeNode node = q.remove();
        System.out.print(node.data+"->");
        if(node.left != null)
            q.add(node.left);
        if(node.right != null)
            q.add(node.right);
        }
    }

    //Search
    public void search(String data){
        Queue<BinaryTreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            BinaryTreeNode node = q.remove();
            if(node.data.equals(data)){
                System.out.println("Item Found "+data);
                return;
            }

            else {
                if (node.left != null)
                    q.add(node.left);
                if (node.right != null)
                    q.add(node.right);
            }
        }
        System.out.println("Item Not Found "+data);
    }
    public void insert(String data){
        BinaryTreeNode node = new BinaryTreeNode();
        node.data=data;
        if(root == null){
           root=node;
           System.out.print("Inserted new node at root");
           return;
        }
        Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
        q.add(root);
        while(!q.isEmpty()){
            BinaryTreeNode b = q.remove();
            if(b.left == null){
                b.left = node;
                System.out.print("Item inserted");
                break;
            }else if(b.right == null) {
                b.right = node;
                System.out.print("Item inserted");
                break;
            }else{
                q.add(b.left);
                q.add(b.right);
            }

        }
    }

    public BinaryTreeNode getDeepestNode(){
        Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
        q.add(root);
        BinaryTreeNode node = null;
        while(!q.isEmpty()){
            node = q.remove();
            if(node.left != null)
                q.add(node.left);
            if(node.right != null)
                q.add(node.right);
        }
        return node;
    }
    public void deleteDeepestNode(){
        Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
        q.add(root);
        BinaryTreeNode PreviousNode = null;
        BinaryTreeNode PresentNode = null;
        while(!q.isEmpty()){
           PreviousNode = PresentNode;
           PresentNode  = q.remove();
           if(PresentNode.left == null){
               PreviousNode.right = null;
               return;
           }else if(PresentNode.right == null){
               PresentNode.left = null;
               return;
           }
           q.add(PresentNode.left);
           q.add(PresentNode.right);
        }
    }
    public void deleteNode(String data){
        Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
        q.add(root);
        BinaryTreeNode node = null;
        while(!q.isEmpty()){
            node = q.remove();
            if(node.data.equals(data)){
                node.data = getDeepestNode().data;
                deleteDeepestNode();
                return;
            }else{
                if(node.left != null) q.add(node.left);
                if(node.right != null) q.add(node.right);
            }
        }
    }
    public void deleteBinaryTree(){
        root = null;
        System.out.println("Tree is deleted");
    }

}
