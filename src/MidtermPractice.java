import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MidtermPractice {

    public static void main(String[] args) {
        // After implementing a method, call it here with
        // some sample input and print the result to
        // check if it works. Fix any issues you find.

        /**
         Finding longest words
         */
        List<String> list = List.of("My" , "Midterm" , "SDEV220");
        System.out.println(list);
        System.out.println("Longest word is: " + findLongestWord(list));


        /**
         Counting long words
         */
        Map<String, Integer> map = Map.of("why" ,7, "hello", 8, "brilliant", 99, "world", 15, "amazing", 17);
        System.out.println(map);
        System.out.println("Count long word: " + countLongWords(map));


        /**
         Finding float avg
         */
        float[] arr = {1.5f, 3.5f, 2.0f, 3.0f};
        
        System.out.println(Arrays.toString(arr));
        System.out.println("Average of float: " + findAverage(arr));


        /**
         Finding odd numbers
        */
        Map<String, Integer> map2 = Map.of("a" , 7, "b" , 9 , "c" , 10);
        System.out.println(map2);
        System.out.println("Count odd numbers: " + countOddNumbers(map2));


        /**
         Finding all devided by 3
         */
        int[] arr2 = {3, 6, 9};
        int[] arr3 = {3, 4, 5, 6};
        System.out.println(Arrays.toString(arr2));
        System.out.println("If all devided by 3: " + allDivisibleBy3(arr2));

        System.out.println(Arrays.toString(arr3));
        System.out.println("If all devided by 3: " + allDivisibleBy3(arr3));


        /**
         Finding if word started with letter a
         */
        List<String> list3 = List.of("apple", "apricot", "avocado");
        List<String> list4 = List.of("apple", "banana", "avocado");

        System.out.println(list3);
        System.out.println("If word started with letter a: " + allStartWithA(list3));

        System.out.println(list4);
        System.out.println("If word started with letter a: " + allStartWithA(list4));

    }

    /**
     * Finds the longest word in an List of Strings.
     * @param list an ArrayList of words
     * @return the longest word in the list
     * Example: input: ["apple", "banana", "kiwi"] -> output: "banana"
     */
    public static String findLongestWord(List<String> list) {

        String longestWord = "";

        for (String word : list){
            if (word.length() > longestWord.length()){
                longestWord = word;
            }
        }
        return longestWord;
    }

    /**
     * Counts how many words are longer than 5 characters in the keys of a Map.
     * @param map a Map of strings to integers
     * @return the count of words longer than 5 characters
     * Example: input: ["why"=7, "hello"=8, "brilliant"=99, "world"=15, "amazing"=17] -> output: 2
     */
    public static int countLongWords(Map<String, Integer> map) {

        int count = 0;
        for (String word : map.keySet()){
            if (word.length() > 5){
                count++;
            }
        }
        return count;
    }

    /**
     * Finds the average of the floats in an array.
     * @param arr an array of floats
     * @return the average of the values
     * Example: input: [1.5, 3.5, 2.0, 3.0] -> output: 2.5
     */
    public static double findAverage(float[] arr) {

        double sum = 0;

        for (double number: arr){
            sum += number;
        }
        return sum / arr.length;
    }

    /**
     * Counts how many odd numbers there are in the values of a Map.
     * @param map a HashMap of String keys and Integer values
     * @return the count of odd numbers in the values
     * Example: input: {"a"=7, "x"=4, "z"=5} -> output: 2
     */
    public static int countOddNumbers(Map<String, Integer> map) {

        int count = 0;
        for (Integer number : map.values()){
            if (number % 2 != 0){
                count++;
            }
        }
        return count;
    }

    /**
     * Returns true if all values are divisible by 3 in an array.
     * @param arr an array of integers
     * @return true if all values are divisible by 3, false otherwise
     * Example: input: [3, 6, 9] -> output: true
     * Example 2: input: [3, 4, 6, 9] -> output: false
     */
    public static boolean allDivisibleBy3(int[] arr) {

        for (int number : arr){
            if (number % 3 != 0){
                return false;
            }
        }
        return true;
    }

    /**
     * Returns true if all words start with 'a' in an ArrayList of Strings.
     * @param list an ArrayList of words
     * @return true if all words start with 'a', false otherwise
     * Example: input: ["apple", "apricot", "avocado"] -> output: true
     * Example: input: ["apple", "banana", "avocado"] -> output: false
     */
    public static boolean allStartWithA(List<String> list) {

        for (String word : list){
            if (!word.startsWith("a")){
                return false;
            }
        }
        return true;
    }

    /**
     * OPTIONAL MORE CHALLENGING PROBLEM
     * NOT REQUIRED
     *
     * Determines if the array can be split into two contiguous subarrays with equal sums.
     * The method checks if there exists an index where the sum of elements to the left of the index
     * is equal to the sum of elements to the right. Both subarrays must be contiguous.
     *
     * @param arr an array of integers to evaluate
     * @return true if there exists a split point where the left and right contiguous subarrays have equal sums, false otherwise
     *
     * Example:
     * Input: [1, 3, 8, 2, 1, 2, 7]
     * Output: true (since [1, 3, 8] and [2, 1, 2, 7] both sum to 12)
     *
     * Input: [1, 2, 3, 4, 5]
     * Output: false (no contiguous split results in equal sums)
     */
    public static boolean canPartitionWithEqualSums(int[] arr) {
        return false;
    }

}