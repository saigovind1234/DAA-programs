import java.util.*;


/*
Time complexity: O(NM log M)
N = Number of strings
M = Length of the longest string

Space complexity:
O(M) 
M = Length of the longest string 
*/

class LCP_BS {
    public static String longestCommonPrefix(String[] strs, int n) {
        if (strs == null || strs.length == 0) return "";   
		
		int index = findMinLength(strs, n);
        String prefix = ""; 
 
        // Do an in-place binary search on the first string 
		// of the array in the range 0 to index
        int low = 0, high = index-1;
        while (low <= high) 
		{             
            int mid = (low + high) / 2;
 
            if (allContainsPrefix(strs, n, strs[0], low, mid))
            {
                // If all the strings in the input array contains this prefix 
				// then append this substring 
                prefix = prefix + strs[0].substring(low, mid + 1);
 
                // And then go for the right part
                low = mid + 1;
            }
            else // Go for the left part
            {
                high = mid - 1;
            }
        } 
        return prefix;
    }    

	// A Function to find the string having the minimum length 
    static int findMinLength(String arr[], int n)
    {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i <= (n - 1); i++)
        {
            if (arr[i].length() < min) {
                min = arr[i].length();
            }
        }
        return min;
    }
 
    static boolean allContainsPrefix(String arr[], int n, String str, int start, int end)
    {
        for (int i = 0; i <= (n - 1); i++)
        {
            String arr_i = arr[i];
			System.out.println("arr_i " + arr_i + " str " + str + " n " + n + " start " + start + " end " + end);
             
            for (int j = start; j <= end; j++)
                if (arr_i.charAt(j) != str.charAt(j))
                    return false;
        }
		return true;
	}
    
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		String[] words = sc.nextLine().split(" ");
		System.out.println(longestCommonPrefix(words, words.length));
	}
}