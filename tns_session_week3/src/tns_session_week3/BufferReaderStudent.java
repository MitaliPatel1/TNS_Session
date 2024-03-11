package tns_session_week3;

import java.io.*;
import java.util.Scanner;


public class BufferReaderStudent {
	public static void main(String[] args) {
		Student s = new Student();
		int UID;
		String name="";
		System.out.println(s.toString());
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Enter your name : ");
			name=br.readLine();
			System.out.println("Enter your UID : ");
			UID = Integer.parseInt(br.readLine());
			System.out.println("name : "+ name +"\n"+ "UID : "+UID );
			
		}
		catch (Exception e) {
			e.printStackTrace();
			
		}
	}

}
