package ie.gmit.sw;

import java.io.*;
import java.util.*;

//File Parser Class

public class ParseFile {

	// Instance Variables
	private List<String> fileContents = new ArrayList<String>();

	// constructor with file name input (string)
	public ParseFile(String fileName) {
		this.parse(fileName);

	}

	public void parse(String fileName) {
		BufferedReader br = null;//make a new BufferedReader
		try {
			//BufferedReader extract the filename
			br = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}

		// output to list
		StringBuffer bw = null;

		try {
			//create the StringBuffer to append the string
			bw = new StringBuffer();
			//create the string to copy the file
			String copy = "";
			
			while ((copy = br.readLine()) != null) {
				bw.append(copy + "\n");
				// splitting the line on one or more
				String[] words = copy.split("\\s+");
				// add it to the arraylist
				fileContents.addAll(Arrays.asList(words));
				
			}
		} 
		catch (IOException e) {
			e.printStackTrace();
		}

	}// Parses

	
	// populate the array from the list array at the top to a new one
	public List<String> getList() {
		List<String> fileC = new ArrayList<String>();

		for (String string : fileContents) {
			fileC.add(string);
		}
		return fileC;
	}

}