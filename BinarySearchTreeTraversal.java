import java.util.*;

class BinaryTree
{
	public int val; 
	public BinaryTree left, right; 
	public BinaryTree(int val){
		this.val = val; 
		left = null; 
		right = null; 
	}
}

public class BinarySearchTreeTraversal 
{    
	static BinaryTree root;
	
	/* A recursive function to insert a new key in BST */
    BinaryTree insert(BinaryTree node, int key)
    { 
        /* If the tree is empty, return a new node */
        if (node == null) {
            node = new BinaryTree(key);
            return node;
        } 
        else if (key < node.val)
            node.left = insert(node.left, key);
        else if (key > node.val)
            node.right = insert(node.right, key);
 
        return node;
    } 

	void inOrder(BinaryTree node)
    {
        if (node == null)
            return;
  
        // left subtree
        inOrder(node.left);
		        
		// print val
        System.out.print(node.val + " ");
  
        // right subtree
        inOrder(node.right);
    }

	void inOrderWithoutRecursion(BinaryTree node)
    {
        if (node == null)
            return;
    
        Stack<BinaryTree> stk = new Stack<BinaryTree>();
        BinaryTree curr = node;
  
        // traverse the tree
        while (curr != null || stk.size() > 0)
        {  
            // Reach the left most Node of the curr Node 
            while (curr !=  null)
            {
                // place pointer to a tree node on the stack before traversing the nodes left subtree 
                stk.push(curr);
                curr = curr.left;
            }
  
            // Current must be NULL at this point 
            curr = stk.pop();
  
            System.out.print(curr.val + " ");
  
            // Visited the node and its left subtree.  Now, visit right subtree */
            curr = curr.right;
        }
    }

	void preOrder(BinaryTree node)
    {
        if (node == null)
            return;

	    // print val
        System.out.print(node.val + " ");
  
        // left subtree
        preOrder(node.left);
  
        // right subtree
        preOrder(node.right);
    }

	void postOrder(BinaryTree node)
    {
        if (node == null)
            return;
  
        // left subtree
        postOrder(node.left);
  
        // right subtree
        postOrder(node.right);
  
        // print val
        System.out.print(node.val + " ");
    }

	// 8 10 2 1 5 12 3

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		BinarySearchTreeTraversal bstt = new BinarySearchTreeTraversal();
		
		String str[] = sc.nextLine().split(" ");

		root = new BinaryTree(Integer.parseInt(str[0]));

		for(int i = 1; i < str.length; i++)
			bstt.insert(root, Integer.parseInt(str[i]));

		System.out.println("In order Traversal");
		bstt.inOrder(root);
	
		System.out.println("\nIn order without recursion Traversal");
		bstt.inOrderWithoutRecursion(root);
		System.out.println("\nPre order Traversal");
		bstt.preOrder(root);
		System.out.println("\nPost order Traversal");
		bstt.postOrder(root);			  
	}
}
