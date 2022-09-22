/*For X-Mas, santa claus is preparing a X-Mas Tree with set of Bulbs.
The bulbs are of different voltages, and preparation of tree as follows:
	- The bulbs are arranged in level-wise, levels are numbered from 0,1,2,3..
	  so on.
	- At level-0: There will be only one bulb as root bulb.,
	- From next level onwards, we can attach atmost two bulbs to left side,
	  and right side of every bulb in previous level.
	- The empty attachements in each level are indicated with -1. 
	(for example: look in hint)

You will be given the root of the X-Mas Tree,
Your task is to findout the bulb with highest voltage in each level.

Implement the class Solution:
1.public List<Integer> maxInEachRow(BinaryTreeNode root): returns the list of integers.


Input Format:
-------------
A single line of space separated integers, voltages of the set of bulbs.

Output Format:
--------------
Print the list of voltages.


Sample Input-1:
---------------
2 4 3 6 4 -1 9

Sample Output-1:
----------------
[2, 4, 9]


Sample Input-2:
---------------
3 4 7 7 3 8 4 

Sample Output-2:
----------------
[3, 4, 8]
*/

import java.util.*;
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
    public List<Integer> maxInEachRow(BinaryTreeNode root) {
    ArrayList<Integer>p=new ArrayList<>();
    LinkedList<BinaryTreeNode>m=new LinkedList<>();
    if(root.data==-1){
        p.add(0);
        return p;
    }
    else{
        m.add(root);
        p.add(root.data);
    while(true){
        int g=m.size();
        if(g==0){
            break;
        }
   
        int l=Integer.MIN_VALUE;
        while(g>0){
            BinaryTreeNode q=m.poll();
            if(q.left!=null && q.left.data!=-1){
                if(q.left.data>l){
                    l=q.left.data;
                }
                m.add(q.left);
            }
            if(q.right!=null && q.right.data!=-1){
                if(q.right.data>l){
                    l=q.right.data;
                }
                m.add(q.right);
            }
            g--;
            
        }
        
        p.add(l);
    }
    p.remove(p.size()-1);
    return p;
    }
    }
}
