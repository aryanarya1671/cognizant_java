package lab2;
/**
 * Name : Aryan Arya
 * Date - 18/3/2021
 * Description : List of duplicate Values
 */
public class DuplicateValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int [] arr = new int [] {1, 2, 3, 3, 4, 5, 6, 7, 7, 8};   
        
        System.out.println("Duplicate elements in given array: ");  
        //Searches for duplicate element  
        for(int i = 0; i < arr.length; i++) {  
            for(int j = i + 1; j < arr.length; j++) {  
                if(arr[i] == arr[j])  
                    System.out.println(arr[j]);  
            }  
        }
      }
	}

