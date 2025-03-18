package Stack.CustomStack;

public class CustomStackString{
    private char[] data;
    private int top=-1;
    public CustomStackString(){
        data=new char[10];
    }
    public CustomStackString(int size){
        data=new char[size];
    }
    public boolean push(char ch){
        if(top==data.length-1){
            System.out.println("Stack is Overflow");
            return false;
        }
        top++;
        data[top]=ch;
        return true;
    }
    public char pop(){
        if(top==-1){
            System.out.println("Stack is underflow");
            return ' ';
        }
        top--;
        return data[top+1];
    }
    public boolean isEmpty(){
        if(top==-1) {
            return true;
        }
        return false;
    }
    public void printReverse(){
        while (!isEmpty()){
            char ch=pop();
            System.out.print(ch);
        }
    }

    public static void printReverseIndividualWordsFromGivenSentence(String sentence){
        CustomStackString stackObj=new CustomStackString(sentence.length());

        for(int i=0;i<=sentence.length();i++){
            if(i<sentence.length() && sentence.charAt(i)!=' '){
                stackObj.push(sentence.charAt(i));
            }
            else if(i==sentence.length() || sentence.charAt(i)==' '){
                while (!stackObj.isEmpty()){
                    char ch = stackObj.pop();
                    System.out.print(ch);
                }
                if(i!=sentence.length()){
                    System.out.print(" ");
                }
            }
        }
    }
}
