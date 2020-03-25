package Wk_4;


public class LinkedList {

    private Node head;

    public LinkedList(){
        head = null;
    }

    public void display(){
        Node temp = head;

        int column = 0;

        while(temp != null){

            temp.display();

            temp = temp.getNext();

            column ++;

            if(column % 12 == 0){

                System.out.println();
            }
        }
    }

    public int add(String wrd) {
        int location = 1;

        if (head == null) {
            Node temp = new Node(wrd);
            temp.setNext(head);
            head = temp;
        }

        else {
            Node newNode = new Node(wrd);
            Node current = head;
            if (current.getValue().compareTo(wrd) > 0) {
                newNode.setNext(current);
                head = newNode;
            }

            else {

                Node prev = head;
                current = head.getNext();
                while (current != null) {
                    if (current.getValue().compareTo(wrd) > 0) {
                        newNode.setNext(current);
                        prev.setNext(newNode);
                        break;
                    }
                    location++;
                    prev = current;
                    current = current.getNext();
                }
                location++;
                prev.setNext(newNode);
            }
        }
        return location;
    }

    public void delete(int num) {
        int count = 2;

        if (num == 1) {
            head = head.getNext();
            count = 1;
        }

        boolean del = false;

        String deleteWord = " ";

        Node previous = head;

        Node current = head.getNext();

        while (current != null) {
            if (count == num) {
                deleteWord = current.getValue();
                Node newNode = current.getNext();
                previous.setNext(newNode);
                del = true;
                break;
            }
            count++;
            previous = current;
            current = current.getNext();
            }

            if(del){
                display();
                System.out.println("\n\n" + deleteWord + " was removed from location " + count);
            }

        }

    public void find(String wrd) {
        int count = 1;
        boolean found = false;
        Node current = head;

        while (current != null) {
            if (current.getValue().equals(wrd)) {
                found = true;
                break;
            }
            count++;
            current = current.getNext();
        }
        if(found){
            System.out.println("\n" + wrd + " found at location " + count + "\n");
        }
        else {
            System.out.println("\n" + wrd + " not found \n");
        }
    }

    public int size(){
        int count = 0;
        Node first = head;
        while(first != null){
            first = first.getNext();
            count++;
        }
        return count;
    }

}
