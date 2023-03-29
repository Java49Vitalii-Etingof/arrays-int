package telran.arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.Arrays;

public class MyArraysInt {
	public static int[] addNumber(int[] array, int num) {
		// TODO
		// adds num at the array's end
		// returns new array with added number
		// using standard method Arrays.copyOf

		int array1[] = Arrays.copyOf(array, array.length + 1);
		array1[array.length] = num;
		return array1;
	}

	public static int[] removeNumber(int[] array, int index) {
		// TODO
		// removes element at a given index for right index value [0 - array.length-1]
		// and returns new array with no the removed one
		// returns the source array for a wrong index value
		// (less than 0 or greater than array.length - 1
		// using the standard method System.arraycopy

		int[] res = {};
		res = array;
		if (index >= 0 && index < array.length) {
			int arrayDest[] = new int[array.length - 1];
			System.arraycopy(array, 0, arrayDest, 0, index);
			System.arraycopy(array, index + 1, arrayDest, index, array.length - 1 - index);
			res = arrayDest;
		}
		return res;
	}

	public static int[] insertNumber(int[] array, int index, int num) {
		// TODO
		// inserts a given num at a given index for right value of the index [0 -
		// array.length]
		// and returns new array with the inserted number
		// return the source array for a wrong index value
		// (less than 0 or greater than array.length)
		// using the standard method System.arraycopy
		int[] res = {};
		res = array;

		if (index >= 0 && index < array.length) {
			int arrayDest[] = new int[array.length + 1];
			arrayDest[index] = num;
			System.arraycopy(array, 0, arrayDest, 0, index);
			System.arraycopy(array, 3, arrayDest, index + 1, array.length - index);
			res = arrayDest;
		}
		return res;
	}
	public static int[] insertNumberSorted(int [] array, int num) {
		int index = Arrays.binarySearch(array, num);
		if(index < 0) {
			index = -index -1;
		}
		return insertNumber(array, index, num);
	}
}
