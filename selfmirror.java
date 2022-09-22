/*Mr Rishil is interested to work on Data Structures.
He has constructed a BinaryTree-BT.

He asked his friend Anil to check whether BT is self mirror tree or not.
Can you help Anil to find and return "true" if the given BT is a self mirror tree,
otherwise return "false".

Implement the class Solution:
   1. public boolean isSelfMirrorTree(BinaryTreeNode root): returns a boolean value.
  
NOTE:
	- In the tree '-1', indicates empty(null).
   
Input Format:
-------------
A single line of space separated integers, values at the treenode

Output Format:
--------------
Print a boolean value.


Sample Input-1:
---------------
2 1 1 2 3 3 2

Sample Output-1:
----------------
true


Sample Input-2:
---------------
2 1 1 -1 3 -1 3

Sample Output-2:
----------------
false
*/
/*
//TreeNode Structure for Your Reference..

class BinaryTreeNode{
	public int data; 
	public BinaryTreeNode left, right; 
	public BinaryTreeNode(int data){
		this.data = data; 
		left = null; 
		right = null; 
	}
}

*/

class Solution {
    public static boolean check(BinaryTreeNode l,BinaryTreeNode r){
        if(l==null && r==null){
            return true;
        }
        else if(l==null|| r==null){
            return false;
        }
        else{
            if(l.data==r.data){
                return (check(l.left,r.right) && check(l.right, r.left));
            }
            else{
                return false;
            }
        }
    }
    public boolean isSelfMirrorTree(BinaryTreeNode root) {
        return check(root.left,root.right);
    }
}
