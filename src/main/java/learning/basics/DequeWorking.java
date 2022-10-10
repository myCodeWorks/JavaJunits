package learning.basics;

import java.util.ArrayDeque;


public class DequeWorking {

    public static void main(String[] args) {
        //Double ended queue - can add element at the beginning or at the end

        ArrayDeque<Integer> aDQ = new ArrayDeque<Integer>();
        aDQ.add(2345);
        //Can add item at the beginning
        aDQ.addFirst(123);
        aDQ.add(234);
        //Can add item at the end
        aDQ.addLast(321);

        System.out.println(aDQ);

        //can also remove an element which is at the beginning or at the end
        aDQ.remove();
        System.out.println(aDQ);
        aDQ.removeFirst();
        System.out.println(aDQ);

        aDQ.removeLast();
        System.out.println(aDQ);
        System.out.println(aDQ);
    }
}
