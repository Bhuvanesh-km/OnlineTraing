package pack1;

public class GreatestOf3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=190;
		int num2=20;
		int num3=190;
		if(num1>num2&&num1>num3) 
			System.out.println("Greatest among 3 numbers is: "+num1);
		else if(num2>num1&&num2>num3)
			System.out.println("Greatest among 3 numbers is: "+num2);
		else
			System.out.println("Greatest among 3 numbers is: "+num3);
	}

}
