import java.lang.Math;

class CountGreaterNodes {

	public static void main(String args[]) {
		TreeNode root = new TreeNode(1);
		root.right = new TreeNode(11);
		root.left = new TreeNode(6);
		root.left.left = new TreeNode(7);
		root.left.right = new TreeNode(8);
		root.left.right.left = new TreeNode(7);
		root.right.left = new TreeNode(3);
		root.right.left.left = new TreeNode(10);
		root.right.right = new TreeNode(4);
		root.right.right.right = new TreeNode(5);
		root.right.right.right.left = new TreeNode(6);

		System.out.println(contGreaterNode(root));

	}

	static int contGreaterNode(TreeNode root) {
		return countNodes(root, Integer.MIN_VALUE, 0);
	}

	static int countNodes(TreeNode curr, int max, int count) {
		if (curr == null)
			return 0;
		return countNodes(curr.left, Math.max(max, curr.val), count)
				+ countNodes(curr.right, Math.max(max, curr.val), count) + (curr.val > max ? count + 1 : count);

	}

}

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
		left = null;
		right = null;
	}
}
