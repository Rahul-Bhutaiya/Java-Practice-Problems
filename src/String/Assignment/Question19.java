package String.Assignment;

public class Question19 {
    public static void main(String[] args) {
        String s1="abacc",s2="aabcd";
//        String s1="aabb",s2="bbaa";

        if(s1.length()!=s2.length()){
            System.out.println("Not Permuting");
            return ;
        }

        int[] asc=new int[128];

        for(int i=0;i<s1.length();i++){
            asc[s1.charAt(i)]++;
            asc[s2.charAt(i)]--;
        }

        for(int i=0;i<128;i++){
            if(asc[i]!=0){
                System.out.println("Not Permuting");
                return;
            }
        }
        System.out.println("Permuting");
    }
}
