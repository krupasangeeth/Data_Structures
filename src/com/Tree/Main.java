package com.Tree;

public class Main {
    public static void main(String[] args) {

    BinaryTreeNode b=new BinaryTreeNode();
    TreeNodeLL t = new TreeNodeLL();
    t.insert("N1");
    t.insert("N9");
    t.insert("N2");
    t.insert("N8");
    t.insert("N3");
    t.insert("N7");
    t.insert("N4");
    t.insert("N6");
    t.insert("N5");
    t.insert("N45");
//    t.preOrder(t.root);
//    System.out.println();
//    t.inOrder(t.root);
//    System.out.println();
//    t.postOrder(t.root);
    System.out.println();
    t.levelOrder();
    System.out.println();
    t.deleteBinaryTree();
    t.levelOrder();
//    t.search("N5");


















        //Tree using ArrayList
//        TreeNode drinks = new TreeNode("Drinks");
//        TreeNode hot = new TreeNode("Hot");
//        TreeNode cold = new TreeNode("Cold");
//        TreeNode tea = new TreeNode("Tea");
//        TreeNode coffee = new TreeNode("Coffee");
//        TreeNode wine = new TreeNode("Wine");
//        TreeNode beer = new TreeNode("Beer");
//        drinks.addChildren(hot);
//        drinks.addChildren((cold));
//        hot.addChildren(tea);
//        hot.addChildren((coffee));
//        cold.addChildren(wine);
//        cold.addChildren((beer));
//        System.out.println(drinks.print(0));
    }
}
