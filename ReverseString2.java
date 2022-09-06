import java.util.*;

//Using Recursion
class ReverseString {
	public void helper(char[] s, int left, int right) {
		System.out.println(s);
		if (left >= right) return;

		char tmp = s[left];
		s[left++] = s[right];
		s[right--] = tmp;
		helper(s, left, right);
	}

	public char [] reverseString(char[] s) {
		helper(s, 0, s.length - 1);
		return s;
	}

	public static void main(String args[])
	{		
		System.out.println("Enter the string");	
		Scanner sc=new Scanner(System.in);
		char[] s=sc.next().toCharArray();
		System.out.println(new ReverseString().reverseString(s));
	}
}