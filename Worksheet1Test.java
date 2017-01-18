import static org.junit.Assert.*;

import org.junit.Test;

/** @author Dhanish Ashraf 1336289
 * This class contains the test cases for Worksheet1 solutions.
 *  <WRITE YOUR TEST CASES BELOW>
 */

public class Worksheet1Test {
	
	/**
	 * In this test we check both the power and fastPower method 
	 * work correctly and that they produce the same result.
	 */
	@Test
	public void testPowers() {
		
		int expected = 125;
		int actualPower = Worksheet1.power(5, 3);
		int actualFastPower = Worksheet1.fastPower(5, 3);
		
		assertEquals(actualPower, actualFastPower, expected);
	}
	
	/**
	 * Testing method negateAll by checking it returns the expected list. 
	 */
	@Test
	public void testNegateAll(){
		
		List expected = List.cons(-2, List.cons(5, List.cons(-8, List.cons(0, List.empty()))));
		List a = List.cons(2, List.cons(-5, List.cons(8, List.cons(0, List.empty()))));
		List actual = Worksheet1.negateAll(a);
		
		List.equals(actual, expected);
	}
	
	/**
	 * Testing the base case of method negateAll.
	 * i.e. it returns the empty list when the method receives the empty list as its parameters.
	 */
	@Test
	public void testNegateAll2(){
		
		List expected = List.empty();
		List a = List.empty();
		List actual = Worksheet1.negateAll(a);
		
		List.equals(actual, expected);
	}
	
	/**
	 * Testing the find method by ensuring it returns the correct result
	 */
	@Test
	public void testFind(){
		
		int expected = 2;
		List a = List.cons(7, List.cons(5, List.cons(3, List.cons(8, List.empty()))));
		int actual = Worksheet1.find(3, a);
		
		assertEquals(expected, actual);
	}
	
	/**
	 * Checking the bases case of the find method by ensuring it returns an IllegalStatException when
	 * the method is asked to find an integer in an empty list.
	 */
	@Test (expected = IllegalStateException.class)
	public void testFind2(){
		
		List a = List.empty();
		int actual = Worksheet1.find(3, a);
	}
	
	/**
	 * Testing the allPostive method by ensuring it brings back the correct boolean value.
	 */
	@Test
	public void testAllPositive(){
		
		List a = List.cons(1, List.cons(2, List.cons(-3, List.cons(4, List.empty()))));
		boolean actual = Worksheet1.allPositive(a);
		
		assertFalse(actual);
	}
	
	/**
	 * Testing the allPostive method by ensuring it throws an IllegalStateException
	 */
	@Test (expected = IllegalStateException.class)
	public void testAllPositive2(){
		
		List a = List.empty();
		boolean actual = Worksheet1.allPositive(a);
	}
	
	/**
	 * Testing the positives method by ensuring it brings back the correct List.
	 */
	@Test
	public void testPositives(){ 
		
		List expected = List.cons(2, List.cons(3, List.cons(8, List.empty())));
		List a = List.cons(2, List.cons(3, List.cons(-5, List.cons(8, List.cons(-2, List.empty())))));
		List actual = Worksheet1.positives(a);
		
		List.equals(expected, actual);
		
	}
	
	/**
	 * Testing the positives method by ensuring it brings back the correct List.
	 */
	@Test
	public void testPositives2(){
		
		List expected = List.empty();
		List a = List.cons(-2, List.cons(-3, List.cons(-5, List.cons(-8, List.cons(-2, List.empty())))));
		List actual = Worksheet1.positives(a);
		
		List.equals(expected, actual);
	}
	
	/**
	 * Testing the sorted method by ensuring it brings back the correct boolean value.
	 */
	@Test
	public void testSorted(){
		
		List a = List.cons(2, List.cons(5, List.cons(3, List.cons(2, List.cons(7, List.empty())))));
		boolean actual = Worksheet1.sorted(a);
		
		assertFalse(actual);
		
	}
	
	/**
	 * Testing the merge method by ensuring it brings back the correct List.
	 */
	@Test
	public void testMerge(){
		
		List expected = List.cons(2, List.cons(5, List.cons(5, List.cons(5, List.cons(7, List.cons(8, 
				List.cons(8, List.cons(9, List.empty()))))))));
		List a = List.cons(2, List.cons(5, List.cons(5, List.cons(8, List.empty()))));
		List b = List.cons(5, List.cons(7, List.cons(8, List.cons(9, List.empty()))));
		List actual = Worksheet1.merge(a, b);
		
		List.equals(expected, actual);
	}
	
	/**
	 * Testing the removeDuplicate method by ensuring it brings back the correct List.
	 */
	@Test
	public void testRemoveDuplicate(){ 
		
		List expected = List.cons(2, List.cons(5, List.cons(7, List.cons(8, List.cons(9, List.empty())))));
		List a = List.cons(2, List.cons(5, List.cons(5, List.cons(5, List.cons(7, List.cons(8, 
				List.cons(8, List.cons(9, List.empty()))))))));
		List actual = Worksheet1.removeDuplicates(a);
		
		List.equals(expected, actual);
		
	}
	
}
