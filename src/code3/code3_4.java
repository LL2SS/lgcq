package code3;
import java.util.Scanner;
public class code3_4 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("���������������߱߳�:");
		double a=input.nextDouble();
		double b=input.nextDouble();
		double c=input.nextDouble();
		if((a+b>c)&&(a+c>b)&&(b+c>a)) {
			System.out.println("�ܳ�Ϊ"+(a+b+c));
		}
		else {
			System.out.println("����ֵ���Ϸ�");
		}

	}

}
