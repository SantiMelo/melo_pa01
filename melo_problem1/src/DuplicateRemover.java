package problemOne;

import java.util.*;
import java.io.File;
import java.util.HashSet;
import java.io.FileNotFoundException;
import java.io.FileWriter;


public class DuplicateRemover {
	
	private Set <String> uniqueWords;
	

	 public void remove(String dataFile)
	 {
			Scanner keyboard=null;
		 try
		 {
			uniqueWords= new HashSet<>();
			keyboard= new Scanner(new File(dataFile));
			while(keyboard.hasNextLine())
			{
				uniqueWords.add(keyboard.next());
			}
							
		 }
		 catch (FileNotFoundException e)
		 {
			 System.out.println(e);
			 System.out.println("Error, file not found, please try again.");

			 
		 }
		 if(keyboard!=null)
			 keyboard.close();
	 }
	 public void write(String outputFile)
	 {
		 FileWriter type= null;
		 try
		 {
			 type= new FileWriter(outputFile);
			 for(String str : uniqueWords)
				 type.write(str);
			 type.close();
			 
		 }
		 catch(Exception e)
		 {
			 System.out.println("Error, please try again");
			 System.out.println(e);
		 }
		 
	 }
}
			

