import java.io.*;
import java.util.Scanner;

public class StringDemo {

	public static void main(String[] args) {
		/*String s1= new String("Hello!");
		String s2= new String("Hello!");
		String s3=s2;
		String s4="Hello!";
		String s5="Hello!";
		
		System.out.println("s1.equals(s2): "+s1.equals(s2));
		System.out.println("s1 == s2: "+(s1==s2));
		
		System.out.println("s2.equals(s3): "+s2.equals(s3));
		System.out.println("s2 == s3: "+(s2==s3));
		
		System.out.println("s1.equals(s4): "+s1.equals(s4));
		System.out.println("s1 == s4: "+(s1==s4));
		
		System.out.println("s4.equals(s5): "+s4.equals(s5));
		System.out.println("s4 == s5: "+(s4==s5));*/
		
		String s;
		
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("Nhap chuoi: ");
		s= scanner.nextLine();
		
		System.out.println("Chuoi vua nhap: \n"+s);
		
		//tach chuoi
		String []words = s.split("\\s");
		System.out.println("Tach chuoi: ");
		for(String w : words)
		{
			System.out.println(w);
		}
	}

}