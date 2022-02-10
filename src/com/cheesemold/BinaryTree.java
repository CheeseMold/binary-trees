package com.cheesemold;


public class BinaryTree {
    private Node root;

    public Node getRoot() {
        return root;
    }

    public void addNode(int key, String name) {
        Node newNode = new Node(key, name);
        
        // Sets root to the new node if it does not yet exist
        if (root == null) {
            root = newNode;
        } else {
            // Sets default value of current node being analised as 'root', and initializes parent Object for 
            // the parent node of focusNode
            Node focusNode = root;
            Node parent;

            while (true) {
                parent = focusNode;
                if (key < focusNode.key) {
                    focusNode = focusNode.leftChild;
                    if (focusNode == null) {
                        parent.leftChild = newNode;
                        return;
                    }
                } else {
                    focusNode = focusNode.rightChild;
                    if (focusNode == null) {
                        parent.rightChild = newNode;
                        return;
                    }
                }
            }
        }
    }
    public void addNode(Node addNode) {
        addNode(addNode.key, addNode.name);
    }

    // Traverses through all nodes in tree 'in order'. In other words, start from the smallest value in the 
    // tree.
    public void traverseTreeInOrder(Node focusNode) {
        if (focusNode != null) {
            // Uses recursion to traverse, or iterate through each Binary Tree element
            traverseTreeInOrder(focusNode.leftChild);
            System.out.println(focusNode);
            traverseTreeInOrder(focusNode.rightChild);
        }
    }

    public void traverseTreePreOrder(Node focusNode) {
        if (focusNode != null) {
            System.out.println(focusNode);
            traverseTreeInOrder(focusNode.leftChild);
            traverseTreeInOrder(focusNode.rightChild);
        }
    }

    public void removeNode(Node removeNode) {
        removeNode(removeNode.key);
    }

    public void removeNode(int removeValue) {
        Node focusNode = root;
        Node parent;
        if (removeValue == focusNode.key) {
            root = null;
        } else {
            while (focusNode != null) {
                parent = focusNode;
                if (removeValue < focusNode.key) {
                    focusNode = focusNode.leftChild;
                    if (focusNode != null && focusNode.key == removeValue) {
                        parent.leftChild = null;
                        return;
                    }
                } else {
                    focusNode = focusNode.rightChild;
                    if (focusNode != null && focusNode.key == removeValue) {
                        parent.rightChild = null;
                        return;
                    }
                }    
            }
        }
    }



    public Node findNode(Node searchNode) {
        return findNode(searchNode.key);
    }

    public Node findNode(int nodeValue) {
        Node focusNode = root;

        while (focusNode != null) {
            if (nodeValue == focusNode.key) {
                return focusNode;
            }
            if (nodeValue < focusNode.key) {
                focusNode = focusNode.leftChild;
            } else {
                focusNode = focusNode.rightChild;
            }
        } return null;
    }
}