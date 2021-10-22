package code5;
import java.util.Scanner;
public class code5_5 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Loan Amount:");
		double A=input.nextDouble();
		System.out.print("Number of Years:");
		double Y=input.nextDouble();
		System.out.print("Annual Interest Rate:");
		double AR=input.nextDouble();
		double M=AR/1200;
		double MP=A*M/(1-1/Math.pow(1+M,12*Y));
		double T=MP*12*Y;
		System.out.printf("Monthly Payment:%.2f\n", MP);
		System.out.printf("Total Payment:%.2f\n\n", T);
		System.out.printf("%-15s%-15s%-15s%-15s\n", "Payment#","Interest","Principal","Balance");
		double interest,P;
		for(int i=1;i<=12*Y;i++) {
			interest=A*M;
			P=MP-interest;
			A-=P;
			System.out.printf("%-15d%-15.2f%-15.2f%-15.2f\n",i,interest,P,A);
		}

	}

}