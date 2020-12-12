
public class Palindrome {
	
	public static boolean isPalindrome(int num) {
		
		
		int temp = num;
		int result = 0;
		
		while(temp != 0) {
			result = result*10 + temp%10;
			temp /= 10;
		}
		
		if(num == result) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		
		int number = 9;
		
		boolean answer = isPalindrome(number);
		
		if(answer == true) {
			System.out.println("Number is palindrome");
		}
		else {
			System.out.println("Number is not palindrome");
		}

	}

}
