package day3assignment;

import java.util.Scanner;

public class Ameoba {

	public static void main(String[] args) {
			System.out.println("Enter the no of months:");
			Scanner sc=new Scanner(System.in);
			int b=0,c=1,d=0;
			int a=sc.nextInt();
			for(int i=2;i<a;i++)
			{
				d=b+c;
				b=c;
				c=d;
			}
			System.out.println(d);

		}



	}


