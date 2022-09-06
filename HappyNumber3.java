import java.util.*;

class HappyNumber3{
	private static boolean isHappy(int n){
		int slow, fast;
  
		//  initialize slow and fast by n
		slow = fast = n;
		do
		{
			// Move slow number by one iteration
			slow = numSquareSum(slow);
	  
			// move fast number by two iteration
			fast = numSquareSum(numSquareSum(fast));	  
		}
		while (slow != fast);
  
		// If both number meet at 1, then return true
		return (slow == 1);
	}
 
	// Function to return sum of square of digits
	private static int numSquareSum(int num){
		int sum = 0;
		while(num>0){
			sum += Math.pow(num%10, 2);
			num = num/10;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Enter a number");
		int num = in.nextInt();

		if(isHappy(num))
		  System.out.println("Happy Number");
		else
		  System.out.println("Not a Happy number");
	}
}