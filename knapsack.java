/*Mr. Dharma went to D-mart, and picked a basket with a capacity C.
There are N products in Dharma's wishlist.
You will be given desired cost and quantity of each Product.
Out of the wishlist Mr Dharma has, he wants to purchase the products in the following way:
	- The sum of quantities taken into the basket is less than or equal to C.
	- The sum of cost of the products in the basket is maximum among all 
	the possible combinations of products.

Your task is to help, Mr. Dharma to purachase the products with maximum cost, 
with the given basket capacity. 

Input Format:
-------------
Line-1: Two space separated integers, N and C.
Next N lines: Two space separated integers, Ci and Qi.
			cost and quantity of i-th product.

Output Format:
--------------
Print an integer, Maximum cost to pay to D-Mart.


Sample Input-1:
---------------
4 15
10 2
10 4
12 6
18 9

Sample Output-1:
----------------
38.0

Explanation:
------------
Quantity = 2 + 4 + 6 + 3 = 15
Cost = 10 + 10 + 12 + 6 = 38


Sample Input-2:
---------------
4 21
18 6
20 3
14 5
18 9

Sample Output-2:
----------------
66.0

Explanation:
------------
Quantity = 6 + 3 + 5 + 4 = 18
Cost = 18 + 20 + 14 + 14 = 66
*/
import java.util.*;
class Itemvalue{
    double value;
    double weight;
    Itemvalue(double a,double b){
        value=a;
        weight=b;
    }
    
}
class sort implements Comparator<Itemvalue>{
    public int compare(Itemvalue a,Itemvalue b){
        double d=(a.value/a.weight);
        double x=(b.value/b.weight);
    if(d>x){
        return -1;
    }
    else{
        return 1;
    }
    }
}

class Solution{
    public static double getcapacity(Itemvalue arr[],double max){
        Arrays.sort(arr,new sort());
        double l=max;
    double res=0;
    double pes=0;
        for(Itemvalue x:arr){
            if(max-x.weight>=0){
                res=res+x.value;
                max=max-x.weight;
                pes+=x.weight;
            }
            else{
                double v=(x.value/x.weight);
                double rem=l-pes;
                res+=rem*v;
                break;
            }
        }
        return res;
    }
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        Itemvalue arr[]=new Itemvalue[(int)a];
        for(int i=0;i<a;i++){
            arr[i]=new Itemvalue(sc.nextDouble(),sc.nextDouble());
            
        }
        System.out.println(getcapacity(arr,b));
    }
}