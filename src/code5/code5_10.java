package code5;
import java.util.Scanner;

public class code5_10 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("请输入年份和该年第一天是星期几的数字：");
		int year=input.nextInt(),day=input.nextInt(),i,j,t,k,sum,m=31;
		String M="";		
		for(i=1;i<=12;i++) {
			switch(i) {
			case 1:M="January";m=31;break;
			case 2:M="February";m=28;if((year%4==0&&year%100!=0)||year%400==0) m++;break;
			case 3:M="March";m=31;break;
			case 4:M="April";m=30;break;
			case 5:M="May";m=31;break;
			case 6:M="June";m=30;break;
			case 7:M="July";m=31;break;
			case 8:M="August";m=31;break;
			case 9:M="September";m=30;break;
			case 10:M="October";m=31;break;
			case 11:M="November";m=30;break;
			case 12:M="December";m=31;break;			
			}
			System.out.println("            "+M+" "+year);
			System.out.printf("%5s%5s%5s%5s%5s%5s%5s\n","Sun","Mon","Tue","Wed","Thu","Ffi","Sat");
			day%=7;
			sum=0;
			t=0;
			for(j=1;j<=m;j++) {
				if(j==1)
				    for(k=0;k<day;k++) {
					    System.out.printf("%5s", "");
				    }
				System.out.printf("%5d", j);
				sum++;
				if((sum==7&&t==1)||(sum==7-day&&t==0)) {
					System.out.println();
					sum=0;
					t=1;
				}
				
				
			}
			if(sum!=0) {
				System.out.println();
			}
			day+=m%7;
		
		}
	}

}
