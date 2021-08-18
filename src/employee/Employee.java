package employee;

public class Employee {
    private static int serialNum = 1000;
	
	private int employeeID;
	private String employeeName;
	private String department;
	
	public Employee() {
		serialNum++;
		employeeID= serialNum;
	}
	public Employee(int employeeID, String employeeName, String department) {
		this.employeeID = employeeID;
		this.employeeName = employeeName;
		this.department = department;
		
	}
	public static int getSerialNum() {
		//int i = 0;
		//employeeName = ""; => 사용할수 없음 
		return serialNum;
	}
	public int getEmployeeID() {
		//serialNum++;
		return employeeID;
	}
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	
	
}
