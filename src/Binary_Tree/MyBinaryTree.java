package Binary_Tree;

import java.util.LinkedList;
import java.util.Queue;

public class MyBinaryTree {

    public static void main(String[] args) {
        MyBinaryTree btree = new MyBinaryTree();
        btree.root = new TNode(1);
        btree.root.left=new TNode(2);
        btree.root.right = new TNode(3);
        btree.root.left.left = new TNode(4);
        btree.root.left.right = new TNode(5);
        btree.root.right.left = new TNode(6);
        btree.root.right.right = new TNode(7);
//        btree.levelOrderTraversal();
//        btree.preOrder(btree.root);
        btree.inOrder(btree.root);
//        btree.postOrder(btree.root);
    }

    TNode root;

    public MyBinaryTree(){

    }

    public MyBinaryTree(TNode root){
        this.root=root;
    }

    //Breadth First Search/Traversal
    public void levelOrderTraversal(){
        if(root==null){
            return;
        }
        Queue<TNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            TNode node = queue.poll();
            System.out.print(node.data+" ");
            if(node.left!=null){
                queue.add(node.left);
            }
            if(node.right!=null){
                queue.add(node.right);
            }
        }
    }

    //Depth First Search/Traversal

    //Pre-Order Traversal
    public static void preOrder(TNode root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    //In-Order Traversal
    public static void inOrder(TNode root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }

    //Post-Order Traversal
    public static void postOrder(TNode root){
        if(root==null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }
}

class TNode{
    TNode left;
    TNode right;
    int data;

    public TNode(int data){
        this.data=data;
    }
}