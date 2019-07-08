package tree;

public class Node<T> {
    T value;
    Node<T> left;
    Node<T> right;

    public Node (T value){
        this.value = value;
        this.right = null;
        this.left = null;
    }

    public void setLeft(Node<T> left){
        this.left = left;
    }

    public void setRight(Node<T> right){
        this.right = right;
    }

    public Node<T> getLeft(){
        return this.left;
    }

    public Node<T> getRight(){
        return this.right;
    }

    public void setRightLeft(Node<T> right, Node<T> left){
        this.left = left;
        this.right = right;
    }

}
