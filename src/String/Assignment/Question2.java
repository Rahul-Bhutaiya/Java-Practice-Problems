package String.Assignment;

//Reverse a String
public class Question2 {
    public static void main(String[] args) {
        String s="Rohit Sharma";

//        Method:1 --> T=O(n)  S=O(n)
//        String rev="";
//
//        for(int i=s.length()-1;i>=0;i--){
////            rev=rev.concat(String.valueOf(s.charAt(i)));
//            rev=rev+s.charAt(i);
//        }
//        System.out.println(rev);


//        Method:2 --> T=O(n)  S=O(n)
        char[] charArr=s.toCharArray(); //O(n)

        int left=0,right=charArr.length-1;
        while (left<right){//O(n)
            char temp=charArr[left];
            charArr[left]=charArr[right];
            charArr[right]=temp;
            left++;
            right--;
        }
        String rev=new String(charArr);//O(n)
        System.out.println(rev);
    }
}
