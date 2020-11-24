package basePackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class InputReader {
	
	     public static void main(String []args) throws IOException{
	     
	        InputReader obj = new InputReader();
	        obj.UsingScanner();
//	        obj.ConsoleClass();
	         
	     }
	     
	     public void UsingBufferReader() throws IOException{
	    	 BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in)); 
	    	 String name = reader.readLine(); 
	    	 System.out.println(name);         
	     } 

	    // This worked
	     public void UsingScanner() throws IOException{
		    	Scanner sc = new Scanner(System.in);
		    	while(sc.hasNextLine()) {
		    	String line= sc.nextLine();
		    	System.out.println("From Scanner  "+line);
		    	}
		     }  
	     
	     // using console class
	     public void ConsoleClass()
	     {         
	         // Using Console to input data from user 
	         String name = System.console().readLine(); 
	         System.out.println("From Console "+name); 
	     } 
}
