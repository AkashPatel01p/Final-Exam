package main;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class SelectionSortTest {

	@Test
	public void testPositives() 
	{
		int[] expected = new int[] {1, 2, 3};
		int[] array = new int[] {3, 2, 1};
		SelectionSort.sort(array);
		System.out.println("Test Positive");
		for(int row = 0; row < array.length; row++)
		{
			System.out.print(String.valueOf(array[row]) + " ");
		}
		System.out.println();
		Assert.assertArrayEquals(expected, array);
	}

	@Test
	public void testNegatives()
	{
		int[] expected = new int[] {-3, -2, -1};
		int[] array = new int[] {-2, -3, -1};
		SelectionSort.sort(array);
		System.out.println("Test Negatives");
		for(int row = 0; row < array.length; row++)
		{
			System.out.print(String.valueOf(array[row]) + " ");
		}
		System.out.println();
		Assert.assertArrayEquals(expected, array);
	}

	@Test
	public void testMixed()
	{
		int[] expected = new int[] {-1, 0, 1};
		int[] array = new int[] {0, -1, 1};
		SelectionSort.sort(array);
		System.out.println("Test Mixed");
		for(int row = 0; row < array.length; row++)
		{
			System.out.print(String.valueOf(array[row]) + " ");
		}
		System.out.println();
		Assert.assertArrayEquals(expected, array);
	}


}
