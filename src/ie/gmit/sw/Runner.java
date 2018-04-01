/*
 * Student Name: Usman Sattar
 * Student Number: G00345816
 * 
 * Title: Rapid Encryption using the Four-Square Cipher
 */

// Package Name: ie.gmit.sw
package ie.gmit.sw;

// Imports
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Runner {

	// Main Class
	public static void main(String[] args) {

		// Description of Program
		System.out.println("Rapid Encryption using the Four-Square Cipher");

		@SuppressWarnings("resource")
		Scanner console = new Scanner(System.in);

		ParseFile parseF = null;

		// It Makes An Object & Calls The Method
		FourSquareCipher b = new FourSquareCipher();

		// Prompting User To Enter 'A' To Encode
		System.out.println("Enter 'A' To Encode Text");
		// Prompting User To Enter 'B' To Encode From File
		System.out.println("Enter 'B' To Encode From A File");
		// Allows User To Enter A Character
		char option = console.next().charAt(0);

		/*
		 * If Option 'A' or 'a' Is Chosen Then Encode The Following Text:
		 * THECURFEWTOLLSTHEKNELLOFPARTINGDAY
		 */
		if (option == 'a' || option == 'A') {
			// PlainText
			String ptext = b.encode("THECURFEWTOLLSTHEKNELLOFPARTINGDAY");
			// Print ptext
			System.out.println(ptext);
			/*
			 * If Option 'B' or 'b' Is Chosen Then Encode A File User Has To
			 * Input A File Name
			 */
		} else if (option == 'b' || option == 'B') {

			// Prompting User To Enter A File Name From Folder
			System.out.println("Please Enter The Name Of File: ");
			String File = console.next();

			parseF = new ParseFile(File);

			List<String> copyTheList = new ArrayList<String>();

			copyTheList = parseF.getList();

			/*
			 * Parser Works But Encoder Does Not Properly Work. When File Name
			 * Is Entered And Program Is Run...It Fully Explains
			 */

			PrintWriter out;
			try {
				// Result Is Found In File Called "output.txt"
				out = new PrintWriter(new FileWriter("output.txt"));
				for (String string : copyTheList) {
					// System.out.println(b.encode(string));
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
