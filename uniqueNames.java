//Section Handout #5: Files, Arrays, and ArrayLists

package week4Assignments;

//import acm.program.*; 
import java.util.*; 
		
		public class UniqueNames extends ConsoleProgram {         
			
			public void run() {       
				
				ArrayList<String> list = new ArrayList<String>();      
				
				while (true) {          
					
					String name = readLine("NAME HERE: ");          
					
					if (name.equals("")) break;          
					
					if (!list.contains(name)) {             
						
						list.add(name);          
						
					}       
					
				}       
				
				System.out.println("LIST OF UNIQUE NAMES = ");       
				
				printList(list);    
				
			}    
			
			
			/* Prints out contents of ArrayList, one element per line */    
			
			
			
			private void printList(ArrayList list) {       
				
				for(int i = 0; i < list.size(); i++) {          
					
					System.out.println(list.get(i));       
					
				}    
	}

}
