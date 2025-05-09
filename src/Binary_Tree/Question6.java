package Binary_Tree;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

//ZigZag level order traversal
public class Question6 {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70,80,90,100,110,120,130,140,150,160,170,180};
        TNode root = Question5.createBinaryTree(arr);

        zigzag2(root);
    }

    //By - Sir
    private static void ZigZag(TNode root) {
        Deque<TNode> deque = new LinkedList<>();
        deque.add(root);
        boolean flag = true;

        while (!deque.isEmpty()){
            int size = deque.size();

            if(flag){
                while (size>0){
                    TNode node = deque.pollFirst();
                    System.out.print(node.data + " ");
                    if(node.left!=null){
                        deque.addLast(node.left);
                    }
                    if(node.right!=null){
                        deque.addLast(node.right);
                    }
                    size--;
                }
                flag=false;
            }
            else{
                while (size>0){
                    TNode node = deque.pollLast();
                    System.out.print(node.data + " ");
                    if(node.right!=null){
                        deque.addFirst(node.right);
                    }
                    if(node.left!=null){
                        deque.addFirst(node.left);
                    }
                    size--;
                }
                flag=true;
            }
        }
    }

    //By - Me
    public static void zigzag2(TNode root){
        Deque<TNode> deque = new LinkedList<>();
        deque.add(root);
        boolean flag = true;

        while (!deque.isEmpty()){
            int size = deque.size();
            if(flag){
                while (size>0) {
                    TNode node = deque.pollFirst();
                    System.out.print(node.data + " ");

                    if (node.left != null) {
                        deque.addLast(node.left);
                    }
                    if(node.right!=null){
                        deque.addLast(node.right);
                    }
                    size--;
                }
                flag=false;
            }
            else{
                while (size>0){
                    TNode node = deque.pollLast();
                    System.out.print(node.data + " ");
                    if(node.right!=null){
                        deque.addFirst(node.right);
                    }
                    if(node.left!=null){
                        deque.addFirst(node.left);
                    }
                    size--;
                }
                flag=true;
            }
        }
    }
}