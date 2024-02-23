package hr.data;

public  class Employee {
		private int id;
		private String name;
		protected double salary;
		private byte deptId;
		
		public Employee(int id, String name, double salary, byte deptId) {
		
			this.id = id;
			this.name = name;
			this.salary = salary;
			this.deptId = deptId;
		}
		public Employee(int id, String name, double salary) {
			this(id,name,salary,(byte)0);
		}
		public int getId() {
			return id;
		}
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public double getSalary() {
			return salary;
		}
		public void raiseSalary(double amount) {
			this.salary+=amount;
		}
		
		public byte getDeptId() {
			return deptId;
		}
		public void setDeptId(byte deptId) {
			this.deptId = deptId;
		}
		
		public void display() {
			System.out.println("ID:"+id);
			System.out.println("Name:"+name);
			System.out.println("salary:"+salary);
			System.out.println("deptId:"+deptId);
		}
		
		
}
