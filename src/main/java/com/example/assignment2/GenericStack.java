package com.example.assignment2;

import java.util.ArrayList;

public class GenericStack<T> {
    ArrayList<T> stack = new ArrayList<T>();
    int top = -1;
    int size;

    GenericStack(int size){
        this.size = size;
        this.stack = new ArrayList<T>(size);
    }
    void push(T el){
        if(top == size-1){
            System.out.println("Can not push() Stack is full");
        }
        else{
            top++;
            if(stack.size() > top)
                stack.set(top, el);
            else
                stack.add(el);
        }
    }
    T pop(){
        if(top == -1){
            System.out.println("Can not pop() Stack is empty");
            return null;
        }
        else{
            T el = stack.get(top);
            top--;
            return el;
        }
    }
    boolean isEmpty() { return top == -1; }
    int size() { return top+1; }
    T top(){
        if(top == -1){
            System.out.println("Stack is empty");
            return null;
        }
        else{
            return stack.get(top);
        }
    }
}
