package code2;
import java.util.Scanner;
public class code2_10 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter an amount in double,for examle 11.56:");
		double amount =input.nextDouble();
		int remainingAmount=(int)(amount*100);
		int numberOfOneDollars=remainingAmount/100;
		remainingAmount=remainingAmount%100;
		int numberOfQuaters=remainingAmount/25;
		remainingAmount=remainingAmount%25;
		int numberOfDimes=remainingAmount/10;
		remainingAmount=remainingAmount%10;
		int numberOfNickels=remainingAmount/5;
		remainingAmount=remainingAmount%5;
		int numberOfPennies=remainingAmount;
		System.out.println("Your amount "+amount+" consists of");
		System.out.println(" "+numberOfOneDollars+" dollars");
		System.out.println(" "+numberOfQuaters+" quarters");
		System.out.println(" "+numberOfDimes+" dimes");
		System.out.println(" "+numberOfNickels+" nickels");
		System.out.println(" "+numberOfPennies+" pennies");
		

	}

}
