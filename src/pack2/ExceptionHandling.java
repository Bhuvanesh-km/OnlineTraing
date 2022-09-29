package pack2;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		int i=1/0;
		System.out.println("4");
		System.out.println("5");
		try {
			int a=5/0;
		}
		catch(ArithmeticException e) {
			System.out.println("can't divide number by zero"+e);
		}
	
		
	}

}
