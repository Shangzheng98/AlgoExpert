package Easy;

import java.util.*;

class Program {
  public static boolean isPalindrome(String str) {
    return helper(str, 0);
  }
	
	public static boolean helper(String str, int index) {
		int corespondingIndex = str.length() - 1 - index;
		boolean ret = false;
		
		
		return index >= corespondingIndex? true : str.charAt(index) == str.charAt(corespondingIndex) && helper(str, index + 1);
	}
}

