/*Sachin wants to try his luck in diamonds business. 
He decides to purchase and sell one diamond. 

He is given the list of price of one diamond for N days by his friend.
Initially, it is assumed that he has no diamonds.
 
You need to help Sachin in making the maximum profit that is possible. 
He can sell the diamond only after he purchases it. 

Note: He is allowed to do only one complete transaction	
(purchase one diamond and sell it).
   
Input Format:
-------------
Line-1:N represents the number of diamonds.
Line-2:N-space separated integers, price of the diamond for N days.

Output Format:
--------------
Print an integer, maximum profit.
 
Sample Input-1:
---------------
6
7 1 5 3 6 4
 
Sample Output-1:
----------------
5
 
Explanation: 
------------
Purchase on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
 

Sample Input-2:
---------------
5 
7 6 5 4 2
 
Sample Output-2:
----------------
0
*/
import java.util.*;
class Besttime{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int arr[]=new int[a];
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }
        int min=arr[0];
        int max=arr[0];
        int diff=max-min;
        for(int i=1;i<a;i++){
            if(arr[i]<min){
                min=arr[i];
            }
         
            if(diff>(min-arr[i])){
                diff=min-arr[i];
            }
           
        }
        System.out.println(Math.abs(diff));
    }
}