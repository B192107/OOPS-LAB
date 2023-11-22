import java.util.*;

class lab4_strings_7{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String:");
		String s1=sc.nextLine();
		
		for(int i=s1.length()-1;i>=0;i--){
			System.out.print(s1.charAt(i));
		}
	}
}
