public class DoubleUp {
   /**
     * Returns a new string where each character of the given string is repeated twice.
     * Example: doubleUp("hello") -> "hheelllloo"
     */
   public static String doubleUp(String s) {
      String res = new String();
      for (int i = 0; i < s.length(); i++){
         for (int j = 0; j < 2; j++){
            res = res + s.charAt(i);
         }
      }
      return res;
   }
   
   public static void main(String[] args) {
      String s = doubleUp("hello");
      System.out.println(s);
      
      System.out.println(doubleUp("cat"));
   }
}