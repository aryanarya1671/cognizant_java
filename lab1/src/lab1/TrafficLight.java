package lab1;

import java.util.Scanner;

/**
* Name : Aryan Arya
* Date : 17/3/21
* Description : Traffic Light
*/

public class TrafficLight {

	public static void main(String[] args) {
		int option;
		   System.out.println("Select the Light:\nRed-1 \nYellow-2 \nGreen-3");
		   Scanner scan=new Scanner(System.in);
		   option=scan.nextInt();
		   
		   {
		       if (option==1){
		         System.out.println("Stop");
		         }
		         else if(option==2){
		         System.out.println("ready");  
		        }
		         else{
		         System.out.println("go");
		         }
		   }
		

	}

}
