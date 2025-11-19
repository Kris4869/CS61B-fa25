
package com.kris;import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MapExercises {
    /** Returns a map from every lower case letter to the number corresponding to that letter, where 'a' is
     * 1, 'b' is 2, 'c' is 3, ..., 'z' is 26.
     */
    public static Map<Character, Integer> letterToNum() {
        // TODO: Implement this method
        Map<Character,Integer> M = new TreeMap<>();
        for (int i = 0; i < 26; i ++){
            M.put((char)('a' + i), i + 1);
        }
        return M;
    }

    /** Returns a map from the integers in the list to their squares. For example, if the input list
     *  is [1, 3, 6, 7], the returned map goes from 1 to 1, 3 to 9, 6 to 36, and 7 to 49.
     */
    public static Map<Integer, Integer> squares(List<Integer> nums) {
        // TODO: Implement this method
        Map<Integer,Integer> M = new TreeMap<>();
        for (int i = 0; i < nums.size(); i++){
            M.put(nums.get(i),nums.get(i) * nums.get(i));
        }
        // Map M is not empty
        if (M.isEmpty() == false){
            return M;
        }
        return null;
    }

    /** Returns a map of the counts of all words that appear in a list of words. */
    public static Map<String, Integer> countWords(List<String> words) {
        // TODO: Implement this method
        Map<String,Integer> M = new TreeMap<>();

        for(int i = 0; i < words.size(); i++){
            if (M.containsKey(words.get(i))){
                M.put(words.get(i), M.get(words.get(i))+1);
            }
            else{
                M.put(words.get(i),1);
            }
        }
        // Map M is not empty
        if (M.isEmpty() == false){
            return M;
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println();
    }
}
