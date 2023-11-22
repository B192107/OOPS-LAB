import java.util.*;

class lab4_strings_5{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String:");
		String s1=sc.nextLine();
		
		int vc=0,cc=0;
		int l=s1.length();
		for(int i=0;i<l;i++){
			if(s1.charAt(i)=='a' || s1.charAt(i)=='e' || s1.charAt(i)=='i' || s1.charAt(i)=='o' || s1.charAt(i)=='u'||s1.charAt(i)=='A' || s1.charAt(i)=='E' || s1.charAt(i)=='I' || s1.charAt(i)=='O' || s1.charAt(i)=='U'){
				vc++;
			} 
			else if(s1.charAt(i)>='a' || s1.charAt(i)<='z'){
				cc++;
			}
		}
		System.out.println("vowel count = " +vc);
		System.out.println("consonant count = " + cc);
	}
}
