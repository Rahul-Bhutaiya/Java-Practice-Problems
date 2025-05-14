package Binary_Tree;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

//pre-order Tree Traversal without Recursion
public class Question7 {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70,80,90,100,110,120,130,140,150};
        TNode root = Question5.createBinaryTree(arr);

        MyBinaryTree.preOrder(root);
        System.out.println();
        preOrder(root);

        Deque<Integer> dq = new LinkedList<>();
//        dq.addFirst();
    }

    public static void preOrder(TNode root){
        if(root == null) return;

        Stack<TNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()){
            TNode node = stack.pop();
            System.out.print(node.data + " ");

            if(node.right!=null){
                stack.push(node.right);
            }
            if(node.left!=null){
                stack.push(node.left);
            }
        }
    }
}
