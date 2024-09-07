package javalab;
import java.util.Scanner;
public class vowel {
	public static void main(String[]args) {
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string to check \n");
		String str=sc.nextLine();
		int len= str.length();
		for(int i=0;i<str.length();i++) {
				char c = str.charAt(i);
				if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U') {
					count++;
				}
		}
		System.out.println("number of vowels is " +count);
			
	}
}

