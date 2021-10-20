package code3;
import java.util.Scanner;
public class code3_6 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a point with two coordinates:");
		double x=input.nextDouble(),y=input.nextDouble();
		
		if(x*x+y*y<=100) {
			System.out.println("Point ("+x+","+y+") is in the circle");
		}
		else {
			System.out.println("Point ("+x+","+y+") is not in the circle");
		}

	}

}
