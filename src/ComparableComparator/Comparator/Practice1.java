package ComparableComparator.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Practice1 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(54);
        numbers.add(2);
        numbers.add(55);
        numbers.add(22);
        numbers.add(7);
        numbers.add(5);
        numbers.add(44);
        numbers.add(77);


//        sorting numbers in natural order
//        numbers.sort(null);
//        Collections.sort(numbers);

        System.out.println(numbers);
//        Collections.sort(numbers,new IntegerDesc());
//        Collections.sort(numbers,(n1,n2)->n2-n1);
//        Collections.sort(numbers,new DescendingNumber());
        numbers.sort(new DescendingNumber());
        System.out.println(numbers);

    }
}

class IntegerDesc implements Comparator<Integer>{
    @Override
    public int compare(Integer o, Integer o2) {
        return o-o2;
    }
}

class DescendingNumber implements Comparator<Integer>{
    @Override
    public int compare(Integer n1, Integer n2) {
        return n2-n1;
    }
}
