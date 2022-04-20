package com.java.algorithmes;

import java.util.Arrays;
import java.util.Random;

public class BubbleSort {

	/**
	 * Bubble Sort algorithm runs O(n) in the best scenario O(n²) in the worst
	 * scenario
	 */
	public static void main(String[] args) {
		callSort();
	}

	private static void callSort() {
		Random random = new Random();
		int[] array = new int[10];
		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(1000);
		}
		System.out.println("Befor sorting " + Arrays.toString(array));
		 //sort1(array);
	    //sort2(array);
		sort3(array);
		System.out.println("After sorting" + Arrays.toString(array));
	}

	/** Before optimization */
	private static void sort1(int[] array) {
		int n = 0;
		for (int i = 0; i < array.length; i++) {
			n++;
			for (int j = 0; j < array.length - 1; j++) {
				n++;
				if (array[j] > array[j + 1]) {
					swap(j, j + 1, array);
				}
			}
		}
		System.out.println(n + " itiration to sort this array using sort1 ");
	}

	/** After optimization */
	/**
	 * The above function always runs O(n²) Time even if the array is sorted, it can
	 * be optimized by stopping the algorithm if the inner loop didn't cause any
	 * swap
	 */
	private static void sort2(int[] array) {
		boolean isSorted = true;
		int n = 0;
		for (int i = 0; i < array.length; i++) {
			n++;
			isSorted = true;
			for (int j = 0; j < array.length - 1; j++) {
				n++;
				if (array[j] > array[j + 1]) {
					isSorted = false;
					swap(j, j + 1, array);
				}
			}
			if (isSorted)
				break;
		}
		System.out.println(n + " itiration to sort this array using sort2 ");
	}

	/** using a while loop */
	private static void sort3(int[] array) {
		int n = 0;
		boolean isSorted  = false;
		while (!isSorted) {
			n++;
			isSorted = true;
			for (int i = 0; i < array.length - 1; i++) {
				n++;
				if (array[i] > array[i + 1]) {
					isSorted = false;
					swap(i, i+1, array);
				}
			}
		}

		System.out.println(n + " itiration to sort this array using sort3 ");
	}

	private static int[] swap(int index1, int index2, int[] array) {
		int tmp = array[index1];
		array[index1] = array[index2];
		array[index2] = tmp;
		return array;
	};

}
