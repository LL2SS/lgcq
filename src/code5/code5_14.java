package code5;
import java.util.Scanner;
public class code5_14 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("请输入一个十进制整数：");
		int num=input.nextInt(),i;
		long sum=0,k=1;
		for(i=num;i>0;i/=2) {
			sum=sum+(i%2)*k;
			k*=10;
		}
		System.out.println("该数对应的二进制为："+sum);
	}

}
