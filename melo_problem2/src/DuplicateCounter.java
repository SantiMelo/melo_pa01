package problemTwo;

import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;


public class DuplicateCounter {
	private Map<String,Integer> wordCounter;
	Scanner keyboard= null;
	
	public void count(String dataFile)
	{
		try
		{
		String text;
		wordCounter= new HashMap<String,Integer>();
		Scanner keyboard= new Scanner(new File(dataFile));
		while (keyboard.hasNextLine())
		{
			text=keyboard.next();
			if (wordCounter.containsKey(text))
			{
				wordCounter.put(text, wordCounter.get(text)+1);
			}
			else
			{
				wordCounter.put(text, 1);
			}
		}
		keyboard.close();
		}
		catch (FileNotFoundException e)
		 {
			 System.out.println(e);
			 System.out.println("Error, file not found, please try again.");
		 }
		
	}
	public void write(String outputFile)
	{
		FileWriter type= null;
		 try
		 {
			 type= new FileWriter(outputFile);
			 for(Map.Entry input : wordCounter.entrySet())
			 {
				 type.write(input.getKey()+""+input.getValue());
			 }
			 type.close();
			 
		 }
		 catch(Exception e)
		 {
			 System.out.println("Error, please try again");
			 System.out.println(e);
		 }
		 	
	}
}
