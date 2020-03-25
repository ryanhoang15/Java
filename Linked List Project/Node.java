package Wk_4;

public class Node {
    private String word;
    private Node next;

    public Node(String wrd){
        word = wrd;
        next = null;
    }

    public void display(){
        System.out.print(" " + word);
    }

    public Node getNext(){
        return next;
    }

    public void setNext(Node n){
        next = n;
    }

    public String getValue(){
        return word;
    }
}
