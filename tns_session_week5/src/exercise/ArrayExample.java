package exercise;

public class ArrayExample {

	public static void main(String[] args) {
		int [] arr= {5,1,2,3,4};
		
		
		int minvalue = arr[0];
		int maxvalue = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<minvalue) {
				minvalue=arr[i];
				
			}
			
			if(arr[i]>maxvalue) {
				maxvalue=arr[i];
				
			}
			
		}
		System.out.println("Maximum value : "+maxvalue);
		System.out.println("Minimum value : "+minvalue);
		int diff= maxvalue-minvalue;
		System.out.println("difference  :"+diff);
		
		

	}

}
