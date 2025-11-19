package com.kris;

public class Dessert{
    int flavor = 0;
    int price = 0;
    static int numDesserts = 0;

    public Dessert(int flavor, int price){
        this.flavor = flavor;
        this.price = price;
        numDesserts += 1;
    }
    
    public void printDessert(){
        System.out.print(this.flavor);
        System.out.print(" ");
        System.out.print(this.price);
        System.out.print(" ");
        System.out.print(numDesserts);
        System.out.println();
    }



    public static void main(String[] args) {
        System.out.println("I love dessert!");
    }
}
