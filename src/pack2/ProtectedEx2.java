package pack2;
import pack1.ProtectedEx1;
public class ProtectedEx2 extends ProtectedEx1{
	//protected can be accessed outside package iff inheritance should be used
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProtectedEx2 d = new ProtectedEx2();
		d.def();
	}

}
