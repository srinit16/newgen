package hr.dao;
import hr.data.Employee;

public interface EmployeeDao {
		public Employee find(int id) throws EmployeeException;
		//public boolean delete(int id);
		//public void update(Employee e);
		//public Employee findAll();

}
