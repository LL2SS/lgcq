package code7;
import java.util.Scanner;
public class code7_1 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the integers between 1 and 100:");
		int[] arr=new int[101];
		int n=-1,i;
		do {
			n=input.nextInt();
			arr[n]++;
		}while(n!=0);
		for(i=1;i<101;i++) {
			if(arr[i]==1) {
				System.out.println(i+" occurs 1 time");
			}
			else if(arr[i]>1) {
				System.out.println(i+" occurs "+arr[i]+" times");
			}
		}


	}

}
