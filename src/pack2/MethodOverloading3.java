package pack2;

public class MethodOverloading3 {

	public static void main(String[] args) {
		// TODO Auto*generated method stub
		MethodOverloading3 ob = new MethodOverloading3();
		ob.mul(8, 4);
		ob.mul(487, 598);
		ob.mul(8, 4, 2.5,5.1);
	}
	void mul(int a,int b) {
		System.out.println("mulition of integer "+a+"*"+b+" = "+(a*b));
	}
	void mul(long a,long b) {
		System.out.println("mulition of long "+a+"*"+b+" = "+(a*b));
	}
	void mul(int a, int b, double c,double d) {
		System.out.println("mulition of "+a+"*"+b+"*"+c+"*"+d+" = "+(a*b*c*d));
	}

}
