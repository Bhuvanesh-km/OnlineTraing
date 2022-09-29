package pack1;

import java.util.Arrays;

public class ArrayExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int values[]= {3,5,4,2,1};
		int temp=0;
		System.out.print("original array: ");
		for(int i=0;i<values.length;i++)
			System.out.print(values[i]+" ");
		
		for(int i=0;i<values.length;i++) {
			for(int j=i+1;j<values.length;j++) {
				if(values[i]<values[j]) {
					temp=values[i];
					values[i]=values[j];
					values[j]=temp;
				}
			}
		}
		Arrays.sort(values);
		System.out.println("");
		System.out.print("array in descending order ");
		for(int i=0;i<values.length;i++)
			System.out.print(values[i]+" ");
	}

}
