package Binary_Tree;

//Find the Maximum Depth /  Height of given Binary Tree
public class Question4 {
    public static void main(String[] args) {
        BinaryTree bTree = new BinaryTree();
        bTree.root = new TreeNode(1);
        bTree.root.left = new TreeNode(2);
        bTree.root.right = new TreeNode(3);
        bTree.root.left.left = new TreeNode(4);
        bTree.root.left.right = new TreeNode(5);
        bTree.root.right.left = new TreeNode(6);
        bTree.root.right.right = new TreeNode(7);
//        bTree.root.right.left.left = new TreeNode(8);

        System.out.println(getMaxDepth(bTree.root));
    }

    public static int getMaxDepth(TreeNode root){
        if(root==null){
            return 0;
        }
        int leftDepth = getMaxDepth(root.left);
        int rightDepth = getMaxDepth(root.right);

        return 1+Math.max(leftDepth,rightDepth);
    }
}
