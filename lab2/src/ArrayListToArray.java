
package lab2;
/**
 * Name : Aryan Arya
 * Date - 20/3/2021
 * Description :Java program to convert an ArrayList to an array.
 */
import java.util.ArrayList;
public class ArrayListToArray {
	
	public static void main(String[] args) 
	{
		
	ArrayList<String> languages=new ArrayList<>();
	languages.add("C");
	languages.add("Python");
	languages.add("Java");
	System.out.println("ArrayList:"+languages);
	
	String[] arr=new String[languages.size()];
	
	languages.toArray(arr);
	System.out.println("Array :");
	for(String item: arr  ) {
		System.out.println(item+" ");
	}



	}
}

	
	


