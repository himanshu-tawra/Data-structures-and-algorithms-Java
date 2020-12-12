
public class DigitSum {
	
	
	public static int sum(int num) {
		
		int digitSum = 0;
		
		while(num!= 0) {
			digitSum += num%10;
			num /= 10;
		}
		return digitSum;
	}

	public static void main(String[] args) {
		
		int number = 5555;
		
		int result = sum(number);
		
		System.out.println("Sum of digits is " + result);
	}

}
