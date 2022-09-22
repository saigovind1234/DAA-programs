/*Balbir singh is working with Binary Trees.
The elements of the tree is given in the level order format.
Balbir is looking the tree from right side. 
So, he can view only rightmost nodes only (one node per level).

You will be given the root of the binary tree.
Your task is to find the nodes which can be viewed by Balbir from right side.
And print the nodes from top to bottom order.

Your task is to implement the class Solution:
	- public List<Integer> rightSideView(BinaryTreeNode root):
	return the list of node values.
	
NOTE: 
Please do consider the node with data '-1' as null node in the given trees.

Input Format:
-------------
Space separated integers, elements of the tree.

Output Format:
--------------
Print a boolean value.


Sample Input-1:
---------------
1 2 3 5 -1 -1 5

Sample Output-1:
----------------
[1, 3, 5]



Sample Input-2:
---------------
3 2 4 3 2

Sample Output-2:
----------------
[3, 4, 2]

 */
import java.util.*;

/*
    //Structure of BinaryTreeNode for your reference.

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
    public List<Integer> rightSideView(BinaryTreeNode root) {
        ArrayList<Integer>m1=new ArrayList<>();
        LinkedList<BinaryTreeNode>p=new LinkedList<>();
        if(root.data==-1){
            return m1;
        }
        else{
            p.add(root);
            while(true){
                int f=p.size();
                BinaryTreeNode x=new BinaryTreeNode(0);
                if(f==0) break;
                while(f>0){
                    BinaryTreeNode m=p.poll();
                    if(m.left!=null && m.left.data!=-1){
                        p.add(m.left);
                    }
                    if(m.right!=null && m.right.data!=-1){
                        p.add(m.right);
                    }
                    
                    x=m;
                    f--;
                }
                m1.add(x.data);
            }
            return m1;
        }
    }
}
