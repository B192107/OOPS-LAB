import java.util.*;

class lab4_strings_2{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first String:");
		String s1=sc.next();
		System.out.println("Enter the second String:");
		String s2=sc.next();
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
	}
}
