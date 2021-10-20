package code3;
import java.util.Scanner;
public class code3_7 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a point with two coordinates:");
		double x=input.nextDouble(),y=input.nextDouble();
		
		if(Math.abs(x)<=10/2&&Math.abs(y)<=5.0/2) {
			System.out.println("Point ("+x+","+y+") is in the rectangle");
		}
		else {
			System.out.println("Point ("+x+","+y+") is not in the rectangle");
		}

	}

}
