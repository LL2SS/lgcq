package code3;
import java.util.Scanner;
public class code3_9 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a point's x- and y-coordinates:");
		double x=input.nextDouble(),y=input.nextDouble();
		
		if(x>=0&&y>=0&&y<=100-0.5*x) {
			System.out.println("The point is in the triangle");
		}
		else {
			System.out.println("The point is not in the triangle");
		}

	}

}