package hr.util;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Helper {
	
			public static String loadFile(String fname) throws FileNotFoundException, NoFileNameException{
				
				String line="";
				FileReader fr=null;
				if(fname.equals("")) {
					throw new NoFileNameException();
				}
					fr=new FileReader(fname);
					Scanner sc=new Scanner(fr);
					line=sc.nextLine();
		
					//System.out.println(ex);
			
			
			
				return line;
			}

}
