package LinkedList;

public class Node<T> {

    private Node<T> next;
    private T value;

    public Node(T value){
        this.value = value;
        this.next = null;
    }

    public Node<T> setNext(Node<T> next){
        this.next = next;
        return this;
    }

    public Node<T> getNext(){
        return this.next;
    }
}
