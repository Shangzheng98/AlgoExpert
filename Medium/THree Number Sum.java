package Medium;

import java.util.*;

class Program {
    public static void main(String[] args) {
        threeNumberSum(new int[] {12, 3, 1, 2, -6, 5, -8, 6}, 0);
    }
  public static List<Integer[]> threeNumberSum(int[] array, int target) {
    // Write your code here.
		Arrays.sort(array);
		List<Integer[]> a = new ArrayList<Integer[]>();
		for (int i = 0; i < array.length-2; i++) {
			int current = i;
			int left = i+1;
			int right= array.length - 1;
			
			while (left < right) {
				int sum = array[current] + array[left] + array[right];
				if (sum == target) {
					Integer[] temp = {array[current], array[left], array[right]};
					a.add(temp);
					 left++;
					 right--;
					
				} else if (sum < target) {
					left ++;
				} else {
					right--;
				}
				
			}
		}
		return a;
  }
}