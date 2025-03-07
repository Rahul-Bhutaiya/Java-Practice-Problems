package String.Assignment;

//Print a string in reverse order
public class Question1 {
    public static void main(String[] args) {
        String name="Rohit Sharma";

        for(int i=name.length()-1;i>=0;i--){
            System.out.print(name.charAt(i));
        }
    }
}
