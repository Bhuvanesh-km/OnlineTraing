package pack2;
interface intern1{
	void m1();
}

interface intern2{
	void m2();
}

public class Interface2 implements intern1, intern2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interface2 i = new Interface2();
		i.m1();
		i.m2();
	}
	public void m1() {
		System.out.println("code of m1");
	}
	public void m2() {
		System.out.println("code of m2");
	}

}
