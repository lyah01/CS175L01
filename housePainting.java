import java.util.Scanner;
public class housePainting {

	public static void main(String[] args) {
	Scanner scan= new Scanner(System.in);
	
		//Input dimensions
		System.out.println("Enter the length of the house:");
		int houseLength= scan.nextInt();
		System.out.println("Enter the width of the house:");
		int houseWidth= scan.nextInt();
		System.out.println("Enter the height of the house:");
		int houseHeight= scan.nextInt();
		System.out.println("Enter the amount of windows:");
		int windowNum=scan.nextInt();
		System.out.println("Enter the length of the window:");
		int windowLength= scan.nextInt();
		System.out.println("Enter the width of the window:");
		int windowWidth=scan.nextInt();
		System.out.println("Enter the amount of doors:");
		int doorNum=scan.nextInt();
		System.out.println("Enter the length of the door:");
		int doorLength=scan.nextInt();
		System.out.println("Enter the width of the door:");		
	
		
		//Calculations 
		int doorWidth=scan.nextInt();
		int windowTotal=windowLength*windowWidth*windowNum;
		int doorTotal=doorLength*doorWidth*doorNum;
		double houseSqFt=1/2+(houseLength*(houseHeight-houseWidth))+2*(houseLength*houseWidth)+(houseLength*houseWidth)*2;
		System.out.println(houseSqFt);
		double sqFtToPaint=(houseSqFt-(windowTotal+doorTotal));
		System.out.println(sqFtToPaint);
		
	

	}

}
