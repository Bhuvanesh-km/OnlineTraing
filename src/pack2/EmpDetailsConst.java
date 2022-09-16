package pack2;

public class EmpDetailsConst {
	String empName;
	int empId;
	int empSalary;
	String empDesg;
	
	static String companyname ="Tietoevry";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmpDetailsConst ep1 = new EmpDetailsConst("bhuvi", 13120, 25000, "Trainee software engn");
		ep1.display();
		System.out.println("------------------------------");
		EmpDetailsConst ep2 = new EmpDetailsConst("kiran", 13345, 50000, "Data analyst");
		ep2.display();
		System.out.println("------------------------------");
		EmpDetailsConst ep3 = new EmpDetailsConst("naveen", 17643, 39000, "hr");
		ep3.display();
		System.out.println("------------------------------");
	}
	EmpDetailsConst(String empname,int empid,int salary,String desg) {
		empName=empname;
		empId=empid;
		empSalary=salary;
		empDesg=desg;
	}
	void display() {
		System.out.println("Employee name is "+empName);
		System.out.println("Employee Id is"+empId);
		System.out.println("Employee salary is "+empSalary);
		System.out.println("Employee designation is "+empDesg);
		System.out.println("Employee company name is"+companyname);
	}
}
