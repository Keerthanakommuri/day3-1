package day3assignment;

import java.util.Scanner;

public class ValidNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n,a,i=1,count=0;
		System.out.println("Enter the number");
		n=sc.nextInt();
			while(i<n) {
				System.out.println("Enter the number");
				a=sc.nextInt();
				if (a%8==0) {
					count++;
				}
				else {
					System.out.println("The number of valid numbers entered is "+count);
					break; 
					}
				
			}

	}


	}


