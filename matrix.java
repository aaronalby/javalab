package javalab;
import java.util.Scanner;
public class matrix {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the numbr of rows of first matrix  ");
		int m1=sc.nextInt();
		System.out.println("enter the numbr of columns of first matrix ");
		int n1=sc.nextInt();
		System.out.println("enter the numbr of rows of 2nd matrix  ");
		int m2=sc.nextInt();
		System.out.println("enter the numbr of columns of 2nd matrix ");
		int n2=sc.nextInt();
		if(n1!=m2) {
			System.out.println("multiplication is not possible ");
		}
		int A[][]= new int [m1][n1];
		int B[][]= new int [m2][n2];
		int C[][]= new int [m1][n1];
		int i,j,k;
		System.out.println("read elements in matrix 1");
		for(i=0;i<m1;i++) {
			for(j=0;j<n1;j++) {
				System.out.println("A["+i+"]["+j+"]= ");
				A[i][j]=sc.nextInt();
			}
		}
		System.out.println("read elements in matrix 2");
		for(i=0;i<m2;i++) {
			for(j=0;j<n2;j++) {
				System.out.println("B["+i+"]["+j+"]= ");
				B[i][j]=sc.nextInt();}}
		for(i=0;i<m1;i++) {
			for(j=0;j<n2;j++) {
				C[i][j]=0;
				for(k=0;k<n1;k++) {
					C[i][j]=A[i][k]*B[k][j];
				}}}
		System.out.println("Result is ");
		for(i=0;i<m1;i++) {
			for(j=0;j<n2;j++) {
				System.out.print(C[i][j]+"\t");}
			System.out.println();}
	}

}
