package Binary_Tree;

import java.util.LinkedList;
import java.util.Queue;

// Create binary tree from an array - level order fashion
public class Question5 {
    public static void main(String[] args) {
//        int[] arr = {};
//        TNode root = createBinaryTree(arr);
//        MyBinaryTree binaryTree = new MyBinaryTree(root);
//        binaryTree.levelOrderTraversal();
    }

    public static TNode createBinaryTree(int[] arr){
        if(arr.length==0){
            return null;
        }

        TNode root = new TNode(arr[0]);
        Queue<TNode> queue = new LinkedList<>();
        queue.add(root);
        int i=1;

        while (i<arr.length){
            TNode current = queue.poll();

            if(i<arr.length){
                current.left = new TNode(arr[i]);
                i++;
                queue.add(current.left);
            }

            if(i<arr.length){
                current.right = new TNode(arr[i]);
                i++;
                queue.add(current.right);
            }
        }
        return root;
    }
}
