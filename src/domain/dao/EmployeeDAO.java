package domain.dao;

import java.sql.SQLException;

import database.DatabaseConnectionManager;
import domain.Employee;

public class EmployeeDAO {
	
	DatabaseConnectionManager dcm;
	
	public void saveEmployee(Employee emp) throws SQLException {
//		DatabaseConnectionManager dcm = DatabaseConnectionManager.getManagerInstance();
//		dcm.connect();
//		dcm.getConnectionObject().prepareStatement("insert");
//		dcm.disconnect();
		System.out.println("Employee saved" + emp);
	}
	
	public void deleteEmployee(Employee emp) {
		System.out.println("Employee deleted" + emp);
	}

}
