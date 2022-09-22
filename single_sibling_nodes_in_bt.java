/*In a joint family, every person assigned with an ID, an integer value.
and the entire family is arranged in the from of tree.

You will be given the family tree,
your task is to find and print the person ID, who is only child to his/her parent.
i.e, the person with no siblings. Print all such person ID's in ascending order.

NOTE: 
	- If only one person is there in the family, please consider him as a parent.
	- In the given tree, please consider '-1' as null.

Input Format:
-------------
Single line of space separated integers, person ID's in the family.

Output Format:
--------------
Print the list of person IDs in ascending order.


Sample Input-1:
---------------
2 3 4 -1 5

Sample Output-1:
----------------
[5]

Sample Input-2:
---------------
11 99 88 77 -1 -1 66 55 -1 -1 -1 -1 -1 -1 44

Sample Output-2:
----------------
[44, 55, 66, 77]
 */

import java.util.*;

/*
TreeNode for reference

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
 
    
        
    
    public ArrayList<Integer> getPersonIDs(BinaryTreeNode root) {
	    ArrayList<Integer>k=new ArrayList<>();
	    LinkedList<BinaryTreeNode>m=new LinkedList<>();
	    if(root.data==-1){
	        return k;
	    }
	    else{
	       m.add(root);
	       while(true){
	           int g=m.size();
	           if(g==0)break;
	           while(g>0){
	               BinaryTreeNode w=m.remove();
	               if(w.left!=null && w.right!=null && w.left.data!=-1 && w.right.data!=-1){
	                   m.add(w.left);
	                   m.add(w.right);
	               }
	               
	               if(w.right!=null && w.right.data!=-1 && (w.left==null || w.left.data==-1)){
	                   m.add(w.right);
	                   
	                       k.add(w.right.data);
	                   
	               }
	               if(w.left!=null && w.left.data!=-1 && (w.right==null||w.right.data==-1)){
	                   m.add(w.left);
	                   
	                       k.add(w.left.data);
	                   
	               } 
	         
	          
	              
	               g--;
	           }
	       }
	       Collections.sort(k);
	       return k;
	    }
	}
}
