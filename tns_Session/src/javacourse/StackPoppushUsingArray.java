package javacourse;



public class StackPoppushUsingArray {

	
		 private int[] a;
		 private int top ;
		 public StackPoppushUsingArray(int capacity) {
			 a=new int[capacity];
			 top=-1;
		 }
		 
		 public void push(int element) {
			 if(top==a.length-1) {
				 System.out.println("can not push element..");
			 }
			 else {
				 top++;
				 a[top]=element;
				 System.out.println("pushed element :"+element);
			 }
		 }
		 public int pop()
		 {
		 if(top==-1) 
		 {
			 
			System.out.println("Stack Underflow");
			return -1;
			
		}
		else 
		{
			int poppedel = a[top];
			top--;
			System.out.println("Popped element :"+poppedel);
			return poppedel; 
		}
		
		}	
		void display() 
		{
			System.out.println("printing elements..... ");
			for(int i =top;i>=0;i--) {
				System.out.println(a[i]);
			}
			
		}
		
	

}
