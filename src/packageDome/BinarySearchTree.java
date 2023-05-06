package packageDome;
/**
 * 
 * @author: { 
 * 				Ricardo Ferreira,
 * 				<ricardo@ferreiras.dev.br>
 * 			}
 * @version: 1.0.0
 * @since: 2023.03.21
 *
 */

class Node {
	public int value;
	public Node left, right;

	public Node(int value, Node left, Node right) {
		this.value = value;
		this.left = left;
		this.right = right;
	}
}

public class BinarySearchTree {
	public static boolean contains(Node root, int value) {
		if (root != null) {
			if (root.value == value) {
				return true;
			} else {
				return contains(root.left, value) || contains(root.right, value);
			}
		}
		return false;
	}

	public static void main(String[] args) {
		Node n1 = new Node(1, null, null);
		Node n3 = new Node(3, null, null);
		Node n2 = new Node(2, n1, n3);

		System.out.println(contains(n2, 1));

		byte[] b = { 100, 101, 102 };

		for (int a : b)
			System.out.println(a);

		String s = new String(b);
		System.out.println(s);
		System.out.println(b);

		int x = 5;

		int y = x++ + ++x;
		int z = x-- - --x;

		System.out.println(y);
		System.out.println(z);

		System.out.println(x++ + ++x - x-- - --x);
	}
}