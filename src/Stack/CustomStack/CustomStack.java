package Stack.CustomStack;

public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE=10;
    public int top=-1;

    public CustomStack(int size){
        data=new int[size];
    }
    public CustomStack(){
        this(DEFAULT_SIZE);
    }

    public boolean push(int num){
        if(top==data.length-1){
            System.out.println("Stack is Overflow");
            return false;
        }
        top++;
        data[top]=num;
        return true;
    }

    public int pop(){
        if(top==-1){
            System.out.println("Stack is underflow");
            return 0;
        }
        top--;
        return data[top+1];
    }

    public int peek(){
        return data[top];
    }

    public boolean isEmpty(){
        if(top==-1){
            return true;
        }
        return false;
    }

    public int size(){
        return top+1;
    }

    public void print(){
        while (!isEmpty()){
            int num=pop();
            System.out.println(num);
        }
    }
}
