import java.util.*;
class StroboNumber2{
	public boolean isStrobogrammatic(String num) {
        // second try: mostly same logic, just use StringBuilder instead of String
        // cause it's much faster!
        // 6 rotated -> 9
        // 9 rotated -> 6
        // 8 rotated -> 8
        // 0 rotated -> 0
        // 1 rotated -> 1
        StringBuilder result = new StringBuilder();
        for (int i = num.length() - 1; i >= 0; i--) {
            char curr = num.charAt(i);
            if (curr == '6') {
                result.append('9');
            }else if (curr == '9') {
                result.append('6');
            }else if (curr == '8' || curr == '0' || curr == '1') {
                result.append(curr);
            }else {     
                return false;
            }
        }
        return result.toString().equals(num);
    }
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String n=sc.next();
		System.out.println(new StroboNumber2().isStrobogrammatic(n));
	}
}