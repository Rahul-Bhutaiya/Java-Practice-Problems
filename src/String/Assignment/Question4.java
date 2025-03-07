package String.Assignment;

//count number of words in a String (with / without split function)
public class Question4 {
    public static void main(String[] args) {
        String input="Add Zero Group Rahul";
        System.out.println(AnswerQ4.getCountUsingSplit(input));
        System.out.println(AnswerQ4.getCountWithoutSplit(input));
    }
}

class AnswerQ4{

    public static int getCountUsingSplit(String input){//T=O(n)   S=O(n) Auxiliary = O(1)
        return input.split(" ").length;
    }

    public static int getCountWithoutSplit(String input){//T=O(n)   S=O(n) Auxiliary = O(1)
        int spaceCount=0;

        for(int i=0;i<input.length();i++){
            if(input.charAt(i)==' '){
                spaceCount++;
            }
        }
        return ++spaceCount;
    }
}
