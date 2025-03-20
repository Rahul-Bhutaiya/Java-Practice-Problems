package Stack.StackUsingCollectionFramework;

public class Question11 {
    public static void main(String[] args) {
        twoStack arObj1=new twoStack(10);
        arObj1.push1(10);
        arObj1.push2(100);
        arObj1.push2(200);
        arObj1.push2(300);
        arObj1.push1(20);
        arObj1.push1(30);
        arObj1.push1(40);
        arObj1.push1(50);
        arObj1.push2(400);
        arObj1.push2(500);

        System.out.println(arObj1.peek1());
        System.out.println(arObj1.peek2());
    }
}

class twoStack{
    private int[] array;
    private int top1,top2;

    public twoStack(int arraySize){
        array=new int[arraySize];
        top1=-1;
        top2=array.length;
    }

    public twoStack(){
        this(50);
    }

    public void push1(int num){
        if(top1+1==top2){
            System.out.println("Stack is Overflow");
            return;
        }
        top1++;
        array[top1]=num;
    }

    public void push2(int num){
        if(top1==top2-1){
            System.out.println("Stack is Overflow");
            return;
        }
        top2--;
        array[top2]=num;
    }

    public int pop1(){
        if(top1==-1){
            System.out.println("Stack is Underflow");
            return -1;
        }
        top1--;
        return array[top1+1];
    }

    public int pop2(){
        if(top2==array.length){
            System.out.println("Stack is Underflow");
            return -1;
        }
        top2++;
        return array[top2-1];
    }

    public int peek1(){
        if(top1==-1){
            System.out.println("Stack is Underflow");
            return -1;
        }
        return array[top1];
    }

    public int peek2(){
        if(top2==array.length){
            System.out.println("Stack is Underflow");
            return -1;
        }
        return array[top2];
    }

    public boolean isEmpty1(){
        return top1==-1;
    }

    public boolean isEmpty2(){
        return top2==array.length;
    }

    public int size1(){
        return top1+1;
    }

    public int size2(){
        return array.length-top2;
    }
}