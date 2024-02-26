//Write a program to create an array of 7 numbers. Print how many even numbers are there in your array.


package javacourse;

public class Array {

	public static void main(Stringuplo[] args) {
		int a[]= {1,2,3,4,5,6,7};
		int count=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				count++;
			}
			
			
		}
		System.out.println(count);
		
			
		}

	}


