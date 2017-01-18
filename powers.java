
public class powers {
	
	public static int power(int m, int n){
		
		if(n == 0)
			return 1;
		else {
			return m * power(m, n-1);
		}
	}
	
	public static int fastPower(int m, int n){
		
		if(n == 0)
			return 1;
		if(n%2 == 0){
			int y = fastPower(m, n/2);
			return y * y; }
		else
			return m * fastPower(m, n-1);
		
	}
	
	public static void main(String[] args){
		System.out.println(power(2, 3));
		System.out.println(power(5, 2));
		
		System.out.println(fastPower(2, 3));
		System.out.println(fastPower(5, 2));
	}

}
