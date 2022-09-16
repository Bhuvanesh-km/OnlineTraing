package pack1;

public class Functions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Functions obj = new Functions();
		obj.addition(45,20);
		obj.subtraction(60, 30);
		obj.multiplication(12, 5);
		obj.division(25, 7);
		
	}
	void addition(int x,int y) {
		// TODO Auto-generated method stub
		System.out.println(x+"+"+y+"="+(x+y));
	}
	void subtraction(int x,int y) {
		System.out.println(x+"-"+y+"="+(x-y));
	}
	void multiplication(int x, int y) {
		System.out.println(x+"*"+y+"="+x*y);
	}
	void division(int x, int y) {
		System.out.println(x+"/"+y+"="+x/y);
	}
}
