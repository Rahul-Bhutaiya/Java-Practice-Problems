package String.Assignment;

public class Question20 {
    public static void main(String[] args) {
        String input="PROGRAM";

        for(int i=0;i<input.length();i++){
            for(int j=0;j<=i;j++){
                System.out.print(input.charAt(j));
            }
            System.out.println();
        }
    }
}
