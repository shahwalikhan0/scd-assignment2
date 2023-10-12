package com.example.assignment2;

import java.util.HashMap;
import java.util.Queue;

public class FirstNonRepeatingStream {
    HashMap<Character, Boolean> stored = new HashMap<Character, Boolean>();
    Queue<Character> characterQueue = new java.util.LinkedList<>();

    public void add(char a){
        if(characterQueue.isEmpty()){
            characterQueue.add(a);
            stored.put(a, true);
        }
        else if(characterQueue.peek() == a){
            characterQueue.remove();
            stored.put(a, true);
        }
        else if(!stored.containsKey(a)){
            characterQueue.add(a);
            stored.put(a, true);
        }
    }
    public void getFirstNonRepeating(){
        if(characterQueue.isEmpty()){
            System.out.println("No non-repeating character: NULL");
        }
        else{
            System.out.println("First non-repeating character is " + characterQueue.peek());
        }
    }
}
