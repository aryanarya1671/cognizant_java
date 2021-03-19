
public class Expjava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("--------first line------");
		int a= 5, b= 0;
		try {
			int c=a/b;
			System.out.println("result : "+c);
		}
		catch(ArithmeticException e) 
		{
			System.out.println(e.getMessage());
		}
		System.out.println("-----last line-----");

	}

}
