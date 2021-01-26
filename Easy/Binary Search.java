package Easy;


class Program {
  public static int binarySearch(int[] array, int target) {
    // Write your code here.
		
		
    return helper(array, target, 0, array.length -1);
  }
	
	public static int helper(int[] array, int target, int left, int right) {
		if (left > right) {
			return -1;
		}
		int middle = (right + left) /2;
	
		int middleNumber = array[middle];
		
		if (middleNumber == target) {
			return  middle;
		} else if (middleNumber < target) {
			return helper(array, target, middle + 1,right);
		} else {
			return helper(array, target, left, middle - 1);
		}
	}
}
