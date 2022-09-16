package pack2;

class Animal{
	void animals() {
		System.out.println("Animals");
	}
}

public class MethodOverridding extends Animal{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverridding ob=new MethodOverridding();
		ob.animals();
	}
	void animals() {
		super.animals();
		System.out.println("dogs can bark");
	}

}
