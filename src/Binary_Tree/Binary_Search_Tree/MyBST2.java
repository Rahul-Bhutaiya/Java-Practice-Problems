package Binary_Tree.Binary_Search_Tree;

public class MyBST2 {

    public static void main(String[] args) {
        int[] arr = {10,50,8,22,55,17,20,19};
        Node root=null;

        for(int i=0;i<arr.length;i++){
            root = insert(root,arr[i]);
        }

        printAsc(root);
        delete(root,17);
        System.out.println();
        printAsc(root);
//        System.out.println();
//        printDesc(root);
        System.out.println();

//        System.out.println(search(root,-220));

    }

    //Average case time complexity  = O(log n)
    //Worst case time complexity  = O(n) // for Skwed Binary Tree
    public static Node insert(Node root, int value){
        if(root==null){
            return new Node(value);
        }
        if(root.val>value){
            root.left = insert(root.left,value);
        }
        else{
            root.right = insert(root.right,value);
        }
        return root;
    }

    //Average case time complexity  = O(log n)
    //Worst case time complexity  = O(n) // for Skwed Binary Tree
    public static boolean search(Node root, int target){
        if(root==null){
            return false;
        }
        if(root.val==target){
            return true;
        }
        if(root.val>target){
            return search(root.left,target);
        }
        return search(root.right,target);
    }

    public static Node delete(Node root, int target){
        if(root==null) return null;

        if(root.val>target){
            root.left = delete(root.left,target);
        }
        else if(root.val<target){
            root.right = delete(root.right,target);
        }
        else{
            if(root.left==null){
                return root.right;
            }
            if(root.right==null){
                return root.left;
            }
            root.val = getRightMostSuccessor(root.right);
            root.right = delete(root.right,root.val);
//            getLeftMostSuccessor(root.left);
        }
        return root;
    }

    public static int getRightMostSuccessor(Node root){
        int min=0;
        while (root!=null){
            min=root.val;
            root=root.left;
        }
        return min;
    }
    public static int getLeftMostSuccessor(Node root){
        int min=0;
        while (root!=null){
            min=root.val;
            root=root.right;
        }
        return min;
    }


    //In-Order Traversal and ascending order print
    public static void printAsc(Node root){
        if(root==null){
            return;
        }
        printAsc(root.left);
        System.out.print(root.val+" ");
        printAsc(root.right);
    }

    //In-Order Traversal and descending order print
    public static void printDesc(Node root){
        if(root==null){
            return;
        }
        printDesc(root.right);
        System.out.print(root.val+" ");
        printDesc(root.left);
    }
}
