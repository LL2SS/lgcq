package code5;
import java.util.Scanner;
public class code5_2 {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.print("Enter the number of lines:");
		int num=input.nextInt(),i,j;
		for(i=1;i<=num;i++) {
			for(j=num;j>0;j--) {
				if(i>=j)
					System.out.printf("%3d",j);
				else
					System.out.print("   ");
			}
			for(j=2;j<=num;j++) {
				if(i>=j)
					System.out.printf("%3d",j);
			}
			System.out.println("");
		}

	}

}
