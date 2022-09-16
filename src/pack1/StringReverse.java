package pack1;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Bhuvi";
		System.out.println("original string: "+str);
		System.out.print("reversed string: ");
		
		for(int i=str.length()-1;i>=0;i--) {
			System.out.print(str.charAt(i));
		}

	}

}
