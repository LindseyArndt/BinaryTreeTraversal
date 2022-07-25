
public class app {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bTree myTree = new bTree();
		
		//insert values into the binary tree
		myTree.insert(4);
		
		myTree.insert(31);
		
		myTree.insert(11);
		myTree.insert(22);
		myTree.insert(16);
		myTree.insert(45);
		myTree.insert(7);
		myTree.insert(9);
		myTree.insert(18);
		
		System.out.println("----------------In order Traversal---------------------");
		myTree.in_order_traverse(); //This will print the values in sorted order from lowest to highest LNR
		
		//--------------------Due Wednesday----------------------
		System.out.println("----------------Pre order Traversal---------------------");
		myTree.pre_order_traverse();
		System.out.println("----------------Post order Traversal---------------------");
		myTree.post_order_traverse();
		//-------------------------------------------------------
		
		//we will try to find 27
		System.out.println("The result of find 27 is "+myTree.find(27));
		System.out.println("The result of find 12 is "+myTree.find(12));
		System.out.println("The result of find 22 is "+myTree.find(22));
		
		//leaves and removal 
		System.out.println("The number of leaves in the tree is: "+myTree.countLeaves()); //how would you know if this is true? You have to print the tree in a sideways form with in_order_traversal
		//you could go down 2 lines after each node for printing the tree
		System.out.println("The sum of the values in the leaves in the tree is: "+myTree.sumLeaves()); //get the sum of the leaves
		//-------------------Due Thrusday--------------------------------------
		//System.out.print("The sum of the values in the leaves in the tree is: "+myTree.height()); //use the in_order_traversal
	}

}
