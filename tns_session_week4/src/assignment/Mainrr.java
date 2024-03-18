package assignment;
//Write a Java program to create an interface Resizable with methods resizeWidth(int width) and resizeHeight(int height) that allow an object to be resized. Create a class Rectangle that implements the Resizable interface and implements the resize methods.

public class Mainrr 
{
	public static void main(String[] args)
	{
		 Rectangle r = new Rectangle(100, 150);
		 r.printSize();
		 
		 r.resizeWidth(50);
		 r.resizeHeight(23);
		 System.out.println("after change width and height ......");
		 r.printSize();
		 
	}

}
