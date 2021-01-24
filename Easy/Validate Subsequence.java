package Easy;

import java.util.*;
/**
 * 
  A subsequence of an array is a set of numbers that aren't necessarily adjacent
  in the array but that are in the same order as they appear in the array. For 
  instance, the numbers [1,3,4]  form a subsequence of the array [1, 2, 3, 4]
  , and so do the numbers. Note that a single number in an array and the array itself are both valid
  subsequences of the array.
 */
class Program {
  public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
    // Write your code here.
		int p1 = 0;
		int p2 = 0;
		while (p1 < array.size() &&p2 < sequence.size()) {
			if (array.get(p1).equals(sequence.get(p2))) {
				p2 ++;
			}
			p1 ++;
		}
		return p2 == sequence.size();
  }
}
