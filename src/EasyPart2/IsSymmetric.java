package EasyPart2;

public class IsSymmetric {
	
    public boolean isSymmetric(TreeNode root) {
    	return root==null || isSymmetricHelp(root.left, root.right);
	}
    
    public boolean isSymmetricHelp(TreeNode left, TreeNode right) {
    	if(left==null || right==null)
    		return right==left;
    	if(left.val != right.val)
    		return false;
    	
    	return isSymmetricHelp(left.left, right.right) && isSymmetricHelp(left.right, right.left);
    	
    }
}
