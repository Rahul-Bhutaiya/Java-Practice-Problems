package Binary_Tree;

import java.util.Stack;

//post-order Tree Traversal without Recursion
public class Question8 {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70};
        TNode root = Question5.createBinaryTree(arr);

        MyBinaryTree.postOrder(root);
        System.out.println();
        postOrder(root);
    }

    public static void postOrder(TNode root){
        if(root==null) return;

        Stack<TNode> stack1 = new Stack<>();
        Stack<TNode> stack2 = new Stack<>();

        stack1.push(root);

        while (!stack1.isEmpty()){
            TNode node = stack1.pop();
            stack2.push(node);

            if(node.left!=null){
                stack1.push(node.left);
            }
            if(node.right!=null){
                stack1.push(node.right);
            }
        }

        while (!stack2.isEmpty()){
            TNode node = stack2.pop();
            System.out.print(node.data + " ");
        }
    }
}
