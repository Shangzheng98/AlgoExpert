package Easy;

import java.util.*;

class Program {
  public String runLengthEncoding(String string) {
    // Write your code here.
		int counter = 1;
		String a = "";
		for (int i = 1; i < string.length(); i++) {
			char last = string.charAt(i-1);
			
			if ( (string.charAt(i) != last) || (counter == 9)) {
				a = a + Integer.toString(counter) + last;
				counter = 0;
			}
			counter ++;
		}
		a = a + Integer.toString(counter) + string.charAt(string.length() - 1);
		return a;
  }
}


