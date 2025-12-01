// package com.kris;
public class ArrayExercises {
    /** Returns the second to last item in the given array.
     *  Assumes the array has at least 2 elements. */
    public static String secondToLastItem(String[] items) {
        // TODO: Implement this method

        for (int i = 0; i < items.length; i++){
            if (i == items.length - 2){
                return items[i];
            }
        }
        return null;
    }    

    /** Returns the difference between the minimum and maximum item in the given array */
    public static int minMaxDifference(int[] items) {
        // TODO: Implement this method

        int min = items[0];
        int max = items[0];

        for (int i = 1; i < items.length; i++){
            // iterate to find the minimum
            if (min > items[i]){
                min = items[i];
            }
            // iterate to find the maximum
            if (max < items[i]){
                max = items[i];
            }
        }
        // calculate the difference
        int difference = max - min;
        return difference;
         
    }
}
