package Binary_Tree.Binary_Search_Tree;

import java.util.ArrayList;

public class MyBST {

    public static void main(String[] args) {
//        int[] arr = {10,8,21,7,27,5,4,3};
//        int[] arr = {55,50,8,21,25,11,55,2,2};
//
//        Node root=null;
//
//        for(int i=0;i<arr.length;i++){
//            root = insert(root,arr[i]);
//        }
//
//        print(root);
//        System.out.println(search(root,55));

    }

    public static Node insert(Node root,int value){
        if(root==null){
            Node node = new Node(value);
            return node;
        }
        if(value<root.val){
            root.left = insert(root.left,value);
        }
        else{
            root.right = insert(root.right,value);
        }
        return root;
    }

    public static void print(Node root){
        if(root==null) return;
        print(root.left);
        System.out.print(root.val+" ");
        print(root.right);
    }

    public static boolean search(Node root,int target){
        if(root==null) return false;

        if(target==root.val){
            return true;
        }

        if(target<root.val){
            return search(root.left,target);
        }

        return search(root.right,target);
    }
    public static Node delete(Node root, int data) {
        if (root == null) return root;

        if (data < root.val) {
            root.left = delete(root.left, data);
        } else if (data > root.val) {
            root.right = delete(root.right, data);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            root.val = Find(root.right);
            root.right = delete(root.right, root.val);
        }
        return root;
    }

    private static int Find(Node root) {
        int val = root.val;
        while (root.left != null) {
            val = root.left.val;
            root = root.left;
        }
        return val;
    }
}


