package Easy;

class Programa{
  public static int[] insertionSort(int[] array) {
    // Write your code here.
    
		
		for (int i = 0; i< array.length; i++) {
			int j = i;
			while (j > 0 && array[j]< array[j - 1]) {
				int temp = array[j];
				array[j] = array[j-1];
				array[j-1] =temp;
				j--;
			}
		}
		//return new int[] {};
		return array;
  }
}


