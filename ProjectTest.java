package javapractice;

import static org.junit.Assert.assertArrayEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class ProjectTest {
	
	@Test
	public void sortIntArray() {
		
		final int[] numbers = {9,8,7,6,5,4,3,2,1};
		final int[] expected = {1,2,3,4,5,6,7,8,9};
		
		Arrays.sort(numbers);
		
		assertArrayEquals(expected, numbers);
	}
	
	@Test
	public void sortStringArray() {
		
		final String[] strings = {"f","e","a","c","b","d"};
		final String[] expectedStrings = {"a","b","c","d","e","f"};
		
		Arrays.sort(strings);
		
		assertArrayEquals(expectedStrings, strings);
		
		
		
	}
	
	//@Test
	public void sortNotComparable() {
		
		final List<NotCompareable> objects = new ArrayList<NotCompareable>();
		for(int i = 0; i < 10; i++) {
			objects.add(new NotCompareable(i));
			
		}
		
		try {
			Arrays.sort(objects.toArray());
			System.out.println(objects.toArray());
		}
		catch(Exception e) {
			//correct behaviour --- cannot sort
			return;
		}
		
		//fail();
	}
	
}
