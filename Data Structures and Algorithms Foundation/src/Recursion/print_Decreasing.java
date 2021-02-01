package Recursion;

import java.util.Scanner;

public class print_Decreasing {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 int n = sc.nextInt();
	     printDecreasing(n);

	 }
	
	// 1-Print Decreasing
	 public static void printDecreasing(int n) {
	        if(n == 0){
	            return;
	        }
	        
	        System.out.println(n);
	        printDecreasing(n-1);
	    }
	

	
}
