package hr.data;

import hr.util.CanHire;

public class ICEmployee extends Employee implements CanHire{
		private String projName;
		public ICEmployee(int id, String name, double salary, byte deptId, String projName) {
			super(id,name,salary,deptId);
			this.projName=projName;
		}
		
		public ICEmployee(int id, String name, double salary) {
			super(id,name,salary);
			this.projName=null;
		}
		
		public void display() {
			super.display();
			System.out.println("ProjName:"+projName);
		}

		@Override
		public void raiseSalary(double amount) {
			this.salary+=amount;
			
		}

		@Override
		public boolean isHire() {
			// TODO Auto-generated method stub
			return false;
		}

}
