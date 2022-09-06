import java.util.*;

class ReverseString3 {
	public String reverseString(String s) {
		StringBuilder sb = new StringBuilder(s);
		return sb.reverse().toString();
	}

	public static void main(String args[]){
		System.out.println("Enter the string");	
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		System.out.println(new ReverseString3().reverseString(s));
	}
}