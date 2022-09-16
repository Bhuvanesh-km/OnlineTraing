package pack2;

public class Main {
	
	 void main() {
		System.out.println("in first main");
	}
	 void main(int x) {
		System.out.println("in second main");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main m = new Main();
		m.main();
		m.main(5);
		System.out.println("in default main");
	}
	
	

}
