//Section Handout #5: Files, Arrays, and ArrayLists

// WordCount that reads a file and reports how many lines, words, and characters  appear  in  it. 


package week4Assignments;


//import acm.program.*;
import java.io.*;

public class wordCount  {
	
	private static int count = 1; 
	
	
	public static void main(String arg[]) throws IOException {
		
	File text = new File("src//week4Assignments//King_Lear.txt");
    FileInputStream fileStream = new FileInputStream(text);
    InputStreamReader input = new InputStreamReader(fileStream);
    BufferedReader reader = new BufferedReader(input);
			
//***** VARIABLES ******
	
	String line;
		
	int lineCount = 0; 
	int wordCount = 0; 
	int characterCount = 0;
	
		
	while((line = reader.readLine()) != null) {
		characterCount = characterCount + line.length();
		
		String[] wordList = line.split("\\W|");
		
		wordCount = wordCount + wordList.length;
		
		for (String instance : wordList) {
			System.out.println("Word #: " + count++ + "    " );
			System.out.println(instance);
		}
		
		String[] linesList = line.split("\\n");
		
		lineCount = lineCount + linesList.length;
		
	}
		
		System.out.println("TOTAL WORD COUNT: " + wordCount);
		System.out.println("TOTAL LINE COUNT: " + lineCount);
		System.out.println("TOTAL NUMBER OF CHARACTERS = " + characterCount);
		
	}

}
