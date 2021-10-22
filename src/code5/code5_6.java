package code5;

public class code5_6 {

	public static void main(String[] args) {
		double s;
		for(int i=10000;i<=100000;i+=10000) {
			s=0;
			for(int j=1;j<=i;j++) {
				s+=4*Math.pow(-1, j+1)/(2*j-1);				
			}
			System.out.println("µ±i="+i+"Ê±£¬PI="+s);			
		}

	}

}
