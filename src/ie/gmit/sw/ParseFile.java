/*
 * Student Name: Usman Sattar
 * Student Number: G00345816
 * 
 * Title: Rapid Encryption using the Four-Square Cipher
 */

// Package Name: ie.gmit.sw
package ie.gmit.sw;

// Imports
import java.io.*;
import java.util.*;

// File Parser Class
public class ParseFile {

	// Instance Variables
	private List<String> fileContents = new ArrayList<String>();

	// fileName Input With Constructor
	public ParseFile(String fileName) {
		this.parse(fileName);
	}

	public void parse(String fileName) {
		// New BufferedReader
		BufferedReader br = null;
		try {
			// BufferedReader Extract fileName
			br = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}

		// Output To List
		StringBuffer bw = null;

		try {
			// Create StringBuffer To Append The String
			bw = new StringBuffer();
			// Create String To Copy The File
			String copy = "";

			while ((copy = br.readLine()) != null) {
				bw.append(copy + "\n");
				// Line Split
				String[] words = copy.split("\\s+");
				// Adding It To The ArrayList
				fileContents.addAll(Arrays.asList(words));

			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}// Parses

	// Populating The Array From The List Array To A New One
	public List<String> getList() {
		List<String> fileP = new ArrayList<String>();

		for (String string : fileContents) {
			fileP.add(string);
		}
		return fileP;
	}

}