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

    public boolean isBST(Node<Integer> node) {
        if (node == null){
            return true;
        }
        if (node.left != null && max(node.left) > node.value){
            return false;
        }
        if (node.right != null && min(node.right) < node.value){
            return false;
        }
        if (!isBST(node.left) || !isBST(node.right)){
            return false;
        }
        return true;
    }

    protected Integer max(Node<Integer> node){
        if (node == null){
            return Integer.MIN_VALUE;
        }

        int max = node.value;
        int left = max(node.left);
        int right = max(node.right);

        if (max < left){
            max = left;
        }
        if (max < right){
            max = right;
        }

        return max;
    }

    protected Integer min(Node<Integer> node){
        if (node == null){
            return Integer.MAX_VALUE;
        }
        int min = node.value;
        int left = min(node.left);
        int right = min(node.right);

        if (min > left){
            min = left;
        }
        if (min > right){
            min = right;
        }

        return min;
    }

    public void printLeaves(Node<T> root){

        if (root.left == null && root.right == null) {
            System.out.println(root.value);
        }
        if(root.left != null) {
            printLeaves(root.left);
        }
        if(root.right != null){
            printLeaves(root.right);
        }
    }


}
