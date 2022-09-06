import java.util.*;

class HappyNumber2 {
	private static boolean isHappy(int n){
		HashSet<Integer> st = new HashSet<>();
		while (true)
		{
			n = numSquareSum(n);
			if (n == 1)
				return true;
			if (st.contains(n))
				return false;
			st.add(n);
		}
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