package arrays;

import java.util.Arrays;

public class Binarysearch {

	public static void main(String[] args) {
		int a[] = {1,34,23,45,34};
		System.out.println("Array a : "+Arrays.toString(a));
		int a1[]= {23,45,67,23,23};
		System.out.println("Array a : "+Arrays.toString(a1));
		int key=23;
		System.out.println(key + " found at index = "+Arrays.binarySearch(a, key));
		System.out.println(key + " found at index = "+Arrays.binarySearch(a1, key));

	}

}
