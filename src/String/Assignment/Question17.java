package String.Assignment;

public class Question17 {
    public static void main(String[] args) {
        String s1="Rahul",s2="Rohit";

        char[] chS1=s1.toCharArray();
        char[] chS2=s2.toCharArray();

        for(int i=0;i<chS1.length;i++){
            char temp=chS1[i];
            chS1[i]=chS2[i];
            chS2[i]=temp;
        }

        s1=new String(chS1);
        s2=new String(chS2);

        System.out.println(s1);//Rohit
        System.out.println(s2);//Rahul

    }
}
