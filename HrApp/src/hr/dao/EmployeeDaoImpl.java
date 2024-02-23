package hr.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import hr.data.Employee;

public class EmployeeDaoImpl implements EmployeeDao{

	private Connection get() throws SQLException{
		String url="jdbc:sqlserver://localhost;encrypt=false;databaseName=store"; 
		String uname="sa";
		String password="Newgen#902024";
		
		Connection con=DriverManager.getConnection(url, uname, password);
		return con;
	}

	@Override
	public Employee find(int id) throws EmployeeException {
		Employee e=null;
		Connection con=null;
		try {
				con = get();
				System.out.println(1);
				String query="select EMP_ID, CONCAT(FNAME, ' ', LNAME) AS EMP_NAME, SALARY , DEPT_ID from employee where EMP_ID=?";
				PreparedStatement ps=con.prepareStatement(query);
				ps.setInt(1, id);
				ResultSet rs=ps.executeQuery();
				if(rs.next()) {
					String name=rs.getString("EMP_NAME");
					double salary=rs.getDouble("SALARY");
					int deptId=rs.getInt("DEPT_ID");
					e=new Employee(id,name,salary,(byte)deptId);
							
				}
		 }catch(SQLException ss) {
			 ss.printStackTrace();
			throw new EmployeeException("Error :"+ss.getMessage());
		 }finally {
			 try {
				con.close();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		 }
		return e;
	}

}
