package javalab;
import java.util.Scanner;
import java.util.StringTokenizer;
public class Tokenizer {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the line of integers ");
		String s= sc.nextLine();
		int sum=0;
		System.out.println("Integers are: ");
		StringTokenizer st= new StringTokenizer(s);
		while(st.hasMoreTokens()) {
			String a= st.nextToken();
			int n=Integer.parseInt(a);
			System.out.println(n);
			sum+=n;}
		System.out.println("sum of all integers: "+sum);
		sc.close();
		}
	}


