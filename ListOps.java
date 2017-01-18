
/** The class Listops defines a number of static methods to work with
 * lists using the List class.
 * @author Dhanish Ashraf
 *
 */
public class ListOps extends List {
	
	/** return the last number of a list
	 * @param a
	 * @return
	 */
	public static int last(List a){
		if(a.isEmpty())
			throw new IllegalStateException("The list is empty.");
		else if(a.getTail().isEmpty())
			return a.getHead();
		else
			return last(a.getTail());
	}
	
	/** a method that returns the nth element of a list
	 * @param n the nth element
	 * @param a the list
	 * @return
	 */
	public static int select(int n, List a){
		if(a.isEmpty())
			throw new IllegalArgumentException("The list is empty.");
		else if(n==0)
			return a.getHead();
		else
			return select(n-1, a.getTail());
	}
	
	/** add an integer x to the end of a list a
	 * @param a
	 * @param x
	 * @return
	 */
	public static List addToEnd(List a, int x){
		if(a.isEmpty())
			return cons(x, empty());
		else 
			return cons(a.getHead(), addToEnd(a.getTail(), x));
	}
	
	/** a method that appends the end of List a with List b
	 * @param a list
	 * @param b list
	 * @return
	 */
	public static List append(List a, List b){
		if(a.isEmpty())
			return b;
		else
			return cons(a.getHead(), append(a.getTail(), b));
	}
	
	/**  An efficient (tail recursive) implementation to reverse a List 
     * that uses a helper method and an accumulator
	 * @param a
	 * @return
	 */
	public static List reverse(List a){
		return reverseAccumulate(a, empty());
	}
	
	/** reverseAccumulate reverses the elements of the list 'original' and adds
     * them at the front of the list 'reversed', returning the resulting list.
	 * @param original
	 * @param reversed
	 * @return
	 */
	public static List reverseAccumulate(List original, List reversed){
		if(original.isEmpty())
			return reversed;
		else
            return reverseAccumulate(original.getTail(), cons(original.getHead(), reversed));
	}
	
	public static int max(List a){
		if(a.isEmpty())
			throw new IllegalStateException("The list is empty");
		else if(a.getTail().isEmpty())
			return a.getHead();
		else 
			return Math.max(a.getHead(), max(a.getTail()));	
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
