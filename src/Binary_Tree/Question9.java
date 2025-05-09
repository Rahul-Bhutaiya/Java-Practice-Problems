package Binary_Tree;

import java.util.Stack;

// in-order Tree Traversal without Recursion
public class Question9 {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70};
        TNode root = Question5.createBinaryTree(arr);

        MyBinaryTree.inOrder(root);
        System.out.println();
        inOrder(root);
    }

    public static void inOrder(TNode root){
        if(root==null)return;

        Stack<TNode> stack = new Stack<>();
        TNode current = root;

        while (current!=null || !stack.isEmpty()){
            while (current!=null){
                stack.push(current);
                current=current.left;
            }
            TNode node = stack.pop();
            System.out.print(node.data+" ");
            current=node.right;
        }
    }
}
