package pack1;

public class Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,3,4};
		int b[] = {5,6,7,8};
		int c[] = new int[a.length];
		for(int i=0;i<a.length;i++) 
			c[i]= a[i]+b[i];
		
		for(int i:c)
			System.out.println(i);
	}

}
