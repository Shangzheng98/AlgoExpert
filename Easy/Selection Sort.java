package Easy;
// divide intoe two sublist
// one is always sorted.
// the other one is not sorted.
class Program {
  public static int[] selectionSort(int[] array) {
    // Write your code here.
    //return new int[] {};
		int startPoint = 0;
		while (startPoint < array.length - 1) {
			int smallest = startPoint;
			for (int i = startPoint+ 1; i < array.length; i++) {
				if (array[smallest]> array[i]) {
					smallest = i;
				}
			}
			
			swap(array, smallest, startPoint);
			startPoint++;
		}
		return array;
	
  }
	
	public static void swap(int[] array, int from, int to) {
		int temp = array[from];
		array[from] = array[to];
		array[to] = temp;
	}
}


