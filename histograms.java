//Section Handout #5: Files, Arrays, and ArrayLists

package week4Assignments;

import acm.program.*; 
import acm.util.*; 
import java.io.*; 

public class histogram extends ConsoleProgram {     
	public void run() {       
		initHistogram();       
		readScoresIntoHistogram();       
		printHistogram();    
		
	} 

/* Initializes the histogram array */    
	
	private void initHistogram() {       
		histogramArray = new int[11];       
		
		for (int i = 0; i <= 10; i++) {          
			histogramArray[i] = 0;       
			
		}    
	} 
}