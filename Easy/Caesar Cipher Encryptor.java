package Easy;

import java.util.*;

class Program {
	// 'a' = 96;
	// 'z' = 122;
  public static String caesarCypherEncryptor(String str, int key) {
    // Write your code here.
		key = key %26;
		String newString = "";
		char[] a = new char[str.length()];
		for (int i = 0; i < str.length(); i++) {
			char temp = str.charAt(i);
			a[i] = temp + key <=122? (char)(temp + key): (char)(96 + (temp + key)%122);
		}
		return new String(a);
  }
}


