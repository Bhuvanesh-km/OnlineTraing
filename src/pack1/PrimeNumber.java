package pack1;

public class PrimeNumber {

	public static void main(String[] args) {
		// TOO Auto-generated method stub
		int num=7;
		int flag=0;
		if(num<2) 
			System.out.println(num+" is not prime number");
		
		else {
			for(int i=2;i<num;i++) {
				if(num%i==0) {
					flag=1;
					break;
				}
			}
			if(flag==1)
				System.out.println(num+" is not prime number");
			else
				System.out.println(num+" is prime number");
			}
		}	
	}


