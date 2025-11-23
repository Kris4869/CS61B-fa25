// package com.kris;
public class StackClient {
    public static Stack flipped(Stack s){
        Stack new_s = new Stack();

        while (s.size() != 0) {
            new_s.push(s.pop());
        }
        return new_s;
    }
}
