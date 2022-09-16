package pack2;

public class EmpDetails {
	String empName;
	int empId;
	int empSalary;
	String empDesg;
	static String company="tietoevry";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmpDetails ep1 = new EmpDetails();
		ep1.init("bhuvi", 13120, 25000, "Trainee software engn");
		ep1.display();
		empCompany();
		System.out.println("------------------------------");
		EmpDetails ep2 = new EmpDetails();
		ep2.init("kiran", 13345, 50000, "Data analyst");
		ep2.display();
		System.out.println("------------------------------");
		EmpDetails ep3 = new EmpDetails();
		ep3.init("naveen", 17643, 39000, "hr");
		ep3.display();
		System.out.println("------------------------------");
	}
	void init(String empname,int empid,int salary,String desg) {
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
	}
	static void empCompany() {
		System.out.println("name of company is "+company);
	}
	static {
		System.out.println("in static block");
	}

}