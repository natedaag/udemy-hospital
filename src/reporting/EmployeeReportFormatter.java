package reporting;

import domain.Employee;

public class EmployeeReportFormatter extends ReportFormatter {

	public EmployeeReportFormatter(Employee emp, FormatType formatType) {
		super(emp, formatType);
	}

	Employee anEmployee = new Employee(0, "p", "a", false);
//	FormatType formatType;
	
	public String getFormattedEmployee() {
		System.out.println("a formatted employee");
		return getFormattedValue();
	}
	
}
