package code7;
import java.util.Scanner;
public class code7_3 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		double[] arr=new double[10];
		double temp;
		int i,j;
		for(i=0;i<10;i++)
			arr[i]=input.nextDouble();
		for(i=0;i<9;i++)
			for(j=0;j<9;j++)
			    if(arr[j]>arr[j+1]) {
				    temp=arr[j];
				    arr[j]=arr[j+1];
				    arr[j+1]=temp;
			    }
		for(i=0;i<10;i++)
			System.out.print(arr[i]+" ");

	}

}
