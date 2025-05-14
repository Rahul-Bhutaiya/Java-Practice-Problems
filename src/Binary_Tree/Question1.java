package Binary_Tree;

import java.util.LinkedList;
import java.util.Queue;

//Count nodes in binary tree
public class Question1 {
    static int counter = 0;
    public static void main(String[] args) {
        BinaryTree bTree = new BinaryTree();
        bTree.root = new TreeNode(1);
        bTree.root.left = new TreeNode(2);
        bTree.root.right = new TreeNode(3);
        bTree.root.left.left = new TreeNode(4);
        bTree.root.left.right = new TreeNode(5);
        bTree.root.right.left = new TreeNode(6);
        bTree.root.right.right = new TreeNode(7);
//        bTree.root.left.left.left = new TreeNode(8);
//        System.out.println(counter);
//        countNode(bTree.root);
//        System.out.println(counter);

//        System.out.println(countNode2(bTree.root));

        System.out.println(countNode3(bTree.root));

//        single line value change of two variables
//        int a =10;
//        int b =20;
//        System.out.println(a+" "+b);
//        a=a+b-(b=a);
//        System.out.println(a+" "+b);
    }


    //Method : 1 ==> Using global/static variable
    public static void countNode(TreeNode root){
        if(root==null){
            return;
        }
        //pre-order traversal
        counter++;
        countNode(root.left);
        countNode(root.right);
    }

    //Method : 2 ==> Without global/static variable
    public static int countNode2(TreeNode root){
        if(root==null){
            return 0;
        }
        return 1+countNode2(root.left)+countNode2(root.right);
    }

    //Method : 3 ==> Using Breadth First Traversal or Level Order Traversal
    public static int countNode3(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int count = 0;

        while (!queue.isEmpty()){
            TreeNode node = queue.poll();
            count++;
            if(node.left!=null){
                queue.add(node.left);
            }
            if(node.right!=null){
                queue.add(node.right);
            }
        }
        return count;
    }
}
