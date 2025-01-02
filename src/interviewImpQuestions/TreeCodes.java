package interviewImpQuestions;


class TreeNode{
	
	/*
	 * This is implementation of TreeNode
	 */
	int value;
	TreeNode left;
	TreeNode right;
	
	public TreeNode(int value) {
		this.value = value;
		this.left = null;
		this.right = null;
	}
}

class BinaryTree{
	TreeNode root;
	
	public BinaryTree() {
		this.root = null;
	}
	
	public TreeNode recursiveInsertion(TreeNode node, int value) {
		// condition one is if the given node is null then assign this value
		//to that node
		
		if(node == null) {
			return new TreeNode(value);
		}
		
		//if the given value is less than the node.value
		if( value < node.value ) {
			node.left = recursiveInsertion(node.left, value);
		}
		
		// if the given value is greater than the node.value
		if(value > node.value) {
			node.right = recursiveInsertion(node.right, value);
		}
		
		return node;
	}
	
	
	public void insert(int value) {
		root = recursiveInsertion(root, value);
	}
	
	private void inorderRecursive(TreeNode node) {
		if(node != null) {
            inorderRecursive(node.left);
            System.out.print(node.value + " ");
            inorderRecursive(node.right);
		}
	}
	
	public void inorderTraverse(TreeNode node) {
		inorderRecursive(root);
	}
	
}

public class TreeCodes {

	public static void main(String[] args) {
		TreeNode tn = new TreeNode(0);
	}

}
