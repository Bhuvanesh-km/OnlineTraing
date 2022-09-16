package pack1;

public class StringConcatenation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="hello ";
		String str2="Bhuvan";
		
		System.out.println("String concatination using '+' operator: "+str1+str2);
		
		String s=str1.concat(str2);
		System.out.println("String concatination using built-in function: "+s);
	}

}
