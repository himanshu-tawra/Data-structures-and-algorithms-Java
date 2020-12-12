
public class ReverseNumber {

	public static void main(String[] args) {
		
		int temp = 205;
		int ans = 0;
		
		while(temp != 0) {
			ans = ans*10 + temp%10;
			temp /=10;
		}
		System.out.println(ans);
	}

}
