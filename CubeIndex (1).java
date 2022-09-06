/*
There are n cubes printed a number on each of  them,
The cubes are placed in a row indexed from 0 to n-1, unique and 
in ascending order of numbers printed on them.

Your task is to find the smallest index  I of the row, 
where index I equals to the number printed on the cube.

If no such index found, print -1.

NOTE: use a method/function  to find the smallest index I of the row.
and use binary search approach.

Input Format:
-------------
Line-1: An integer n, number of cubes.
Line-2: n space separated integers, 
numbers printed on the cubes in the row.

Output Format:
--------------
Print an integer, smallest index possible.


Sample Input-1:
---------------
5
-10 -5 0 3 4

Sample Output-1:
----------------
3

Explanation:
------------
Cubes in the row, row[0] = -10, row[1] = -5, row[2] = 0, row[3] = 3, row[4]=4.
There are 2 indices possible 3 and 4, but you need to find the smallest index, 
so answer is 3

Sample Input-2:
---------------
5
0 2 4 5 7

Sample Output-2:
----------------
0

*/

// -1 1 2 3 4
// -3 -2 1 3 4
// -4 -2 0 2 4
// 0 1 2 3 4
// -2 0 2 3 4

import java.util.*;

class CubeIndex {
    public int cubeIndex(int[] A) {
        int l = 0, r = A.length - 1;
        while (l < r) {
            int m = (l + r) / 2;
			System.out.println("l " + l + " r " + r + " m " + m + " a[m] "+ A[m]);

			// If the value @ index is lesser then median it means the 
			// left can be eliminated. Else right can be eliminated
            if (A[m] < m)
                l = m + 1;
            else
                r = m;
        }
        return A[l] == l ? l : -1;
    }

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		System.out.println(new CubeIndex().cubeIndex(arr));
	}
}