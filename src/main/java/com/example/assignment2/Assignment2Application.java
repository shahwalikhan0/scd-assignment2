package com.example.assignment2;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class Assignment2Application {
    public static List<int[]> mergeIntervals(List<int[]> intervals) {
        if (intervals.isEmpty()) {
            return intervals;
        }

        List<int[]> mergedIntervals = new ArrayList<>();
        int[] currentInterval = intervals.get(0);

        for (int i = 1; i < intervals.size(); i++) {
            int[] nextInterval = intervals.get(i);

            if (currentInterval[1] >= nextInterval[0]) {
                currentInterval[1] = Math.max(currentInterval[1], nextInterval[1]);
            } else {
                mergedIntervals.add(currentInterval);
                currentInterval = nextInterval;
            }
        }
        mergedIntervals.add(currentInterval);
        return mergedIntervals;
    }

    public static void main(String[] args) throws StackFullException, StackEmptyException {
        //task 1
//        System.out.println("Enter stack size: ");
//        Scanner sc=new Scanner(System.in);
//        int size=sc.nextInt();
//
//        GenericStack<Integer> stack = new GenericStack<Integer>(size);
//
//        for(int i=0;i<size;i++){
//            int el;
//            System.out.println("Enter element: ");
//            el=sc.nextInt();
//            stack.push(el);
//        }
//        System.out.println("Popped element: "+ stack.pop());
//        System.out.println("Popped element: "+ stack.pop());
//        System.out.println("Stack size: " + stack.size());
//        System.out.println("Is Empty: " + stack.isEmpty());



        //task 2
        FirstNonRepeatingStream str = new FirstNonRepeatingStream();
//        str.printStored();
        str.add('a');
        str.add('b');
        str.add('a');
        str.add('b');
//        str.getFirstNonRepeating();

        //task 3
        List<int[]> intervals = new ArrayList<>();
        intervals.add(new int[]{1, 3});
        intervals.add(new int[]{2, 6});
        intervals.add(new int[]{8, 10});
        intervals.add(new int[]{15, 18});

        List<int[]> mergedIntervals = mergeIntervals(intervals);
        for (int[] interval : mergedIntervals) {
            System.out.print("[" + interval[0] + ", " + interval[1] + "] ");
        }
    }
}
