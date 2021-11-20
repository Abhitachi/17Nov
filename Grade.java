package tap.Geek;
import java.util.Scanner;
public class Grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Scores:");
		int score=sc.nextInt();
		Grade(score);	
	}
	
	static void Grade(int s) {
		if(s<50) {
			System.out.println("fail");
		}
		else if(s>=50 && s<=59) {
			System.out.println("D Grade");
		}
		else if(s>=60 && s<=69) {
			System.out.println("c Grade");
		}
		else if(s>=70 && s<=79) {
			System.out.println("B Grade");
		}
		else if(s>=80 && s<=89) {
			System.out.println("A Grade");
		}
		else if(s>=90 && s<=100) {
			System.out.println("A+ Grade");
		}
		else {
			System.out.println("Invalid");
		}
	}

}
