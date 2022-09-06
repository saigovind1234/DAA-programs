import java.util.*;

// Using Recursion
class StroboNumber {
    public char[][] reversiblePairs = {
        {'0', '0'}, {'1', '1'}, 
        {'6', '9'}, {'8', '8'}, {'9', '6'}
    };
    
    public List<String> generateStroboNumbers(int n,int num) {
        if (n == 0) {
            // 0-digit strobogrammatic number is an empty string.
            return new ArrayList<>(Arrays.asList(""));
        }
        
        if (n == 1) {
            // 1-digit strobogrammatic numbers.
            return new ArrayList<>(Arrays.asList("0", "1", "8"));
        }
        
        List<String> prevStroboNums = generateStroboNumbers(n - 2,num);
        List<String> currStroboNums = new ArrayList<>();
        
		//System.out.println("prevStroboNums " + prevStroboNums + " " + prevStroboNums.size());
        for (String prevStroboNum : prevStroboNums) {
            for (char[] pair : reversiblePairs) {
                // We can only append 0's if it is not first digit.
                if (pair[0] != '0' || n != num) {
                    currStroboNums.add(pair[0] + prevStroboNum + pair[1]);
                }
            }
        }       
		Collections.sort(currStroboNums);
        return currStroboNums;
    }    
	
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(new StroboNumber().generateStroboNumbers(n,n));
	}
}