package com.cheesemold;


public class Main {
    public static void main(String[] args) {

        BinaryTree myBinaryTree = new BinaryTree();
        Node last = new Node(110, "n8");
        myBinaryTree.addNode(50, "n1");
        myBinaryTree.addNode(30, "n2");
        myBinaryTree.addNode(70, "n3");
        myBinaryTree.addNode(10, "n4");
        myBinaryTree.addNode(50, "n5");
        myBinaryTree.addNode(90, "n6");
        myBinaryTree.addNode(70, "n7");
        myBinaryTree.addNode(last);

        //myBinaryTree.traverseTreeInOrder(myBinaryTree.getRoot());

        myBinaryTree.traverseTreePreOrder(myBinaryTree.getRoot());

        myBinaryTree.removeNode(new Node(110, "343"));
        System.out.println("\n");
        myBinaryTree.traverseTreePreOrder(myBinaryTree.getRoot());

        System.out.println("\n");
        System.out.println(myBinaryTree.findNode(new Node(30, "n7")));
    }
}
