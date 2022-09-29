package pack2;

public class ThrowException {
	
	public static void med() throws Exception{
		int a=10/0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		med();
		}
		catch(Exception e) {
			System.out.println("Exception raised "+e);
		}
		
	}

}

