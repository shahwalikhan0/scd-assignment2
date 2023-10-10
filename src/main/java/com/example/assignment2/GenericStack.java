package com.example.assignment2;

import java.util.ArrayList;

class StackFullException extends Exception {
    public StackFullException(String message) {
        super(message);
    }
}
class StackEmptyException extends Exception {
    public StackEmptyException(String message) {
        super(message);
    }
}
public class GenericStack<T> {
    ArrayList<T> stack = new ArrayList<T>();
    int top = -1;
    int size;

    GenericStack(int size){
        this.size = size;
        this.stack = new ArrayList<T>(size);
    }
    void push(T el) throws StackFullException{
        if(top == size-1)
            throw new StackFullException("Cannot push(): Stack is full");
        else{
            top++;
            if(stack.size() > top)
                stack.set(top, el);
            else
                stack.add(el);
        }
    }
    T pop() throws StackEmptyException{
        if(top == -1){
            throw new StackEmptyException("Cannot pop(): Stack is empty");
        }
        else{
            T el = stack.get(top);
            top--;
            return el;
        }
    }

    boolean isEmpty() { return top == -1; }
    int size() { return top+1; }
    T top() throws StackEmptyException{
        if(top == -1){
            throw new StackEmptyException("Stack is empty");
        }
        else{
            return stack.get(top);
        }
    }
}
