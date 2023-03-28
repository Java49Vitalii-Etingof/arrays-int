package telran.arrays.test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;
import static telran.arrays.MyArraysInt.*;

class MyArraysIntTests {

	@Test
	void testAddNumber() {
		int array[] = { 1, 2, 3 };
		int num = 4;
		int num1 = -4;
		int expected[] = { 1, 2, 3, 4 };
		int expected1[] = { 1, 2, 3, -4 };
		assertArrayEquals(expected1, addNumber(array, num1));
		assertArrayEquals(expected, addNumber(array, num));
	}

	@Test
	void testRemoveNumber() {
		int array[] = { 1, 2, 3, 4, 5 };
		int index = 3;
		int index1 = -1;
		int index2 = 5;
		int expected[] = { 1, 2, 3, 5 };
		int expected1[] = { 1, 2, 3, 4, 5 };
		assertArrayEquals(expected1, removeNumber(array, index1));
		assertArrayEquals(expected, removeNumber(array, index));
		assertArrayEquals(expected1, removeNumber(array, index2));

	}

	@Test
	void testInsertNumber() {
		int array[] = { 1, 2, 3, 5, 6 };
		int num = 4;
		int index = 3;
		int index1 = -1;
		int index2 = 5;
		int expected[] = { 1, 2, 3, 4, 5, 6 };
		int expected1[] = { 1, 2, 3, 5, 6 };
		assertArrayEquals(expected1, insertNumber(array, index1, num));
		assertArrayEquals(expected, insertNumber(array, index, num));
		assertArrayEquals(expected1, insertNumber(array, index2, num));
	}

	@Test
	void testCopyOf() {
		int array[] = { 1, 2, 3 };
		int expected1[] = { 1, 2, 3 };
		int expected2[] = { 1 };
		int expected3[] = { 1, 2, 3, 0, 0, 0 };
		assertArrayEquals(expected1, Arrays.copyOf(array, array.length));
		assertArrayEquals(expected2, Arrays.copyOf(array, 1));
		assertArrayEquals(expected3, Arrays.copyOf(array, 6));
	}

	@Test
	void testArrayCopy() {
		int array[] = { 1, 2, 3 };
		int expected[] = { 5, 10, 1, 2, 20 };
		int arrayDest[] = new int[5];
		arrayDest[4] = 20;
		int array1[] = { 2, 5, 10 };
		System.arraycopy(array, 0, arrayDest, 2, 2);
		System.arraycopy(array1, 1, arrayDest, 0, 2);
		assertArrayEquals(expected, arrayDest);
	}

	@Test
	void testBinarySearchInt() {
		// Array.binarySearch(int[] array, int number)
		// TODO
		// Write tests for standard method binarySearch of the class
		// Arrays taking array of ints and int number
		int array[] = { 1, 4, 11, 22, 25, 37, 41 };
		int num = 22;
		int num1 = 4;
		int num2 = 41;
		int expected = 3;
		int expected1 = 1;
		int expected2 = 6;
		assertEquals(expected, Arrays.binarySearch(array, 1, 4, num));
		assertEquals(expected1, Arrays.binarySearch(array, 0, 3, num1));
		assertEquals(expected2, Arrays.binarySearch(array, num2));
	}

}
