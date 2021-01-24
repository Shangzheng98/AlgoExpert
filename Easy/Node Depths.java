package Easy;

/**
 * 
  The distance between a node in a Binary Tree and the tree's root is called the
  node's depth.

  Write a function that takes in a Binary Tree and returns the sum of its nodes'
  depths.
 */
class Program {

  public static int nodeDepths(BinaryTree root) {
    // Write your code here.
		return helper(root,0);
    //return -1;
  }
	
	public static int helper(BinaryTree node,int sum) {
		if (node == null) {
			return 0;
		}
		
		return sum + helper(node.left, sum + 1) + helper(node.right, sum + 1);
	}
	static class BinaryTree {
    int value;
    BinaryTree left;
    BinaryTree right;

    public BinaryTree(int value) {
      this.value = value;
      left = null;
      right = null;
    }
  }
}
