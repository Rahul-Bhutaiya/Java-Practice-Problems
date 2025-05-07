package Binary_Tree;

// Find n-th node of inorder traversal
public class Question2 {
    public static int currentCounter = 0;
    public static int nthValue = 0;

    public static void main(String[] args) {
        BinaryTree bTree = new BinaryTree();
        bTree.root = new TreeNode(1);
        bTree.root.left = new TreeNode(2);
        bTree.root.right = new TreeNode(3);
        bTree.root.left.left = new TreeNode(4);
        bTree.root.left.right = new TreeNode(5);
        bTree.root.right.left = new TreeNode(6);
        bTree.root.right.right = new TreeNode(7);

        System.out.println(nthValue);
        countNth(bTree.root,7);
        System.out.println(nthValue);

    }


    public static void countNth(TreeNode root,int nth){
        if(root==null){
            return;
        }
        countNth(root.left,nth);
        currentCounter++;
        if(currentCounter==nth){
            nthValue=root.data;
        }
        else if(currentCounter<nth){
            countNth(root.right,nth);
        }
    }

    public static TreeNode countNth2(TreeNode root,int[] counter,int nth){
        if(root==null){
            return null;
        }
        TreeNode node = countNth2(root.left,counter,nth);

        if(node!=null){
            return node;
        }

        counter[0]++;
        if(counter[0]==nth){
            return root;
        }

        return countNth2(root.right,counter,nth);
    }
}
