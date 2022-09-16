package pack2;

public class MethodOverloading2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading2 ob = new MethodOverloading2();
		ob.sub(8, 4);
		ob.sub(12, 5.7);
		ob.sub(8, 4, 2);
	}
	void sub(int a,int b) {
		System.out.println("subition of "+a+"-"+b+"="+(a-b));
	}
	void sub(int a,double b) {
		System.out.println("subition of "+a+"-"+b+"="+(a-b));
	}
	void sub(int a, int b, int c) {
		System.out.println("subition of "+a+"-"+b+"-"+c+"="+(a-b-c));
	}

}
