package checkelement;

import java.util.Scanner;


public class ElementsAreUnique {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i<n; i++) {
		arr[i] = sc.nextInt();
		}
		
		for (int i = 0; i<n; i++) {
		for(int b = i+ 1 ; b<n; b++) {
		if(arr[i]== arr[b]) {
			System.out.println("No");
			return;
		}
		
		}
		
		
	}
	
	
	System.out.print("Yes");


}
}