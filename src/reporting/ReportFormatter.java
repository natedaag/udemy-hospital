package reporting;

import domain.Employee;

public class ReportFormatter {

	String formattedOutput;
	
	public ReportFormatter(Object obj, FormatType formatType) {	
		switch(formatType) {
		case XML: 
			formattedOutput = convertObjectToXML(obj);
			break;
		case CSV:
			formattedOutput = convertObjectToCSV(obj);
			break;
		}
	}
	
	Employee emp = new Employee(0, "", "", false);
		
	private String convertObjectToXML(Object obj){
		System.out.println("object converted to XML");
		return "XML : <title>" + obj.toString() + "</title>";
	}
	
	private String convertObjectToCSV(Object obj) {
		System.out.println("object converted to CSV");
		return "CSV : ,,," + obj.toString() + ",,,,";
	}
	
	public String getFormattedValue() {
		System.out.println("Formatted report");
		return formattedOutput;
	}

}
