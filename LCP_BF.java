
/*
Time complexity: O(NM)
N = Number of strings
M = Length of the longest string

Space complexity: O(M)
*/

class LCP_BF {

	// A Utility Function to find the common prefix between
	// strings- str1 and str2
	static String commonPrefixUtil(String str1, String str2) {
		String result = "";
		int n1 = str1.length(), n2 = str2.length();

		// Compare str1 and str2
		for (int i = 0, j = 0; i <= n1 - 1 && j <= n2 - 1; i++, j++) {
			if (str1.charAt(i) != str2.charAt(j)) {
				break;
			}
			result += str1.charAt(i);
		}
		System.out.println( str1 + " " + str2 + " " + result);
		return (result);
	}

	// A Function that returns the longest common prefix
	// from the array of strings

	static String commonPrefix(String arr[], int n) {
		String prefix = arr[0];

		for (int i = 1; i <= n - 1; i++) {
			prefix = commonPrefixUtil(prefix, arr[i]);
		}

		return (prefix);
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String[] words = sc.nextLine().split(" ");

		String result = commonPrefix(words, words.length);

		if (result.length() > 0) {
			System.out.printf("The longest common prefix is ", result);
		} else {
			System.out.printf("There is no common prefix");
		}
	}
}
