
/** A recursive method to calculate the factorial of n, n!.
 * @author Dhanish Ashraf
 *
 */
public class factorial {
	
	public static int fact(int n){
		
		if(n == 0)
			return 1;
		else {
			return  n * fact(n-1);
		}
	}
	
	public static void main(String[] args){
		System.out.println(fact(0));
		System.out.println(fact(1));
		System.out.println(fact(2));
		System.out.println(fact(3));
		System.out.println(fact(4));
		System.out.println(fact(5));

	}

}
