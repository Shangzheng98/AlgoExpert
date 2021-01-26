package Easy;
import java.util.*;

class Program {

  public int minimumWaitingTime(int[] queries) {
    // Write your code here.
		Arrays.sort(queries);
		System.out.print(queries[0]);
		
		int ret = 0;
		for (int i = 0; i <  queries.length; i ++) {
			int duration = queries[i];
			int queryleft = queries.length - (i + 1);
			ret += duration * queryleft;
		}
		return ret;
  }
}