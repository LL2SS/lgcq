package code11__;
import java.util.Scanner;
import java.util.ArrayList;
public class code11_3 {

	public static void main(String[] args) {
		ArrayList<Integer>list1=new ArrayList<>();
		ArrayList<Integer>list2=new ArrayList<>();
		System.out.print("Enter an integer m:");
		Scanner input=new Scanner(System.in);
		int a=input.nextInt();
		int b=2,m=a;
		while(a!=1) {
			if(a%b==0) {
				a=a/b;
				list1.add(b);
			}
			else
				b++;
		}
		int c=list1.get(0);
		int s=1;
		for(int i=1;i<list1.size();i++) {
			if(c==list1.get(i))
				s++;
			if(c!=list1.get(i)||i==list1.size()-1) {
				if(s%2==1)
					list2.add(c);
				c=list1.get(i);
				s=1;
			}

		}
		if(c!=list1.get(list1.size()-2))
			list2.add(c);
		int n=1;
		for(int i=0;i<list2.size();i++)
			n=n*list2.get(i);
		System.out.println("The smallest number n for m*n to be a perfect square is "+n);
		System.out.println("m*n is "+m*n);
	}

}
