package code5;

public class code5_1 {

	public static void main(String[] args) {
		double monny=10000,sum=0;
		int i;
		for(i=0;i<10;i++) {
			monny*=1.05;
		}
		System.out.println("Monny after ten years:$"+monny);
		for(i=10;i<14;i++) {
			sum+=monny;
			monny*=1.05;
		}
		System.out.println("Monny in four years after ten years:$"+sum);

	}

}
