// package com.kris;

public class Stack {
    private int[] items;
    private int size;
    private int top;

    public Stack(){
        items = new int[1000];
        size = 0;
        top = -1;
    }

    /** Push x on the top of the stack.  */
    public void push(int x){
        if (size == items.length) {
            resize(items.length * 2);  // dynamic resizing (doubling)
        }
        top += 1;
        items[top] = x;
        size += 1;
    }

    /** Remove and return the element of the top of the stack.  */
    public int pop(){
        int x = items[top];
        top -= 1;
        size -=1 ;
        return x;
    }

    /** Return the number of elements in the stack.  */
    public int size(){
        return size;
    }


    /** Return the sum of the elements in the stack.  */
    public int sum(){
       int sum = 0;
       for (int i = 0; i < size; i++){
        sum += items[i];
       }
       return sum;
    }
    /** Resize internal array. */
    private void resize(int capacity) {
        int[] newArr = new int[capacity];
        System.arraycopy(items, 0, newArr, 0, size);
        items = newArr;
    }


    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(10);
        s.push(100);

        // System.out.println(s.pop());
        System.out.println(s.size());
        System.out.println(s.sum());

        
    }
}
