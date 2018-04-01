package ie.gmit.sw;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Runner {

	// Main Class
	public static void main(String[] args) {
		
		System.out.println("Rapid Encryption using the Four-Square Cipher");

		@SuppressWarnings("resource")
		Scanner console = new Scanner(System.in);
		
		ParseFile parseF = null;
		
		// It makes an object and calls the method
		FourSquareCipher b = new FourSquareCipher();
		
		
		
		System.out.println("Enter 'A' To Encode Text");
		System.out.println("Enter 'B' To Encode From A File");
		char option = console.next().charAt(0);

		if(option=='a'||option=='A'){
			// PlainText
			String ctext=b.encode("THECURFEWTOLLSTHEKNELLOFPARTINGDAY");
			// Print ctext
			System.out.println(ctext);
		}
		else if(option == 'b'||option == 'B'){

			System.out.println("Please Enter The Name Of File: ");
			String File = console.next();

			parseF = new ParseFile(File);

			List<String> copyTheList = new ArrayList<String>();

			copyTheList = parseF.getList();
			
			/*
			 * Parser Works But Encoder Does Not Properly Work.
			 * When File Name Is Entered And Program Is Run...It Fully Explains
			 * */

			PrintWriter out;
			try {
				out = new PrintWriter(new FileWriter("output.txt"));
				for (String string : copyTheList) {
					//System.out.println(b.encode(string));
					out.println(string);
				}

				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("Finished: ");
		}
	}

}
