package hr.data;

import hr.util.CanHire;

public class Manager extends Employee implements CanHire{
	
		private double teamBudget;

		public Manager(int id, String name, double salary, byte deptId, double teamBudget) {
				super(id,name,salary,deptId);
				this.teamBudget=teamBudget;
		}
		
		public void display() {
			super.display();
			System.out.println("Budget:"+teamBudget);
		}

		@Override
		public void raiseSalary(double amount) {
			this.salary+=amount;
			this.teamBudget+=amount*.20;
			
		}

		@Override
		public boolean isHire() {
			// TODO Auto-generated method stub
			return true;
		}
}
