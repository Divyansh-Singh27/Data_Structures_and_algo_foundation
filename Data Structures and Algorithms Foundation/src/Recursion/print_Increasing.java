package Recursion;

import java.util.Scanner;

public class print_Increasing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		 int n = sc.nextInt();
	     printIncreasing(n);

	 }
	
	 public static void printIncreasing(int n) {
	        if (n == 0) {
	            return;
	        }

	        
	        printIncreasing(n - 1);
	        System.out.println(n);
	    }

	}


