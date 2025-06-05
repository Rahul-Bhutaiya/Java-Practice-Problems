import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main<T> {
    public static void main(String[] args) {
        Main<Integer> obj = new Main<>();
        obj.sum("10","20");
    }

    public <T> void sum(T item1,T item2){
//        System.out.println((int)item1+(int)item2);
        System.out.println("This is generic");
    }

    public void sum(Integer item1,Integer item2){
//        System.out.println(item1+item2);
        System.out.println("This is Integer");

    }

    Main(){
        System.out.println("This is default constructor");
    }
}

