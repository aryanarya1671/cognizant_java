package lab1;

import java.util.Scanner;

/**
 * Name : Aryan Arya
* Date : 16/3/21
* Description : Fibonacci
 */

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num , Fib1 = 0, Fib2 = 1;
		System.out.println("Enter the number:");
		Scanner scan=new Scanner(System.in);
		   num=scan.nextInt();
        System.out.print("First " + num + " terms: ");

        for (int i = 1; i <= num; ++i)
        {
            System.out.print(Fib1 + " ");

            int sum = Fib1 + Fib2;
            Fib1 = Fib2;
            Fib2 = sum;
        }
	} 

}
