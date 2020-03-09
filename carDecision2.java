import java.util.Scanner;
public class carDecision2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in=new Scanner(System.in);
		Scanner in1=new Scanner(System.in);
		
		System.out.println("Enter the information of the regular car (format Make & Model, Cost, MPG):");
		String regularCar=in.nextLine();
		
		System.out.println("Enter the information of the hybrid car");
		String hybridCar=in.nextLine();
		
		System.out.print("Enter miles traveled in a year: ");
		double milesTraveled=in.nextDouble();
		
		System.out.print("Enter cost per gallon of gas: ");
		double costPerGal=in.nextDouble();
		
		String [] arrReginf=regularCar.split(",");
		String mmReg=arrReginf[0];
		int costRegular=Integer.parseInt(arrReginf[1]);
		int regularMPG=Integer.parseInt(arrReginf[2]);
		
		String [] arrHybinf=hybridCar.split(",");
		String mmHyb=arrHybinf[0];
		int costHybrid=Integer.parseInt(arrHybinf[1]);
		int hybridMPG=Integer.parseInt(arrHybinf[2]);
		
		
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
		
		System.out.println("Cost to own after year 1 for " +mmReg+ ": "+ year1Regular +  " for " +mmHyb+ ":" +year1Hybrid++);
		System.out.println("Cost to own after year 2 for " +mmReg+ ": "+year2Regular+ " for " +mmHyb+ ":" +year2Hybrid++);
		System.out.println("Cost to own after year 3 for " +mmReg+ ": "+year3Regular+ " for " +mmHyb+ ":" +year3Hybrid++);
		System.out.println("Cost to own after year 4 for " +mmReg+ ": "+year4Regular+ " for " +mmHyb+ ":" +year4Hybrid++);
		System.out.println("Cost to own after year 5 for " +mmReg+ ": "+year5Regular+ " for " +mmHyb+ ":" +year5Hybrid++);
		
		//Is the hybrid less expensive after 5 years?
		if (year5Hybrid<year5Regular);
		System.out.print("The " + mmHyb + " pays back after 5 years");
		
		
		
		
				
	}

}
