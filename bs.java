import java.util.*;

class BS 
{
	public static void main(String[] args) 
	{
		List<Integer> numbers = Arrays.asList(1, 2, 4, 5, 9);
		System.out.println("index of 5 is " + Collections.binarySearch(numbers, 5));
	}
}
