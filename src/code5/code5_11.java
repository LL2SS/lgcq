package code5;
import java.util.Scanner;
public class code5_11 {

	public static void main(String[] args) {
		int lotteryDigit1=(int)(Math.random()*10),lotteryDigit2=(int)(Math.random()*10);
		while(lotteryDigit1==lotteryDigit2)
		{
			lotteryDigit2=(int)(Math.random()*10);
		}
		int lottery=lotteryDigit1*10+lotteryDigit2;
		Scanner input=new Scanner(System.in);
		System.out.print("Enter your lottery pick (tow different digits):");
		int guess=input.nextInt();
		int guessDigit1=guess/10;
		int guessDigit2=guess%10;
		if(guess==lottery) {
			System.out.println("Exact match:you win $10,000");
			
		}
		else if((guessDigit1==lotteryDigit2&&guessDigit2==lotteryDigit1)) {
			System.out.println("Exact match:you win $3,000");
		}
		else if((guessDigit1==lotteryDigit1)||(guessDigit1==lotteryDigit2)
				||(guessDigit2==lotteryDigit1)||(guessDigit2==lotteryDigit2)) {
			System.out.println("Exact match:you win $1,000");
		}
		else {
			System.out.println("Sorry,no match");
		}

	}

}
