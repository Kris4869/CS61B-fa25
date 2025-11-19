package com.kris;
import java.util.ArrayList;
import java.util.List;

import edu.princeton.cs.algs4.In;

public class ListExercises {
    /** Returns the total sum in a list of integers */
    public static int sum(List<Integer> L) {
        // TODO: Implement this method
        // List L is not empty
        if (L.isEmpty() == false){
            int sum = 0;
            for (int e : L){
                sum += e;
            }
            return sum;
        }
        return 0;
    }

    /** Returns a list containing the even numbers of the given list */
    public static List<Integer> evens(List<Integer> L) {
        // TODO: Implement this method
        // List L is not empty
        if (L.isEmpty() == false){
            List<Integer> newL = new ArrayList<>();

            for (int i = 0; i < L.size(); i++){
                if (L.get(i) % 2 == 0){
                    newL.add(L.get(i));
                }
            }
            return newL;
        }


        return null;
    }

    /** Returns a list containing the common item of the two given lists */
    public static List<Integer> common(List<Integer> L1, List<Integer> L2) {
        // TODO: Implement this method

        // I have a question: do I need to consider deduplication?

        List<Integer> commonL = new ArrayList<>();
        for (int i = 0; i < L1.size(); i++){
            for (int j = 0; j < L2.size(); j++){
                if (L1.get(i) == L2.get(j)){
                    commonL.add(L1.get(i));
                    break;
                }
            }
        }
        // commomL is not empty
        if (commonL.isEmpty() == false){
            return commonL;
        }
        return new ArrayList<Integer>();
    }
    public static void main(String[] args) {
        List<Integer> L1 = new ArrayList<>();
        L1.add(1);
        L1.add(2);
        L1.add(3);
        L1.add(4);
        L1.add(5);
        L1.add(6);

        List<Integer> L2 = new ArrayList<>();
        L2.add(4);
        L2.add(5);
        L2.add(6);
        L2.add(7);
        L2.add(8);
        L2.add(9);

        List<Integer> L3 = common(L1, L2);
        System.out.println(new ArrayList<>());
    }

    public static int countOccurrencesOfWord(List<String> words, String w) {
        // TODO: Implement this method

        int count = 0;
        for (int i = 0; i < words.size(); i++){
            if (words.get(i).equals(w)){
                count += 1;
            }
        }
        return count;
    }

    /** Returns the number of occurrences of the given character in a list of strings. */
    public static int countOccurrencesOfC(List<String> words, char c) {
        // TODO: Implement this method
        int count = 0;
        for (int i = 0; i < words.size(); i++){
            for (int j = 0; j < words.get(i).length(); j++){
                if (words.get(i).charAt(j) == c){
                    count += 1;
                }
            }
        }
        return count;
    
    }
}
