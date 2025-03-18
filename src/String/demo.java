package String;

public class demo {
    public static void main(String[] args) {
        String s = "  the sky is blue  ";

        StringBuilder sb=new StringBuilder();
        boolean spaceAllowed=false;


        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch==' ' && spaceAllowed){
                sb.append(' ');
                spaceAllowed=false;
            }
            else if(ch!=' '){
                sb.append(ch);
                spaceAllowed=true;
            }
        }

        if(sb.charAt(sb.length()-1) == ' '){
            sb.deleteCharAt(sb.length()-1);
        }

        StringBuilder sb2=new StringBuilder();
        int lastCharIndex=sb.length();
        
        for(int i=sb.length()-1;i>=-1;i--){
            if(i==-1 || sb.charAt(i)==' '){
                String s2=sb.substring(i+1,lastCharIndex);
                sb2.append(s2);
                if(i!=-1){
                    sb2.append(' ');
                }
                lastCharIndex=i;
            }
        }

//        int left=0,right=sb.length()-1;
//        while(left<right){
//            char temp = sb.charAt(left);
//            sb.setCharAt(left,sb.charAt(right));
//            sb.setCharAt(right,temp);
//            left++;
//            right--;
//        }
//


        System.out.println(sb2);

    }

//    public static String getReverse(){
//
//    }
}
