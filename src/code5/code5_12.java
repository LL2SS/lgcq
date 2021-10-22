package code5;

public class code5_12 {

	public static void main(String[] args) {
		int i,j,sum;
		for(i=2;i<=10000;i++) {
			sum=0;
			for(j=1;j<i;j++) {
				if(i%j==0) 
					sum+=j;
			}
			if(i==sum)
				System.out.println(i);
			
		}

	}

}
