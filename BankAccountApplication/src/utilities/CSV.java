package utilities;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class CSV 
{   
    
	// This function will read data from a CSV file and return as a 'list'
	public static List<String[]> read(String file) // 'List<String[]>' indicates the list of string array
	{
		FileReader fr=null;
	    BufferedReader br=null;
	    
		List<String[]> data=new LinkedList<String[]>(); // Here we are using the linked list 'LinkedList<String[]>' which is really easy to add elements
		
		try 
		{
			fr=new FileReader(file);
			br=new BufferedReader(fr); // BufferedReader is a decorator of FileReader
			
			String line;
			
			while((line=br.readLine())!=null) 
			{
				String[] dataRecords=line.split(",");
				data.add(dataRecords);
			}
		
		} 
		
		
		catch (FileNotFoundException e) 
		{
			System.out.println("File not found:(");
			e.printStackTrace();
		} 
		
		catch (IOException e) 
		{
			System.out.println("Could not read file:(");
			e.printStackTrace();
		}
		
		return data;
		
	}

}

// We will find the following concept 'List<String[]>' under the 'Collections' concept in Java 