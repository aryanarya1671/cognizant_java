package lab1;

import java.util.Scanner;

/*
 * Name - Aryan Arya
 * Date -18/3/21
 * Description - Calculate the difference
 */
public class calculateDifference {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number = sc.nextInt();
		int sumValue = calculateDifference(number);
		System.out.println("The difference: "+ sumValue);

	}

	private static int calculateDifference(int number) {
		int sumOfSquares = 0;
		int normalSum=0;
		for(int i=1; i<=number; i++) {
			sumOfSquares+=(i*i);
			normalSum+= i;
		}
		int sum = sumOfSquares-(normalSum*normalSum);
		return sum;
	}

}
