
/** A method to print numbers from n to 0 (i.e. n, n-1, n-2, ..., 0) and from 0 to n.
 * @author Dhanish Ashraf
 *
 */
public class printNumbers {
	
	public static void printNums(int n){	
		if (n == 0)
			System.out.print(0);
		else {
			System.out.print(n + ", ");
			printNums(n-1);
		}
	}
	
	public static void printNumsBack(int n){
		if(n == 0)
			System.out.print(0);
		else {
			printNumsBack(n-1);
			System.out.print(", " + n);
		}
	}

	public static void main(String[] args) {
		printNums(5);
		System.out.println();
		printNumsBack(5);

	}

}
