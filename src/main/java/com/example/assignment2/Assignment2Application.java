package com.example.assignment2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class Assignment2Application {

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
        str.getFirstNonRepeating();

        //task 3
    }
}
