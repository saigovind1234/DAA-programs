/*You are given a list of N integers List[], list contains both +ve and
-ve integers. Your task is to findout, the Lowest Product possible.
Where the product is the product of all the elements sublist 
sList[], and sub list should contain atleast 1 integer. 
The elements need not be contiguous.

Input Format:
-------------
Line-1: An integer N.
Line-2: N space separated integers, List[].

Output Format:
--------------
Print an integer output, the lowest product.

Sample Input-1:
---------------
4
2 -3 4 -5

Sample Output-1:
----------------
-40

Explanation:
------------
Product of elements sub list [2 4 -5].


Sample Input-2:
---------------
3
-2 0 -3

Sample Output-2:
----------------
-3

Explanation:
------------
Product of sub list is -3, where [-3] is the sublist
*/
import java.util.*;
class MinProductset2{
    public static long getminproduct(int arr[]){
        int neg=0;
        int lneg=Integer.MIN_VALUE;
        int sneg=0;
        int zerocount=0;
        long p=1;
        int smallpositive=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                p*=arr[i];
            }
      
            if(arr[i]<0){
                if(arr[i]>lneg){
                    lneg=arr[i];
                }
                if(arr[i]<sneg){
                    sneg=arr[i];
                }
                neg++;
            }
            if(arr[i]>0 && arr[i]<smallpositive){
                smallpositive=arr[i];
            }
            if(arr[i]==0){
                zerocount++;
            }
        }
        if(neg!=0){
            if(p==0){
                return sneg;
            }
            if(neg%2==0){
                return p/lneg;
            }
            else{
                return p;
            }
        }
        else if(zerocount>0){
            return 0;
        }
        else{
            return smallpositive;
        }
        
    }
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int f=sc.nextInt();
        int arr[]=new int[f];
    
        for(int i=0;i<f;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(getminproduct(arr));
    }
}