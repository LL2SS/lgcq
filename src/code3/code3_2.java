package code3;
import java.util.Scanner;
public class code3_2 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the first 9 digits of an ISBN as integer:");
		int digits=input.nextInt();
		String str=String.format("%09d", digits);
		int d9=digits%10;
		digits/=10;
		int d8=digits%10;
		digits/=10;
		int d7=digits%10;
		digits/=10;
		int d6=digits%10;
		digits/=10;
		int d5=digits%10;
		digits/=10;
		int d4=digits%10;
		digits/=10;
		int d3=digits%10;
		digits/=10;
		int d2=digits%10;
		digits/=10;
		int d1=digits;
		int d10=(d1*1+d2*2+d3*3+d4*4+d5*5+d6*6+d7*7+d8*8+d9*9)%11;
		if(d10==10) {
			System.out.println(str+"X");
		}
		else {
			System.out.println(str+d10);
		}

	}

}
