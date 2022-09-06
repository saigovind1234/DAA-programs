import java.util.*;
public class ReverseString 
{ 
	public static void main(String[] args)
	{ 
		Scanner sc =new Scanner(System.in);
 		System.out.println("Enter the string");		
		String myStr = sc.next();
 
 		// Create Method and pass and input parameter string 
		String reversed = reverseString(myStr);
		System.out.println("The reversed string is: " + reversed);		
	} 
 
	// Method take string parameter and check string is empty or not
	public static String reverseString(String myStr)
	{
		if (myStr.isEmpty())
		{
			System.out.println("String in now Empty");	
			return myStr;
		}

		// Calling Function Recursively
		System.out.println("String to be passed in Recursive Function: "  +myStr.substring(1));		
		return reverseString(myStr.substring(1)) + myStr.charAt(0);
	}
 }
