
public class bTree {

	//you have to have a minimum of head
	node root;
	
	public bTree() {
		root = null;//empty Binarytree
	}
	
	
//method to insert it into the tree
	public void insert(int i) {
		
		//create the node
		node newnode = new node(i);
				
		if(root == null) {
			//insert the value in a node as the root
			root = newnode;
		}
		else {
			//when the root needs to be added 
			root.insert(i);
		}
		
	}

//do the in order traversal to check the tree accuracy 
	public void in_order_traverse() {
		//always check if the root is null first
		
		if(root == null) {
			System.out.print("tree is empty");
		}
		else {
			//we want to print the values
			root.in_order_traverse();
		}
	}


	//method that will fond the number in the tree
	public String find(int i) {
		if(root == null) {
			return "Not Found";
		}
		else {
			return root.find(i);
		}
		
	}


	//method to get the pre order traverse
	public void pre_order_traverse() {
		if(root == null) {
			System.out.println("The tree is empty");
			
		}
		else {
			root.pre_order_traverse();
		}
		
	}

	//do the post order traversal which will do the LRN
	public void post_order_traverse() {
		if(root == null) {
			System.out.print("The tree is empty");
		}
		else {
			root.post_order_traversal();
		}
		
	}

	
//count how many leaves are in the tree
	//print the values of all the trees
	public int countLeaves() {
		//we use the method in_order_traversal to visit all the nodes so we can count 
		if (root == null) {
			return 0; 
		}
		else {
			return root.countleaves();
		}
	}


	//get the sum of all the leaves
	public int sumLeaves() {//we use the method in_order_traversal to visit all the nodes so we can count 
		if (root == null) {
			return 0; 
		}
		else {
			return root.sumleaves();
		}
	}

//get the hright of the tree
	/*public String height() {
		//always check if the root is null first
		
		if(root == null) {
			System.out.print("0");
		}
		else {
			//we want to print the values
			root.in_order_traverse();
		}
	}
	*/

}
