package exercise;

import java.util.Arrays;

public class compareArray {
	public static void main(String[] args) {
		
		int a[] = {1,34,23,45,34};
		System.out.println("Array a : "+Arrays.toString(a));
		int a1[]= {23,45,67,23,23};
		System.out.println("Array a : "+Arrays.toString(a1));
		if(Arrays.equals(a1, a)) {
			System.out.println("Both arrays are equal");
		}
		else {
			System.out.println("arrays are  not equal");
		}
	}

}
