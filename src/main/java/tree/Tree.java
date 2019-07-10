package tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Tree<T> {

    Node<T> root;

    public Tree(Node<T> root){
        this.root = root;
    }

    //Print the tree recursively
    public void preorderTree(){

        printHelper(this.root);
    }

    private void printHelper(Node<T> node){
        if (node == null){
            return;
        }

        System.out.print(node.value + " ");
        printHelper(node.getLeft());
        printHelper(node.getRight());
    }

    //print the tree inorder recursive
    public void inOrderTree(){
        inOrderHelper(this.root);

    }

    private void inOrderHelper(Node<T> node){
        if(node == null){
            return;
        }

        printHelper(node.getLeft());
        System.out.print(node.value + " ");
        printHelper(node.getRight());
    }

    // Is a tree a Binary Search tree?

    public boolean isBST(Node<Integer> node, int maxLeft, int minRight){
        if (node == null){
            return true;
        }

        if (node.value > maxLeft || node.value < minRight){
            return false;
        }

        return (isBST(node.getLeft(), maxLeft-1, node.value) && isBST(node.getRight(), node.value, minRight+1));
    }

}
