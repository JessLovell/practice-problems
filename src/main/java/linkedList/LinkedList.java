package linkedList;


import java.util.HashSet;

public class LinkedList<T> {

    protected Node<T> head;
    protected int size;

    public LinkedList(){
        this.head = null;
    }

    public Node add(T value){

        Node<T> newNode = new Node(value);
        newNode.setNext(this.head);
        this.head = newNode;

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

    // How do you reverse a linked list?
    private Node<T> reverseHelper(Node<T> curr){

        if(curr.getNext() == null){
            return curr;
        }

        Node<T> next = reverseHelper(curr.getNext());
        next.setNext(curr);

        return next;
    }

    public void recursiveReverse(){
        reverseHelper(this.head);
    }

    public void reverse(){
        if(this.head.getNext() != null){
            Node<T> next;
            Node<T> previous = null;
            Node<T> curr = this.head;

            while(curr != null){
                next = curr.getNext();
                curr.setNext(previous);
                previous = curr;
                curr = next;
            }
            this.head = previous;
        }
    }

    public String toString(){

        Node<T> curr = this.head;
        while(curr != null){
            System.out.print(curr.value + " ");
            curr = curr.getNext();
        }
        System.out.println();
        return "";
    }

    // How do you find the length of a singly linked list?
    private int lengthHelper(Node<T> curr){
        if (curr == null){
            return 0;
        }
        return lengthHelper(curr.getNext()) + 1;
    }

    public int length(){
        return lengthHelper(this.head);
    }

    // How do you find the third node from the end in a singly linked list?
    public Node<T> find(int k){

        if (this.head != null) {
            return null;
        }

        Node<T> curr = this.head;
        Node<T> prev = this.head;
        int deltaK = 0;

        while (curr.getNext() != null){
            if (deltaK != k){
                deltaK++;
            } else{
                prev = prev.getNext();
            }
            curr = curr.getNext();
        }
        return prev;
    }

    public void removeDuplicate() {

        if (this.head != null) {
            Node<T> curr = this.head;
            Node<T> prev = curr;
            HashSet<T> values = new HashSet<>();
            values.add(curr.getValue());

            while (curr.getNext() != null) {
                while (values.contains(curr.getValue())) {
                    curr = curr.getNext();
                }
                prev.setNext(curr);
                prev = curr;
                values.add(curr.getValue());
            }
        }
    }
}

