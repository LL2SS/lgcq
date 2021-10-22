package code5;

public class code5_3 {

	public static void main(String[] args) {
		int i,j;
		for(i=0;i<=7;i++) {
			for(j=0;j<7-i;j++)
				System.out.print("    ");
			for(j=0;j<=i;j++)
			    System.out.printf("%4d",(int)Math.pow(2, j));
	    	for(j=i-1;j>=0;j--) 
		    	System.out.printf("%4d",(int)Math.pow(2, j));
			System.out.println("");
			}
		}
}