package JavaDataStructure.TreeTraversal;

//Recursive java program for level order tree traversal of Binary tree
//Find height of the tree and then for each level run a recursive function by maintaining current height. whenever level of the 
// node matches print the node

class Node{
	int data;
	Node left,right;
	
	public Node(int data) {
		this.data = data;
		left = right = null;
	}
}


public class BreadthFirstSearchNaive {
	
	Node root;
	public BreadthFirstSearchNaive() {root = null;}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BreadthFirstSearchNaive tree = new BreadthFirstSearchNaive();
		tree.root  = new Node(5);
		tree.root.left = new Node(4);
		tree.root.right = new Node(6);
		tree.root.left.left = new Node(9);
		
		
		
	}

}
