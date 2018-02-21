package Linkedlist;

public class A {
	public boolean binaryTree(Tree root) {
		if(root==null)
			return true;
		while(root!=null) {
			if(root.left!=null && root.right!=null) {
				if(root.left.value>root.value || root.right.value < root.value)
					return false;
			}
			else if(root.left != null) {
				if(root.left.value > root.value)
					return false;
				root=root.left;
			}
			else if(root.right != null) {
				if(root.right < root.value)
					return false;
				root = root.right;
			}
		}
		return true;
	}
}
