package challengeOne;

class Node {
	int key;
	Node left, right;

	public Node(int item) {
		key = item;
		left = right = null;
	}
}

class BinaryTree {

	// Root of Binary Tree
	Node root;

	BinaryTree() {
		root = null;
	}

	// Given a binary tree, print its nodes in inorder
	void printInorder(Node node) {
		if (node == null)
			return;

		// First recur on left child
		printInorder(node.left);

		// Then print the data of node
		System.out.print(node.key + " ");

		// Now recur on right child
		printInorder(node.right);
	}

}

public class symmetricTree {

	public static void main(String[] args) {

		BinaryTree tree = new BinaryTree();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		tree.root.right.left = new Node(6);
		tree.root.right.right = new Node(7);

		// Function call
		System.out.println("Inorder traversal of binary tree is ");
		tree.printInorder(tree.root);
	}

}
