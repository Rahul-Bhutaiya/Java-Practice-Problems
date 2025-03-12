package String.Assignment;

public class Question18 {
    public static void main(String[] args) {
        String input="3805340";
        int result=0;
        for(int i=0;i<input.length();i++){
            int diff = input.charAt(i) - '0';
            result = (result*10)+diff;
        }
        System.out.println(result);
    }
}
