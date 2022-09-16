package pack2;
class Log{
	void log() {
		System.out.println("verify login");
	}
}
class AddBen extends Log{	
	void addBen() {
		System.out.println("benificiary added successfully");
	}
}
public class MultilevInheritance extends AddBen{
	void transFunds() {
		System.out.println("verify funds transfer");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultilevInheritance m = new MultilevInheritance();
		m.log();
		m.addBen();
		m.transFunds();
	}
}

