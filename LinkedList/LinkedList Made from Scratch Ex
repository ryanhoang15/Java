public class LinkedList {
    private Node head;


    public void add(int data){
        Node current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = new Node(data);
    }

    public void prepend(int data){
        Node newHead = new Node(data);
        newHead.next = head;
        head = newHead;
    }

    public void deleteWithValue(int data){
        if(head == null){
            return;
        }
        if(head.value == data){
            head = head.next;
        }
        Node current = head;
        while(current.next != null){
            if(current.next.value == data){
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }
}
