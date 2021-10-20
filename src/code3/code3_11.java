package code3;
import java.util.Scanner;
public class code3_11 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter circle1's center x-,y-coordinates,and radius:");
		double x1=input.nextDouble(),y1=input.nextDouble(),r1=input.nextDouble();
		System.out.print("Enter circle2's center x-,y-coordinates,and radius:");
		double x2=input.nextDouble(),y2=input.nextDouble(),r2=input.nextDouble();
		if(Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2))+r2<=r1) {
			System.out.println("circle2 is inside circle1");
		}
		else if(Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2))-r2>=r1) {
			System.out.println("circle2 dose not overlap circle1");
		}
		else {
				System.out.println("circle2 overlap circle1");
		}

	}

}
