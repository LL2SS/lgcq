package code5;
import java.util.Scanner;
public class code5_4 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Loan Amount:");
		double A=input.nextDouble();
		System.out.print("Number of Years:");
		double Y=input.nextDouble();
		double M,MP,T;
		String c="%";
		System.out.printf("%-20s%-20s%-20s\n", "Interest Rate","Monthly Payment","Total Payment");
		for(int i=5000;i<=8000;i+=125) {
			M=i/1200000.0;
			MP=A*M/(1-1/Math.pow(1+M,12*Y));
			T=MP*12*Y;
			System.out.printf("%.3f%-15s%-20.2f%-20.2f\n",i/1000.0,c,MP,T);
		}

	}

}
