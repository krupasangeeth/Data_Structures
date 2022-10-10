package com.Tree;

public class Main {
    public static void main(String[] args) {
        TreeNode drinks = new TreeNode("Drinks");
        TreeNode hot = new TreeNode("Hot");
        TreeNode cold = new TreeNode("Cold");
        TreeNode tea = new TreeNode("Tea");
        TreeNode coffee = new TreeNode("Coffee");
        TreeNode wine = new TreeNode("Wine");
        TreeNode beer = new TreeNode("Beer");
        drinks.addChildren(hot);
        drinks.addChildren((cold));
        hot.addChildren(tea);
        hot.addChildren((coffee));
        cold.addChildren(wine);
        cold.addChildren((beer));
        System.out.println(drinks.print(0));
    }
}
