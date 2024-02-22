package hr;
import java.io.FileNotFoundException;
import java.util.ArrayList;

import hr.data.Employee;
import hr.data.HouseKeepingEmployee;
import hr.data.ICEmployee;
import hr.data.Manager;
import hr.util.CanHire;
import hr.util.Helper;
import hr.util.NoFileNameException;;

public class Main {
		public static void show(Employee e) {
			System.out.println("*********");
			e.raiseSalary(1000);
			e.display();
		}
		
		public static void hiring(Employee e) {
			if(e instanceof CanHire) {
				 e.display();
				 CanHire c=(CanHire) e;
				 System.out.println("Can Hire :"+c.isHire());
			 
			}
		}

	public static void main(String[] args){
		//	Employee e=new Employee(1, "Alex", 2300.00);
			ArrayList<Employee> arr=new ArrayList<>();
			arr.add(new Manager(11, "Shrestha", 23000.00, (byte)101, 10000));
			arr.add(new ICEmployee(1, "AJ", 2300.23,(byte)101, "GSI"));
			arr.add(new HouseKeepingEmployee(3,"Brij Kishor",12000.00));
			
			for(Employee e:arr) {
				hiring(e);
			}
			
	}
}
