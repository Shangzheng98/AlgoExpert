package Easy;
import java.util.*;
/**
 * Write a function that takes in a non-empty array of distinct integers and an
  integer representing a target sum. If any two numbers in the input array sum
  up to the target sum, the function should return them in an array, in any
  order. If no two numbers sum up to the target sum, the function should return
  an empty array.
  
  Note that the target sum has to be obtained by summing two different integers
  in the array; you can't add a single integer to itself in order to obtain the
  target sum.
  
  You can assume that there will be at most one pair of numbers summing up to
  the target sum.
 */
class Program {
    public static void main(String[] args) {
        int[] r = twoNumberSum(new int[] {3, 5, -4, 8, 11, 1, -1, 6}, 10);
        System.out.print(r[0]);
        System.out.println();
        System.out.print(r[1]);
    }
    public static int[] twoNumberSum(int[] array, int targetSum) {
      // Write your code here.
          
          Map<Integer, Integer> map = new HashMap<>();
          for(int i = 0; i< array.length;i++) {
              map.put(array[i], i);
          }
          
          for (int i = 0; i < array.length; i++) {
              int tempMatch = targetSum - array[i];
              if (map.containsKey(tempMatch) && map.get(tempMatch) != i) {
                  return new int[] {
                      array[i], array[map.get(tempMatch)]
                  };
              }
          }
          return new int[0];
    }
  }
  