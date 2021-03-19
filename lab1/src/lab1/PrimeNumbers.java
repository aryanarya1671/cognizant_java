package lab1;

import java.util.Scanner;

/**
 * Name - Aryan Arya
 * Date - 17/3/21
 *Description - Finding the prime numbers upto a given integer
 */

public class PrimeNumbers {

	public static void main(String[] args) {
		System.out.println("Enter a number");
		try (Scanner scan = new Scanner(System.in)) {
			int num = scan.nextInt();
			for(int i=1; i<=num; i++)
			{
				int count=0;
				for(int j=1;j<=i;j++)
				{
					if(i%j==0)
					{
						count++;
					}
					
				}
				if(count==2)
				
					System.out.print(i+" ");
				
			}
		}
	}

}
