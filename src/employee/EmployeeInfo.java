package employee;

public class EmployeeInfo {

	public static void main(String[] args) {
Employee employee1 = new Employee(1, "고보배", "마케팅");

Employee employee2 = new Employee(2, "윤보배", "디자인");

System.out.println(employee1.getEmployeeID() + employee1.getSerialNum());
System.out.println(employee2.getEmployeeID() + employee2.getSerialNum());

	}
}
