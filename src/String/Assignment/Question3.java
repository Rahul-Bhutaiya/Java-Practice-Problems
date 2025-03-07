package String.Assignment;

//check if a String is Palindrome?
public class Question3 {
    public static void main(String[] args) {
        String input="madam";
//        String input="madaxdam";
        int left=0,right=input.length()-1;

        while (left<right){
            if(input.charAt(left)!=input.charAt(right)){
                System.out.println("Not Palindrome");
                return;
            }
            left++;
            right--;
        }
        System.out.println("Palindrome");
    }
}
//T=O(n)
//Total Space=O(n)
//Auxiliary Space=O(1)