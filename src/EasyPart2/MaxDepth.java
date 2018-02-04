package EasyPart2;

public class MaxDepth {
	public int maxDepth(TreeNode root) {
		if(root == null)
			return 0;
		return 1+Math.max(maxDepth(root.left), maxDepth(root.right));
	}
	
	
	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.left.right = new TreeNode(3);
		
		MaxDepth deep = new MaxDepth();
		
		System.out.println(deep.maxDepth(root));
	}
	
}
