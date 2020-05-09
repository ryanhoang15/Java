package Wk_6;

// Ryan Hoang
// CECS 274-05
// Prog 5 - Binary Search Tree
// May 7, 2020

public class BinarySearchTree {
    private Node root;

    public BinarySearchTree() {
        root = null;
    }

    private class Node {
        private int value;
        private Node left;
        private Node right;

        private Node(int data) {
            value = data;
            left = null;
            right = null;
        }

        private int getValue() {
            return value;
        }

        private void setValue(int num) {
            value = num;
        }

        private void display() {
            System.out.print(value + " ");
        }

        private Node getRight() {
            return right;
        }

        private Node getLeft() {
            return left;
        }

        private void setRight(Node n) {
            right = n;
        }

        private void setLeft(Node n) {
            left = n;
        }
    }

    public int rootValue(){
        return root.getValue();
    }

    public boolean isEmpty() {
        if (root == null) {
            return true;
        }
        return false;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Tree is empty");
        }
        else {
            display(root);

        }
    }

    private void display(Node root) {
        if (root.getLeft() != null) {
            display(root.getLeft());
        }

        root.display();

        if (root.getRight() != null) {
            display(root.getRight());
        }
    }

    public void add(int num) {

        if (root == null) {
            root = new Node(num);
        }
        else {
            add(root, num);
        }
    }

    private void add(Node parent, int num) {

        if (parent.getValue() == num) {
            System.out.println("This number can't be added to the tree");
            System.out.println("The number " + num + " is already in the tree \n");
            return;
        }
        else {
            if (num < parent.getValue()) {
                if (parent.getLeft() == null) {
                    Node leftRoot = new Node(num);
                    parent.setLeft(leftRoot);
                }
                else {
                    add(parent.getLeft(), num);
                }
            }
            else {
                if (parent.getRight() == null) {
                    Node rightRoot = new Node(num);
                    parent.setRight(rightRoot);
                }
                else {
                    add(parent.getRight(), num);
                }
            }
        }
    }

    public boolean find(int num) {
        if (isEmpty()) {
            return false;
        }
        else {
            return find(root, num);
        }
    }

    private boolean find(Node root, int num) {
        if (num == root.getValue()) {
            return true;
        }
        else if (num < root.getValue()) {
            if (root.getLeft() == null) {
                return false;
            }
            else {
                return find(root.getLeft(), num);
            }
        }
        else {
            if (root.getRight() == null) {
                return false;
            }
            else {
                return find(root.getRight(), num);
            }
        }
    }

    public int max(){
        return max(root);
    }

    private int max(Node root) {
        if (root.getRight() == null) {
            return root.getValue();
        }
        else {
            return max(root.getRight());
        }
    }

    public int min() {
        return min(root);
    }

    private int min(Node root) {
        if (root.getLeft() == null) {
            return root.getValue();
        }
        else {
            return min(root.getLeft());
        }
    }

    public void delete(int num){
        if(isEmpty()){
            System.out.println("Tree is empty");
        }
        else if(!find(num)){
            System.out.println("\n" + num + " is not in the list to be deleted");
        }
        else {
            delete(root, num);
            System.out.println(num + " has been deleted");
            display();
            System.out.println();
        }
    }

    private Node delete(Node node, int num){
        if(node == null){
            return null;
        }

        if(num < node.getValue()){
            if(num == node.getLeft().getValue()){
                node.setLeft(delete(node.getLeft(),num));
            }
            else {
                delete(node.getLeft(), num);
            }
        }
        else if(num > node.getValue()){
            if(num == node.getRight().getValue()){
                node.setRight(delete(node.getRight(),num));
            }
            else {
                delete(node.getRight(), num);
            }
        }
        // if the node has 2 children
        // search for the min number of the right sub tree
        else if(node.getLeft() != null && node.getRight() != null){
            int value = min(node.getRight());
            node.setValue(value);
            node.setRight(delete(node.getRight(),value));
        }
        // deleting the node if the node has no leaf nodes
        else if(node.getLeft() == null && node.getRight() == null){
            node = null;
        }
        // deleting if it has one child node
        else {
            if(node.getLeft() == null){
                node = node.getRight();
            }
            else {
                node = node.getLeft();
            }
        }
        return node;
    }

    public double averageValue(){
        return (double) sum()/size();
    }

    public int size(){
        if(isEmpty()){
            return 0;
        }
        else{
            return 1 + size(root.getLeft()) + size(root.getRight());
        }
    }

    private int size(Node root){
        if(root == null){
            return 0;
        }
        else {
            return 1 + size(root.getLeft()) + size(root.getRight());
        }
    }

    public int sum(){
        if(isEmpty()){
            return 0;
        }
        else {
            return root.getValue() + sum(root.getLeft()) + sum(root.getRight());
        }
    }

    private int sum(Node root){
        if(root == null){
            return 0;
        }
        else{
            return root.getValue() + sum(root.getLeft()) + sum(root.getRight());
        }
    }

    public int height(){
        if(isEmpty()){
            return 0;
        }
        else{
            return 1 + maxHeight(height(root.getLeft()), height(root.getRight()));
        }
    }

    private int height(Node root){
        if(root == null){
            return 0;
        }
        else{
            return 1 + maxHeight(height(root.getLeft()), height(root.getRight()));
        }
    }

    private int maxHeight(int leftChild, int rightChild){
        if(leftChild > rightChild){
            return leftChild;
        }
        return rightChild;
    }
}


