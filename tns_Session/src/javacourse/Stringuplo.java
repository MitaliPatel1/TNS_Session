package javacourse;



public class Stringuplo {
	public static void main(String[] args) {
//		char ch[]= {'m','b'};
//		
//		
//		for(int i=0;i<ch.length;i++) {
//			if(ch[i].euals(ch[i].toLowerCase())) {
//			}
//		
//		}
		String str = "Mitali";
		
			if(str.equals(str.toLowerCase())) {
				System.out.println("converted into uppercase" );
				 str=str.toUpperCase();
				
				
			}
			else {
				System.out.println("converted in to lowercase");
				str=str.toLowerCase();
			
		}
			 System.out.println(str.charAt(0));
		
	}
	

}
