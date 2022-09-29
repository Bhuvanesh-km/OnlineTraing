package pack2;

public class MultipleCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[5];
		
		try {
			a[6]=5;		
		}
		catch(ArithmeticException e) {
			System.out.println("can't divide number by zero"+e);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index out of bound exception "+e);
		}
	}

}
