package lab3;
/**
 * Name - Aryan Arya
 * Date - 21/3/21
 * Description : a method which accepts a String and replaces all the consonants in the String with the next alphabet.
 */

import java.util.Scanner;

public class ReplaceWithNextAlphabet {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the String");
			String str=sc.next();
			
			
     System.out.println("the altered string is:"+alterString(str));
		}
	}
	private static String alterString(String pStr)
	{
		String alteredStr="";
		for(int i=0;i<pStr.length();i++)
		{
		if(pStr.charAt(i)=='a' ||pStr.charAt(i)=='A'||
				pStr.charAt(i)=='e'||pStr.charAt(i)=='E'||
				pStr.charAt(i)=='i' ||pStr.charAt(i)=='I'||
				pStr.charAt(i)=='o' ||pStr.charAt(i)=='O'||
				pStr.charAt(i)=='u' ||pStr.charAt(i)=='U' )
		alteredStr+=pStr.charAt(i);
		else
		{
			char ascii=(char)((char) pStr.charAt(i)+1);
			alteredStr+=ascii;
		}
		}
		return alteredStr;


	}

}