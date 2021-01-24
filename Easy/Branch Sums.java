package Easy;

import java.util.*;
/**
 * 
  Write a function that takes in a Binary Tree and returns a list of its branch
  sums ordered from leftmost branch sum to rightmost branch sum.

  A branch sum is the sum of all values in a Binary Tree branch. A Binary Tree
  branch is a path of nodes in a tree that starts at the root node and ends at
  any leaf node.
 */
class Program {
  // This is the class of the input root. Do not edit it.
  public static class BinaryTree {
    int value;
    BinaryTree left;
    BinaryTree right;

    BinaryTree(int value) {
      this.value = value;
      this.left = null;
      this.right = null;
    }
  }

  public static List<Integer> branchSums(BinaryTree root) {
    // Write your code here.
		List<Integer> list = new ArrayList<Integer>();
		helper(root, 0, list);
		return list;
  }
	
	public static void helper( BinaryTree root, int sum, List<Integer> array)  {
		if (root == null) {
			return;
		}
		
		sum += root.value;
		if ( root.left == null && root.right == null) {
			array.add(sum);
		}
		
		helper(root.left, sum, array);
		helper(root.right, sum, array);
		
	}
}
