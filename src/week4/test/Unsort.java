package week4.test;

import java.util.Arrays;

public class Unsort {
	public static void main(String[] args) {
		int[] array = {0, 1, 2, 3, 4, 5, 6, 10, 10};
		int[] tmp = new int[array.length];
		for (int i = 0; i < array.length; i++)  tmp[array.length -1 - i] = array[i];
		for (int i = 0; i < array.length; i++)  array[i] = tmp[i];
		System.out.println(Arrays.toString(array));
	}
}
