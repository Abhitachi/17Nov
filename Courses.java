package tap.Geek;
import java.util.Scanner;
public class Courses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		//String branch;
		System.out.println("Enter the year of the Student");
		int year=sc.nextInt();
		//System.out.println("Enter the Branch");
		String branch;
		if(year==1) {
			System.out.println("English,Maths,Science");
		}
		else if(year==2) {
			System.out.println("Enter the Branch");
			branch=sc.next();
			if(branch.equalsIgnoreCase("CSE")) {
				System.out.println("Operating System,Java,Data Structure");
			}
			else if(branch.equalsIgnoreCase("ECE")){
				System.out.println("Micro processor,Logic switching theory");
			}
			else if(branch.equalsIgnoreCase("MEE")){
				System.out.println("Drawing,Manufacturing Machines");
			}
		}
		else if(year==3) {
			System.out.println("Enter the Branch");
			branch=sc.next();
			if(branch.equalsIgnoreCase("CSE")) {
				System.out.println("Computer Organization,Multimedia");
			}
			else if(branch.equalsIgnoreCase("ECE")) {
				System.out.println("Fundamentals of Logic Design,Microelectronics");
			}
			else if(branch.equalsIgnoreCase("MEE")) {
				System.out.println("Internal Combustion Engine,Mechanical Vibrations");
			}
		}
		else if(year==4) {
			System.out.println("Enter the Branch");
			branch=sc.next();
			if(branch.equalsIgnoreCase("CSE")) {
				System.out.println("Data Communication and Networks,Multimedia");
			}
			else if(branch.equalsIgnoreCase("ECE")) {
				System.out.println("Embedded Systems,Image Processing");
			}
			else if(branch.equalsIgnoreCase("MEE")) {
				System.out.println("Production Technology,Thermal Engineering");
			}
		}
		
	}

}
