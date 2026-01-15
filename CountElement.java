package elements;

import java.util.Scanner;

public class CountElement {
	public static void main(String[] args) {
		
		Scanner sk = new Scanner(System.in);
		
		int n = sk.nextInt();
		int[] arr= new int[n];
		
		int pos = 0, neg = 0, zero = 0;
		
		for (int i=0; i<n; i++) {
		int x = sk.nextInt();
		
		
		if(x>0)
			pos++;
		else if (x<0)
			neg++;
		else 
			zero++;
	}
	
	System.out.print(" positive: "+ pos);
	System.out.print("Negative: " + neg);
	System.out.print(" Zero: " + zero);
	}
	

	}
