/** @author Dhanish Ashraf 1336289
 * This class contains the solution for Worksheet1
 */

public class Worksheet1 implements Worksheet1Interface {

  public static int power(int m, int n) {	  
	  if(n == 0)
		  return 1;
	  else
		  return m * power(m, n-1);
	}

  public static int fastPower(int m, int n) {
	  if(n==0)
		  return 1;
	  else if(n%2 ==0) {
		  int y = fastPower(m, n/2);
		  return y * y;  
	  }
	  else
		  return m * fastPower(m, n-1);
	}

	public static List negateAll(List a) {
		if(a.isEmpty())
			return List.empty();
		else
			return List.cons(a.getHead()*(-1), negateAll(a.getTail()));
	}

	public static int find(int x, List a) {
		if(a.isEmpty())
			throw new IllegalStateException("The list is empty.");
		else if(a.getHead() == x)
			return 0;
		else {
			int count = find(x, a.getTail()) + 1;
			return count;
		}
	}

	public static boolean allPositive(List a) {
		if(a.isEmpty())
			throw new IllegalStateException("The list is empty.");
		else if(a.getHead() < 0)
			return false;
		else 
			if(!a.getTail().isEmpty())
				if(!allPositive(a.getTail()))
					return false;
		return true;
	}

	public static List positives(List a) {
		if(a.isEmpty())
			return List.empty();
		else if (a.getHead() < 0)
			return positives(a.getTail());
		else
			return List.cons(a.getHead(), positives(a.getTail()));	
	}

	public static boolean sorted(List a) {
		if(a.isEmpty() || a.getTail().isEmpty())
			return true;
		else if(a.getHead() > a.getTail().getHead())
			return false;
		else
			if(!sorted(a.getTail()))
				return false;
		return true;
	}

	public static List merge(List a, List b) {
		if(a.isEmpty() && b.isEmpty())
			return List.empty();
		else if(a.isEmpty())
			return b;
		else if(b.isEmpty())
			return a;
		else if(a.getHead() < b.getHead())
			return List.cons(a.getHead(), merge(a.getTail(), b));
		else
			return List.cons(b.getHead(), merge(a, b.getTail()));			
	}

	static List removeDuplicates(List a) {
		if(a.isEmpty())
			return List.empty();
		else if(a.getTail().isEmpty())
			return List.cons(a.getHead(), List.empty());
		else if(a.getHead() == a.getTail().getHead())
			return removeDuplicates(a.getTail());
		else
			return List.cons(a.getHead(), removeDuplicates(a.getTail()));
	}

}
