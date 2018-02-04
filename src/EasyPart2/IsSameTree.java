package EasyPart2;

public class IsSameTree {
	public boolean isSameTree(TreeNode p, TreeNode q) {
		if(p==null && q==null) 
			return true;
		if(p==null || q==null)
			return false;
		if(p.val == q.val)
			return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
		return false;
	}
	
	public static void main(String[] args) {
		TreeNode r1 = new TreeNode(1);
		r1.left = new TreeNode(2);
		r1.left = new TreeNode(3);
		
		TreeNode r2 = r1;
		TreeNode r3 = new TreeNode(1);
		r3.left = new TreeNode(2);
		r3.left = new TreeNode(3);
		r3.right = new TreeNode(4);
		
		IsSameTree sameTree = new IsSameTree();
		System.out.println(sameTree.isSameTree(r1, r2));
		System.out.println(sameTree.isSameTree(r1, r3));
	}
}
