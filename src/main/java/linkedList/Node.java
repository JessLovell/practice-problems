package linkedList;

public class Node<T> {

    private Node<T> next;
    protected T value;

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

    public T getValue(){
        return this.value;
    }
}
