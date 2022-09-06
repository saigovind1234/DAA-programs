import java.util.Scanner;
 
class HappyNumber {
	private static boolean isHappy(int num){
		if(num == 1 || num == 7)
			return true;
		else
		{
			if(num < 10)
				return false;
		}

		// Call the function with sum value
		return isHappy(numSquareSum(num));
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