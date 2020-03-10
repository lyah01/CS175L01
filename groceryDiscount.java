import java.util.Scanner;
public class groceryDiscount {
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			Scanner sc=new Scanner(System.in);
			double discount;
			final double couponDiscount_1=0.08;
			final double couponDiscount_2=0.10;
			final double couponDiscount_3=0.12;
			final double couponDiscount_4=0.14;
			double groceryPrice;
			
			while (true) {
				System.out.println("Enter the cost of groceries or 0 to quit:");
				
			groceryPrice=sc.nextDouble();
			if (groceryPrice!=0) {
				if (groceryPrice>210)
				{
					discount=groceryPrice * couponDiscount_4;
					System.out.println ("You get a discount of $" + discount + "(" +couponDiscount_4*100+"% of your purchase) ");
					
				}
				else if (groceryPrice>150 && groceryPrice<=210)
				{
					discount=groceryPrice*couponDiscount_3;
					System.out.println("You get a discount of $"+discount+ "(" +couponDiscount_3*100+ "% of your purchase)");
				}
				else if (groceryPrice>=60 && groceryPrice<=150)
				{
					discount=groceryPrice*couponDiscount_2;
					System.out.println("You get a discount of $" +discount+ "("+couponDiscount_2*100+ "% of your purchase)");
				}
				else if (groceryPrice>=10 && groceryPrice<=60)
				{
					discount=groceryPrice*couponDiscount_1;
					System.out.println("You get a discount of $"+discount+ "("+couponDiscount_1*100+ "% of your purchase)");
				}
				else
				{
					System.out.println("You aren't elegible for a coupon this time");
		
				}
			}
			}
		}
}
				
				
			
			
		
			
			
		
	


