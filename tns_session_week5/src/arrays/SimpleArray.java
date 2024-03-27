package arrays;

public class SimpleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= new int[10];
		float arr1[] = new float[10];
		
		arr[0]=1;
		arr[1]=12;
		arr[2]=45;
		
		int[] arr2=new int[] {1,2,3};
		for(int i=0;i<arr2.length;i++) {
			System.out.println(arr2[i]);
		}
		
		for(int k:arr) {
			System.out.println(arr[k]);
		}

	}

}
