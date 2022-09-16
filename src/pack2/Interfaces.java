package pack2;
interface inter{
	 void m1();
}

public class Interfaces implements inter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interfaces i = new Interfaces();
		i.m1();
	}
	public void m1() {
		System.out.println("code of m1");
	}

}
