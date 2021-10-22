package code5;
import java.util.Scanner;
public class code5_13 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the first 9 digits of an ISBN as integer:");
		int digits=input.nextInt(),i,tem=digits,sum=0;
		for(i=9;i>0;i--) {
			sum+=(tem%10)*i;
			tem/=10;
		}
		sum%=11;
		if(sum!=10)
			System.out.printf("%010d\n", digits*10+sum);
		else
			System.out.printf("%09d%s\n", digits,"X");
		

	}

}
