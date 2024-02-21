package hr;
import java.io.FileNotFoundException;

import hr.data.Employee;
import hr.util.Helper;
import hr.util.NoFileNameException;;

public class Main {
	public static void main(String[] args){
			//Employee e=new Employee();
			//int[] numbers= {1,2,3,4,5};
			//for(int i=0; i<=5; i++) {
			//	System.out.print(numbers[i]+"\t");
			//}
		
			//String fname="/Users/nitin/desktop/newwgen/sample.txt";
			String fname="";
			try {
				String line =Helper.loadFile(fname);
				System.out.println(line);
			}catch(FileNotFoundException ex) {
				System.out.println(ex.getMessage());
			}catch(NoFileNameException ex) {
				System.out.println(ex);
			}
			
			System.out.println("end");
	}
}
