package javalab;

import java.io.*;


public class Writefile {
    public static void main(String[] args) {
        try { 
        	FileInputStream fin = new FileInputStream("filename.txt");
             FileOutputStream fout = new FileOutputStream("filename2.txt"); 
             
            int i;
            while ((i = fin.read()) != -1) {
                fout.write(i);
            }
            System.out.println("Successfully wrote to specific file.");
            fin.close();
            fout.close();
        } catch (java.io.FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IO Exception: " + e.getMessage());
        }
    }
}
