package BinaryTree;

import java.util.ArrayList;

public class SearchRangeinBinarySearchTree {
	public class TreeNode {
		      public int val;
		      public TreeNode left, right;
		      public TreeNode(int val) {
		          this.val = val;
		         this.left = this.right = null;
		      }
		  }
	   public ArrayList<Integer> searchRange(TreeNode root, int k1, int k2) {
	        // write your code here
	        if(root == null )
	        {return null;}
	        ArrayList<Integer> result = new ArrayList<Integer>();
	        dfs(result,root,k1,k2);
	        return result;
	    }
	    private void dfs(ArrayList<Integer> result, TreeNode root, int k1, int k2){
	        if(root == null){
	            return;
	        }
	        dfs(result, root.left , k1, k2);
	        if(root.val >= k1 && root.val <= k2){
	            result.add(root.val);
	        }
	         dfs(result, root.right , k1, k2);
	    }
}
