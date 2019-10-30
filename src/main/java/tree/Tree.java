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

        preOrderHelper(this.root);
    }

    private void preOrderHelper(Node<T> node){
        if (node == null){
            return;
        }

        System.out.print(node.value + " ");
        preOrderHelper(node.getLeft());
        preOrderHelper(node.getRight());
    }

    //print the tree inorder recursive
    public void inOrderTree(){
        inOrderHelper(this.root);

    }

    private void inOrderHelper(Node<T> node){
        if(node == null){
            return;
        }

        inOrderHelper(node.getLeft());
        System.out.print(node.value + " ");
        inOrderHelper(node.getRight());
    }

    //print the tree post order recursively
    public void postOrderTree(){
        postOrderHelper(this.root);
    }

    private void postOrderHelper(Node<T> node){
        if (node == null){
            return;
        }

        postOrderHelper(node.getLeft());
        postOrderHelper(node.getRight());
        System.out.print(node.value + " ");
    }



    public boolean isBST(Node<Integer> root){
        if (root == null) {
            return true;
        }
        if (root.left != null && findMax(root.left) > root.value){
            return false;
        }
        if (root.right!= null && findMin(root.right) < root.value){
            return false;
        }
        if (isBST(root.left) && isBST(root.right)){
            return true;
        }
        return true;
    }

    public int findMin(Node<Integer> root){
        if(root.left == null && root.right == null){
            return root.value;
        }

        int min = root.value;
        int leftMin = root.value;
        int rightMin = root.value;

        if(root.left != null){
            leftMin = findMin(root.left);
        }
        if (root.right != null){
           rightMin = findMin(root.right);
        }
        if (leftMin < min){
            min = leftMin;
        }
        if (rightMin < min) {
            min = rightMin;
        }

        return min;
    }

    public int findMax(Node<Integer> root){
        if (root.left == null && root.right == null) {
            return root.value;
        }
        int max = root.value;
        int leftMax = root.value;
        int rightMax = root.value;

        if(root.left != null){
            leftMax = findMax(root.left);
        }
        if(root.right != null) {
            rightMax = findMax(root.right);
        }

        if (max < leftMax){
            max = leftMax;
        }
        if (max < rightMax){
            max = rightMax;
        }
        return max;
    }

    // Count the leaf Nodes;
    public int countLeaves(Node root){
        if (root == null){
            return 0;
        }
        if (root.left == null && root.right == null){
            return 1;
        }
        return countLeaves(root.left) + countLeaves(root.right);
    }

    //print the leaf nodes
    public void printLeaves(Node root){
        if (root == null){
            return;
        }
        if (root.left == null && root.right == null){
            System.out.print(root.value + ", ");
        }
        printLeaves(root.left);
        printLeaves(root.right);
    }
}
