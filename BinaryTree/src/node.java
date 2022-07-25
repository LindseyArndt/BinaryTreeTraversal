
public class node {

	int data;
	node left, right;
	
	//construct a node which can be added to the tree
	public node (int i) {
		data = i;
		left = null;
		right = null;
	}

	//when the root is not null
	public void insert(int i) {
		if(i < data) {
			//insert in the left
			if(left == null) {
				//create a node with i and make it in the left
				left = new node(i);
			}
			else {
				//if there is already a node 
				left.insert(i);
			}
		}
		else {
			//insert in the right 
			if(right == null) {
				//create a node with i and make it in the right
				right = new node(i);
			}
			else {
				//if there is already a right node
				right.insert(i);
			}
		}
		
	}
	
	
//when the root is not null we want to get the values in the tree and print LNR
	public void in_order_traverse() {
		if (left != null) {
			 //we need to check the left again
			left.in_order_traverse();
		}
		System.out.println(", "+data);
		if(right != null) {
			right.in_order_traverse();
		}
	}

	
	//find the number in the binary tree
	public String find(int i) {
		if(data == i) {
			return "Found!!";
			
		}
		else if(i < data) {
			if (left != null) {
				return left.find(i); //try to find it again
			}
			else {
				//if the left is null
				return "Not Found";
			}
		}
		else {
			if(right != null) {
				return right.find(i); //try to find it 
			}
			else {
				//if the right is null 
				return "Not Found";
			}
		}
	
	}

	
	//when the root is not null we want to get the pre order traversal
	public void pre_order_traverse() {
		//pre oder is NLR so we start by printing the node and then going down left and then going down right 
		System.out.println(", "+data);
		
		if(left != null) {
			
			left.pre_order_traverse();
		}
		
		if(right != null) {
			right.pre_order_traverse();
		}
		
		
	}

	
	//create the post order traversal when the tree is not null and it follows LRN
	public void post_order_traversal() {
		if(left != null) {
			left.post_order_traversal();
		}
		if(right != null) {
			right.post_order_traversal();
		}
		System.out.println(", "+data);
	}

	
	//count the number of leaves there are in a tree
	public int countleaves() {
		if(left == null && right == null) {
			return 1; //because this will be a leaf
		}
		else {
			int l = 0, r = 0; //because this will not be a leaf
			if(left != null) {
				l = left.countleaves();
			}
			if(right != null) {
				r = right.countleaves();
			}
			return l+r; //get how many on the right and left are leaves and add them
		}
	}

	//get the sum of all the leaves
	public int sumleaves() {
		if(left == null && right == null) {
			return data; //because this will be a leaf
		}
		else {
			int l = 0, r = 0; //because this will not be a leaf
			if(left != null) {
				l = left.sumleaves();
			}
			if(right != null) {
				r = right.sumleaves();
			}
			return l+r; //get how many on the right and left are leaves and add them
		}
	} 

}
