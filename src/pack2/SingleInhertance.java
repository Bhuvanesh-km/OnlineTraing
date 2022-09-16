package pack2;

class Login{
	void login() {
		System.out.println("verify login");
	}
}

public class SingleInhertance extends Login{
	
	void addBen() {
		System.out.println("benificiary added successfully");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleInhertance a = new SingleInhertance();
		a.login();
		a.addBen();
	}
}
