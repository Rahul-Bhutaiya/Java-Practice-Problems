package String.Assignment;

//Check if all words are palindrome in given string // madam eye nitin
public class Question14 {
    public static void main(String[] args) {
        String input="madam eye bnb nitin";
        //method:1 //T=O(n)   S=O(n) Auxiliary=O(n)
//        System.out.println(AnswerQ14.isStringPalindrome(input));

        //method:2 //T=O(n)   S=O(n) Auxiliary=O(1)
        int left=0,right=1;
        while (right<input.length()){
            if(input.charAt(right)==' ' || right==input.length()-1){
                int rightIndex=right==input.length()-1?right:right-1;
                if(!(AnswerQ14M2.isPalindrome(input,left,rightIndex))){
                    System.out.println("Not Palindrome");
                    return ;
                }
                left=right+1;
                right=left+1;
            }
            else{
                right++;
            }
        }
        System.out.println("Palindrome");
    }
}

class AnswerQ14{
    static boolean isStringPalindrome(String input){//T=O(n)   S=O(n) Auxiliary=O(n)
        String[] strArr=input.split(" ");

        for(String eachWord:strArr){
            int left=0,right=eachWord.length()-1;

            while (left<right){
                if(eachWord.charAt(left)!=eachWord.charAt(right)){
                    return false;
                }
                left++;
                right--;
            }
        }
        return true;
    }
}

class AnswerQ14M2{
    static boolean isPalindrome(String input,int left,int right){
        while(left<right){
            if(input.charAt(left)!=input.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
