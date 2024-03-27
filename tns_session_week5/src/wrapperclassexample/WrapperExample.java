package wrapperclassexample;

public class WrapperExample {
	public static void main(String[] args) {
		
		// from in built type to  object called autoboxing
		// from object type to in built called unboxing
		int a1=20;
		Integer a=new Integer(0);
		a=a1;//autoboxing
		System.out.println(a);
		
//		int a1=0;
//		Integer a=new Integer(20);
//		a1=a;//unboxing
//		System.out.println(a1);
		
		float k=2.3f;
		Float f = new Float(0.0);
		f=k;
		System.out.println(f);
	}

}
