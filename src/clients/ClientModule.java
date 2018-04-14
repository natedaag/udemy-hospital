package clients;

import java.sql.SQLException;

import domain.Employee;
import domain.dao.EmployeeDAO;
import reporting.EmployeeReportFormatter;
import reporting.FormatType;

public class ClientModule {
	
	public static void main(String[] args) throws SQLException {
		Employee peggy = new Employee(1, "Peggy", "accounting", true);
		ClientModule.hireNewEmployee(peggy);
		printEmployeeReport(peggy, FormatType.XML);
	}
	
	public static void hireNewEmployee(Employee emp) throws SQLException {
		EmployeeDAO empDao = new EmployeeDAO();
		empDao.saveEmployee(emp);
		System.out.println("Welcome aboard");
	}
	
	public static void terminateEmployee(Employee emp) {
		EmployeeDAO empDao = new EmployeeDAO();
		empDao.deleteEmployee(emp);
		System.out.println("Sorry to see you go");
	}
	
	public static void printEmployeeReport(Employee emp, FormatType formatType) {
		EmployeeReportFormatter formatter = new EmployeeReportFormatter(emp, formatType);
		System.out.println(formatter.getFormattedEmployee());
	}
	
}
