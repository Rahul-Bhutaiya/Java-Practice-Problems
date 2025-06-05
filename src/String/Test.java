package String;

import Binary_Tree.Test1;

import java.util.HashSet;

class Test {
    public static void main(String[] args) {
        String[] emails ={"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
        numUniqueEmails(emails);

    }
    public static int numUniqueEmails(String[] emails) {
        HashSet<String> hashSet = new HashSet<>();

        for(String email:emails){
            hashSet.add(getValidEmail(email));
        }

        System.out.println(hashSet);
        return hashSet.size();
    }

    public static String getValidEmail(String email){
        StringBuilder sb = new StringBuilder();
        int index = email.indexOf("@");
        for(int i=0;i<index;i++){
            char ch = email.charAt(i);
            if(ch=='.'){
                continue;
            }
            if(ch=='+'){
                break;
            }
            else{
                sb.append(ch);

            }
        }

        sb.append(email.substring(index));

        return sb.toString();
    }
}
