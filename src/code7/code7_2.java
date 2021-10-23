package code7;
import java.util.Scanner;
public class code7_2 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter 10 numbers:");
		int[] arr=new int[11];
		int i,j,n,k,t=1,s=0;
		for(i=1;i<11;i++) {
			n=input.nextInt();
			k=0;			
			for(j=1;j<i;j++) {
				if(n==arr[j]) {
					k=1;
					t--;
				}
				
			}
			if(k==0) {
				arr[t]=n;
				s++;
			}
			t++;
		}
		System.out.println("The number of distinct numbers is "+s);
		System.out.print("The distinct numbers are:");
		for(i=1;i<=s;i++)
		{
			System.out.print(arr[i]+" ");
		}
		

	}

}
