package Easy;
import java.util.*;

class Program {
  // Tip: You can use `element instanceof ArrayList` to check whether an item
  // is an array or an integer.
  public static int productSum(List<Object> array) {
   return  helper(array, 1);
			
   // return -1;
  }
	
	public static int helper(List<Object> array, int depth) {
		int sum = 0;
		for (Object a : array) {
			if (a instanceof ArrayList) {
				@SuppressWarnings("unchecked")
				ArrayList<Object> newA = (ArrayList<Object>) a;
				sum += helper(newA, depth + 1);
			}
			else {
				sum +=(int)a;
			}
		}
		
		return sum * depth;
	}
}