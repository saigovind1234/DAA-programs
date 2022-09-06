/*
Nested Recursion: In this recursion, a recursive function will pass the parameter as a recursive call. 
That means 'recursion inside recursion'
*/

class test {
 
	// Recursion function
	static int fun(int n)
	{
		System.out.print(n + " " );
		if (n > 100)
			return n - 10;
 
		// Recursion inside the recursion
		return fun(fun(n + 11));
	}	
 
	public static void main(String[] args)
	{
		int result;
		result = fun(95);
		System.out.print(result);
	}
}
 