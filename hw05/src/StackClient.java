// package com.kris;

import java.util.ArrayList;

public class StackClient {
    public static Stack flipped(Stack s){
        Stack new_s = new Stack();

        while (s.size() != 0) {
            new_s.push(s.pop());
        }
        return new_s;
    }
    public static void main(String[] args) {
        int N = 1000000;
        long startMs = System.currentTimeMillis();

        Stack s = new Stack(); // avoid resizes
        for (int i = 1; i <= N; i += 1) {
            s.push(i);
        }

        for (int i = 1; i <= N; i += 1) {
            s.pop();
        }
        
        long endMs = System.currentTimeMillis();
        long diff = endMs - startMs;
        System.out.println("Took " + diff + " millliseconds.");
    }
}
