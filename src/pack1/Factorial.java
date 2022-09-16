package pack1;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=6;
		int n=num;
		int fact=1;
		while(num>0) {
			fact=fact*num;
			num--;
		}
		System.out.println("factorial of "+n+" is "+fact);
}
}
