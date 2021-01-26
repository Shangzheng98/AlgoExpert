package Easy;

import java.util.*;

class Program {
  public static int[] findThreeLargestNumbers(int[] array) {
    // Write your code here.
		Arrays.sort(array);
		
    return new int[]  {
			array[array.length -3],
			array[array.length -2],
			array[array.length -1]
		};
	}
}


class Program2 {
    public static int[] findThreeLargestNumbers(int[] array) {
        return null;
    }
}
