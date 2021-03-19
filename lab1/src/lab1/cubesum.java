package lab1;

import java.util.Scanner;

/** Name : Aryan Arya
 * Description : to find the sum of the cubes of number.
 * Date : 16/3/21
 */

public class cubesum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = scan.nextInt();
		int sum=0;
		int i;
		while(num!=0)
		{
		   i=num%10;
		   sum=sum+(i*i*i);
		   num=num/10;
		  
		}
			System.out.println("The sum of cubes of the given number is"+sum);
	}
		
		

	}


