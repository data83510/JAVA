import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		
		double TotalBill=0;
		double Price;
		int choice;
		Scanner sc=new Scanner(System.in);
do {
		System.out.println("1.Idali");
		System.out.println("2.Dosa");
		System.out.println("3.Uttappa");
		System.out.println("4.Medu Vada");
		System.out.println("5.Maggi");
		System.out.println("6.Poha");
		System.out.println("7.Upama");
		System.out.println("8.Misal");
		System.out.println("9.Dahi vada");
		System.out.println("10.Samosa");
		System.out.println("11.Enter the Bill");
		System.out.println("Enter the choice-");
		choice=sc.nextInt();
		
		switch (choice)
		{
		case 1:
		{
		int q;
		Price=30;
		System.out.println("Idali-30");
		System.out.println("Enter Quantity-");
		q=sc.nextInt();
		TotalBill=TotalBill+(q*Price);
		}
		break;
		case 2:
		{
		int q;
		Price=30;
		System.out.println("Dosa-35");
		System.out.println("Enter Quantity-");
		q=sc.nextInt();
		TotalBill=TotalBill+(q*Price);
		}
		break;
		case 3:
		{
		int q;
		Price=30;
		System.out.println("Uttappa-40");
		System.out.println("Enter Quantity-");
		q=sc.nextInt();
		TotalBill=TotalBill+(q*Price);
		}
		break;
		case 4:
		{int q;
		Price=30;
		System.out.println("Medu vada-30");
		System.out.println("Enter Quantity-");
		q=sc.nextInt();
		TotalBill=TotalBill+(q*Price);
		}
		break;
		case 5:
		{
		int q;
		Price=30;
		System.out.println("Maggi-20");
		System.out.println("Enter Quantity-");
		q=sc.nextInt();
		TotalBill=TotalBill+(q*Price);	
		}
		break;
		case 6:
		{int q;
		Price=30;
		System.out.println("poha-20");
		System.out.println("Enter Quantity-");
		q=sc.nextInt();
		TotalBill=TotalBill+(q*Price);
		}
		break;
		case 7:
		{int q;
		Price=30;
		System.out.println("upma-30");
		System.out.println("Enter Quantity-");
		q=sc.nextInt();
		TotalBill=TotalBill+(q*Price);
		}
		break;
		case 8:
		{int q;
		Price=30;
		System.out.println("Misal-25");
		System.out.println("Enter Quantity-");
		q=sc.nextInt();
		TotalBill=TotalBill+(q*Price);
		}
		case 9:
		{
		int q;
		Price=30;
		System.out.println("Dahi vada-40");
		System.out.println("Enter Quantity-");
		q=sc.nextInt();
		TotalBill=TotalBill+(q*Price);
		}
		break;
		case 10:
		{
		int q;
		Price=30;
		System.out.println("Samosa-15");
		System.out.println("Enter Quantity-");
		q=sc.nextInt();
		TotalBill=TotalBill+(q*Price);
		}
		break;
		case 11:
		{
			System.out.println("Enter the bill-"+TotalBill);
			choice=0;
		}
			
		}
		
		

	
	}while(choice!=0);

}
}
