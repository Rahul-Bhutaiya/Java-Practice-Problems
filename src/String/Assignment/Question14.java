package String.Assignment;

//Check if all words are palindrome in given string // madam eye nitin
public class Question14 {
    public static void main(String[] args) {
        String input="madam eye bnb nitin";
        System.out.println(AnswerQ14.isStringPalindrome(input));
    }
}

class AnswerQ14{
    static boolean isStringPalindrome(String input){//T=O(n)   S=O(n)
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
