package lab3;
/**
 *Name - Arya Arya
 *Date - 21/3/21
 *Description : a class containing a method to create the mirror image of a String
 */

public class MirrorImageOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

     String str="EARTH";
		
		String mirror=getImage(str);
		
		System.out.println(str+"|"+mirror);

	}

	private static String getImage(String str) {
		
		int i;
		String rev="";
		for(i=0;i<str.length();i++)
		{
			rev=str.charAt(i)+rev;
		}
		return rev;
	}

}
