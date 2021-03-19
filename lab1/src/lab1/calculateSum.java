package lab1;

/**
 * Name - Aryan Arya
 * Date : 18/3/21
 * Description : sum of first n natural numbers which are divisible by 3 or 5.
 */
import java.util.Scanner;


public class calculateSum {

                public static void main(String[] args) {
				// TODO Auto-generated method stub
				Scanner scan = new Scanner(System.in);
				System.out.println("Enter the number: ");
				int integer = scan.nextInt();
				int sumValue = calculateSum(integer);
				System.out.println("The sum of all natural numbers which are divisible by 3 or 5 is : "+ sumValue);

			}

			private static int calculateSum(int number) {
				int sum = 0;
				for(int i=3; i<=number; i++) {
					if(i%3==0 || i%5==0) {
						sum+=i;
					}
				}
				return sum;
			}

		}

 