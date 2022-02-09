package com.cheesemold;


public class Node {
    int key;
    String name;

    Node rightChild;
    Node leftChild;

    public Node(int key, String name) {
        this.key = key;
        this.name = name;
    }

    @Override
    public String toString(){
        return name + " has key " + key; 
    }
}
