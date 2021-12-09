package code11__;
import java.util.Scanner;
import java.util.ArrayList;
public class code11_2 {

	public static void main(String[] args) {
		ArrayList<Integer>list=new ArrayList<>();
		int number1=(int)(Math.random()*10);
		int number2=(int)(Math.random()*10);
		Scanner input=new Scanner(System.in);
		System.out.print("What is "+number1+" + "+number2+"?");
		int answer=input.nextInt();		
		while(number1+number2!=answer) {
			if(list.contains(answer))
			    System.out.println("You already entered "+answer);
			System.out.print("Wrong answer.Try again.What is "+number1+" + "+number2+"?");
			list.add(answer);
			answer=input.nextInt();
		}
		System.out.println("You got it!");
	}
}
