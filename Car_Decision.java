import java.util.Scanner;
public class Car_Decision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner in= new Scanner(System.in);
		
		System.out.println("Enter Cost of regular car: ");
		double costRegular=in.nextDouble();
		
		System.out.println("Enter miles per gallon of regular car: ");
		double regularMPG=in.nextDouble();
		
		System.out.println("Enter cost of hybrid car: ");
		double costHybrid=in.nextDouble();
		
		System.out.println("Enter Miles per gallon of hybrid car: ");
		double hybridMPG=in.nextDouble();
		
		System.out.println("Enter miles traveled in a year: ");
		double milesTraveled=in.nextDouble();
		
		System.out.println("Enter cost per gallon of gas: ");
		double costPerGal=in.nextDouble();
		
		//Calculations
		
		double gasRegular= (milesTraveled/regularMPG) * costPerGal;
		double year1Regular=costRegular + gasRegular;
		double year2Regular= gasRegular+year1Regular;
		double year3Regular=gasRegular+year2Regular;
		double year4Regular=gasRegular+year3Regular;
		double year5Regular=gasRegular+year4Regular;
		double gasHybrid=(milesTraveled/hybridMPG)*costPerGal;
		double year1Hybrid=gasHybrid+costHybrid;
		double year2Hybrid=gasHybrid+year1Hybrid;
		double year3Hybrid=gasHybrid+year2Hybrid;
		double year4Hybrid=gasHybrid+year3Hybrid;
		double year5Hybrid=gasHybrid+year4Hybrid;
		
		//
		System.out.println("Cost to own after year 1 for regular car: " +year1Regular+ " for hybrid car: " +year1Hybrid);
		System.out.println("Cost to own after year 2 for regular car: " +year2Regular+ " for hybrid car: " +year2Hybrid);
		System.out.println("Cost to own after year 3 for regular car: " +year3Regular+ " for hybrid car: " +year3Hybrid);
		System.out.println("Cost to own after year 4 for regular car: " +year4Regular+ " for hybrid car: " +year4Hybrid);
		System.out.println("Cost to own after year 5 for regular car: " +year5Regular+ " for hybrid car: " +year5Hybrid);
		
		//Is the hybrid less expensive after 5 years?
		if (year5Hybrid<year5Regular);
		System.out.print("The hybrid pays back after 5 years");
		
	}

}

		


