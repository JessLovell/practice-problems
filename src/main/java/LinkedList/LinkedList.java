package LinkedList;


public class LinkedList<T> {

    protected Node<T> head;
    protected int size;

    public LinkedList(){
        this.head = null;
        this.size = 0;
    }

    public Node add(T value){

        Node<T> newNode = new Node(value);
        newNode.setNext(this.head);
        this.head = newNode;
        this.size++;

        return newNode;
    }

    // How do you find the middle element of a singly linked list in one pass?
    public Node<T> findMiddle(){

        Node<T> middle = this.head;
        Node<T> front = this.head;

        while(front != null && front.getNext() != null){
            front= front.getNext().getNext();
            middle = middle.getNext();
        }

        return middle;
    }
}

