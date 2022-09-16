package pack2;
abstract class Abc{
	abstract void m1();
	void m2() {
		System.out.println("code in m2");
	}
}

public class AbstractClass extends Abc{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractClass a = new AbstractClass();
		a.m1();
		a.m2();
	}
	void m1() {
		System.out.println("code in m1");
	}

}
