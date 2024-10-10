package javalab;
import java.util.*;
import java.io.*;
public class Filereader {
	public static void main(String[]args) {
		try {
			Scanner sc= new Scanner(System.in);
			File folder1= new File("Register.txt");
			folder1.createNewFile();
			System.out.println("Register.txt created\n");
				FileWriter fout = new FileWriter("Register.txt");
				System.out.println("enter rank ");
				int n= sc.nextInt();
				fout.write(n+"\n");
				fout.close();
				System.out.println("Rank enterd ");
				FileReader fin= new FileReader("Register.txt");
				BufferedReader br= new BufferedReader(fin);
				String line;
				System.out.println("\nContent of Register.txt is: ");
				while((line= br.readLine())!=null){
					System.out.println(line);
				}
				br.close();
		}
		catch(IOException e) {
			System.out.println("Exception occured: "+e.getMessage());
			
		}
	}

}
