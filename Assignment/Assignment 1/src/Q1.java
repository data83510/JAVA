import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
	
		int num1;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number-");
		num1=sc.nextInt();
		System.out.println("Given Number-"+num1);
		System.out.println("Binary Equivalent-"+ Integer.toBinaryString(num1));
		System.out.println("Octal Equivalent-"+ Integer.toOctalString(num1));
		System.out.println("HexaDecimal Equivalent-"+ Integer.toHexString(num1));
		
		

	}

}
