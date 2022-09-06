/*
A school kid named Chitti Naidu, wants to find the value of N^P
Pth power of a number N.

You will be given two integers N and P.
Your task is to help Chitti Naidu to find the value of N^P.

NOTE:
---------
Value of N and P can be both positive and negative


Input Format:
-------------
Two integers N and P, where N is the number and P is the power

Output Format:
--------------
Print a float number, N power P


Sample Input-1:
---------------
3 2

Sample Output-1:
----------------
9.000000


Sample Input-2:
---------------
2 -3

Sample Output-2:
----------------
0.125000

******* Testcases *******
case =1
input =3 2
output =9.000000

case =2
input =2 -3
output =0.125000

case =3
input =-5 9
output =-1953125.000000

case =4
input =-5 -6
output =0.000064

case =5
input =12 6
output =2985984.000000

case =6
input =8 7
output =2097152.000000

case =7
input =9 7
output =4782969.000000

case =8
input =10 8
output =100000000.000000

*/

import java.util.*;

class Power {
	static float power(float x, int y)
	{
		System.out.println("y " + y);
		float temp;
		if( y == 0)
			return 1;
		temp = power(x, y/2);
		
		System.out.println("y end " + y + " temp " + temp);

		if (y%2 == 0)
			return temp*temp;
		else
		{
			if(y > 0)
				return x * temp * temp;
			else
				return (temp * temp) / x;
		}
	}
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		float K = sc.nextFloat();
		int N = sc.nextInt();
		System.out.printf("%f", power(K, N));
	}
}
