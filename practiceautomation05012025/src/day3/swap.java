package day3;

public class swap {
	public static void main(String args[])
	{
		int a = 5, b = 10;
		a = a + b;  // a = 15
		b = a - b;  // b = 15 - 10 = 5
		a = a - b;  // a = 15 - 5 = 10
		System.out.println("a: " + a + ", b: " + b);  // Output: a: 10, b: 5
		
	}
	

}
