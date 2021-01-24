package Easy;

/**
 * 
  Write a function that takes in a Binary Search Tree (BST) and a target integer
  value and returns the closest value to that target value contained in the BST.

  You can assume that there will only be one closest value.
 */
class Program {
  public static int findClosestValueInBst(BST tree, int target) {
    // Write your code here.
		return helper(tree, target,tree.value);
  }
	
	public static int helper(BST tree, int target, int closest) {
		if (Math.abs(target - closest ) > Math.abs(target - tree.value)) {
			closest = tree.value;
		}
		
		if (target < tree.value && tree.left != null) {
			return helper(tree.left, target, closest);
		} else if (target > tree.value && tree.right != null) {
			return helper(tree.right, target, closest);
		}
		else  {
			return closest;
		}
	}
	
  static class BST {
    public int value;
    public BST left;
    public BST right;

    public BST(int value) {
      this.value = value;
    }
  }
}