package javalab;
import java.util.Scanner;
public class freq {
	public static void main(String[]args) {
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string to check \n");
		String str=sc.nextLine();
		System.out.println("enter the character to check\n");
		String ch=sc.nextLine();
		int len= str.length();
		for(int i=0;i<len;i++) {
			if(str.charAt(i)==ch.charAt(0))
				count++;}
		System.out.println("number of times character present is " +count);
				
		}
			
	}

