package Binary_Tree;

//Find an element from Binary tree
public class Question3 {
    public static boolean isExists = false;
    public static void main(String[] args) {
        BinaryTree bTree = new BinaryTree();
        bTree.root = new TreeNode(1);
        bTree.root.left = new TreeNode(2);
        bTree.root.right = new TreeNode(3);
        bTree.root.left.left = new TreeNode(4);
        bTree.root.left.right = new TreeNode(5);
        bTree.root.right.left = new TreeNode(6);
        bTree.root.right.right = new TreeNode(7);

        isPresent(bTree.root,1);
        System.out.println(isExists);

    }

    public static void isPresent(TreeNode root,int target){
        if(root==null){
            return;
        }
        if(root.data==target){
            isExists=true;
            return;
        }
        isPresent(root.left,target);
        if(!isExists) {
            isPresent(root.right, target);
        }
    }

    public static boolean isPresent2(TreeNode root,int target){
        if(root==null){
            return false;
        }
        if(root.data==target){
            return true;
        }

        return isPresent2(root.left,target) || isPresent2(root.right,target);
    }
}
