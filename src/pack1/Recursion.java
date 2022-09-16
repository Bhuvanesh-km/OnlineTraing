package pack1;

public class Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fact(4));
	}
	static int fact(int n) {
		if(n>0)
			return fact(n-1)*n;
		else
		return 1;
	}
}
