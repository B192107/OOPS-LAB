import java.util.*;

class lab4_strings_4{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first String:");
		String s1=sc.next();
		System.out.println("Enter the second String:");
		String s2=sc.next();
		
		System.out.println(s1.concat(s2));
		System.out.println(s1.length());
		System.out.println(s1.substring(3));
		System.out.println(s1.substring(3,5));
		
		System.out.println(s1.startsWith("s"));
		System.out.println(s1.endsWith("a"));
		
		String s3=s1.toUpperCase();
		System.out.println(s3);
		
		System.out.println(s3.toLowerCase());
		
	}
}
