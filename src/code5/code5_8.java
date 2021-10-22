package code5;

public class code5_8 {

	public static void main(String[] args) {
		int i,j=0,s=0;
		for(i=101;i<=2100;i++) {
			if((i%4==0&&i%100!=0)||i%400==0) {
				System.out.print(i+" ");
				j++;
				s++;								
			}
			if(j==10) {
				System.out.println();
				j=0;
			}
			
		}
		if(j!=0) {
			System.out.println();
		}
		System.out.println("这期间闰年数目为："+s);

	}

}
