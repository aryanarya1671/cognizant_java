package lab2;
/** Name -Aryan Arya
 * Date - 18/3/21
 * Description - Sorted list of products name
 */


import java.util.*;  
import java.util.stream.*;  
public class SortedList 
{ 
	
public static void main(String[] args)  {
	
	// TODO Auto-generated method stub

	List<String> slist = Arrays.asList("1. Table", "2. Chair", "3. Book", "4. Pencil", "5. Pen");  

	List<String> sortedList = slist.stream().sorted().collect(Collectors.toList());     

	sortedList.forEach(System.out::println);  

 }  

 }  