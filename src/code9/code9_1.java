package code9;
import java.util.Date;
public class code9_1 {

	public static void main(String[] args) {
		for(long i=10000,j=0;j<8;j++) {
			Date date=new Date(i);
			toString(i,date);
			i*=10;
		}

	}
	public static void toString(long i,Date date) {
		System.out.println(i+" : "+date.toString());
	}

}
