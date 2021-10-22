package code5;
import java.util.Scanner;
public class code5_9 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("请输入年份和该年第一天是星期几的数字：");
		int year=input.nextInt(),day=input.nextInt(),i,m=31;
		String M="",D="";		
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
			switch(day) {
			case 1:D="Monday";break;
			case 2:D="Tuesday";break;
			case 3:D="Wednesday";break;
			case 4:D="Thursday";break;
			case 5:D="Friday";break;
			case 6:D="Saturday";break;
			case 7:D="Sunday";break;		
			}
			System.out.println(M+" 1,"+year+" is "+D);
			day+=m%7;
			if(day>7)
				day-=7;			
		}
	}
}
