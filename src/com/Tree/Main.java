package com.Tree;

public class Main {
    public static void main(String[] args) {

    BinaryTreeNode b=new BinaryTreeNode();
    TreeNodeLL t = new TreeNodeLL();
    BinaryTreeNode N1 = new BinaryTreeNode();
    N1.data="N1";
    BinaryTreeNode N2 = new BinaryTreeNode();
    N2.data="N2";
    BinaryTreeNode N3 = new BinaryTreeNode();
    N3.data="N3";
    BinaryTreeNode N4 = new BinaryTreeNode();
    N4.data="N4";
    BinaryTreeNode N5 = new BinaryTreeNode();
    N5.data="N5";
    BinaryTreeNode N6 = new BinaryTreeNode();
    N6.data="N6";
    BinaryTreeNode N7 = new BinaryTreeNode();
    N7.data="N7";
    BinaryTreeNode N8 = new BinaryTreeNode();
    N8.data="N8";
    BinaryTreeNode N9 = new BinaryTreeNode();
    N9.data="N9";
    N1.left=N2;
    N1.right=N3;
    N2.left=N4;
    N2.right=N5;
    N3.left=N6;
    N3.right=N7;
    N4.left=N8;
    N4.right=N9;
    t.root=N1;
    t.preOrder(t.root);
    System.out.println();
    t.inOrder(t.root);
    System.out.println();
    t.postOrder(t.root);
    System.out.println();
    t.levelOrder();

















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
