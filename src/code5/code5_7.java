package code5;

public class code5_7 {

	public static void main(String[] args) {
		double e,item;
		for(int i=10000;i<=100000;i+=10000) {
			e=1;
			item=1;
			for(int j=1;j<=i;j++) {
				item/=j;
				e+=item;
			}
			System.out.println("µ±i="+i+"Ê±£¬e="+e);			
		}

	}

}