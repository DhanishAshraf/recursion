
/** Given number n, print n asterisks in a line.
 * @author Dhanish Ashraf
 *
 */
public class javaStars {
	
	public static void asterisks(int n){
		
		if (n == 0)
			System.out.println("");
		else {
			System.out.print("*");
			asterisks(n-1);
		}
	}

	public static void main(String[] args) {
		asterisks(0);
		asterisks(1);
		asterisks(2);
		asterisks(3);
		asterisks(4);

	}

}
