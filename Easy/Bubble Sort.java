package Easy;

class Program {
  public static int[] bubbleSort(int[] array) {
    // Write your code here.
		boolean isDone = false;
		int counter = 0;
		while (!isDone) {
			isDone = true;
			for (int i = 0; i < array.length- 1 - counter; i++) {
				if (array[i] > array[i + 1]) {
					int temp = array[i];
					array[i] = array[i + 1];
					array[i+1] = temp;
					isDone = false;
				}
			}
			counter++;
		}
		return array;
  }
}


