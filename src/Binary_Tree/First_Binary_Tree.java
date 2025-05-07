package Binary_Tree;
import java.util.LinkedList;
import java.util.Queue;

public class First_Binary_Tree {
    //              1
    //          2       3
    //      4     5   6    7
    public static void main(String[] args) {
        BTree bTree = new BTree();
        bTree.root = new Node(1);
        bTree.root.left = new Node(2);
        bTree.root.right = new Node(3);
        bTree.root.left.left = new Node(4);
        bTree.root.left.right = new Node(5);
        bTree.root.right.left = new Node(6);
        bTree.root.right.right = new Node(7);
        bTree.levelOrder();
        System.out.println();
        bTree.preOrder(bTree.root);
        System.out.println();
        bTree.inOrder(bTree.root);
        System.out.println();
        bTree.postOrder(bTree.root);

    }
}

class BTree{
    Node root;

    //BFS = Breadth First Search/Traversal
    public void levelOrder() {
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            Node node = queue.poll();
            System.out.print(node.data + " ");
            if (node.left != null){
                queue.add(node.left);
            }
            if (node.right != null){
                queue.add(node.right);
            }
        }
    }

    //DFS : Depth First Search/Traversal
    public void preOrder(Node root) {
        if (root == null){
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public void inOrder(Node root) {
        if (root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public void postOrder(Node root) {
        if (root == null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }
}

class Node{
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
    }
}