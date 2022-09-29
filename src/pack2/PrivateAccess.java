package pack2;

public class PrivateAccess {
	//accessible only within class
	private void med() {
		System.out.println("private access modifier");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrivateAccess o = new PrivateAccess();
		o.med();
	}

}

