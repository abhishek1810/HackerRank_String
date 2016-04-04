/**
 * 
 */
package trees;

import java.util.ArrayList;
import java.util.List;

/**
 * @author JakkaniN
 *
 */


class Node{
	int data;

	Node left, right;

	Node(int item){
		data = item;
		left = right = null;
	}

}

public class BinaryTree {

	Node root;
	
	List<Integer> elist = new ArrayList<>();
	List<Integer> olist = new ArrayList<>();

	public BinaryTree() {
		root = null;
	}
	
	void printLevelOrder(Node root) {
		int h = height(root);
		System.out.println("height "  + h);
		for (int i = 1; i <= h; i++) {
			printGivenLevel(root, i, i);
			System.out.println();
		}
		
		System.out.println(elist);
		System.out.println(olist);
		
		int even = caliculateSum(elist.toArray());
		int odd = caliculateSum(olist.toArray());
		
		System.out.println(even > odd ? even : odd);
	}
	
	int height(Node root) {
		if(root == null) { return 0; }
		
		else {
			int leftTree = height(root.left);
			int rightTree = height(root.right);
			if(leftTree > rightTree) { return leftTree+1; }
			else {
				return rightTree+1;
			}
		}
	}
	
	public void printGivenLevel(Node node, int level, int i) {
		if(node == null) {
			return;
		}
		
		if(level == 1) {
			if(i %2 == 1) {
			System.out.print(node.data);
			elist.add(node.data);
			}
			else {
				olist.add(node.data);
			}
		}
		
		else if( level > 1) {
			printGivenLevel(node.left, level-1, i);
			printGivenLevel(node.right, level-1, i); 
		}
		
	}

	public static void main(String[] args) {

		BinaryTree tree = new BinaryTree();
		tree.root = new Node(3);

		tree.root.left = new Node(4);
		tree.root.right = new Node(5);

		tree.root.left.left= new Node(1);
		tree.root.left.right= new Node(3);
		
		tree.root.left.right = new Node(1);
		
		tree.printLevelOrder(tree.root);
		
	}
	
	private static int caliculateSum(Object[]  objects) {
		int first = 0;
		int last =  objects.length - 1;
		int sum = 0;
		while(first <= last) {
			if(first != last) {
				sum = sum+ (int)objects[first]+ (int)objects[last];
			}
			else {
				sum = sum+ (int)objects[first];
			}
			first++;
			last--;
		}
		return sum;
	}

}
