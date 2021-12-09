package code11__;
import java.util.Scanner;
import java.util.ArrayList;
public class code11_4 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the number of objects:");
		int s=input.nextInt();
		System.out.print("Enter the weights of the objects:");
		ArrayList<Double>list=new ArrayList<>();
		ArrayList<Double>temp=new ArrayList<>();
		for(int i=0;i<s;i++)
			list.add(input.nextDouble());
		java.util.Collections.sort(list);
		int i,j,q,k=1;
		double a;
		for(i=s-1;i>=0;i--)
			if(list.get(i)!=0) {
				a=list.get(i);
				list.set(i, 0.0);
				temp.add(a);
			    for(j=i-1;j>=0;j--) {
				    if(a+list.get(j)>10)
					    continue;
				    else if(list.get(j)!=0) {
					    a=a+list.get(j);
					    temp.add(list.get(j));
					    list.set(j, 0.0);					
				    }
			    }
			    System.out.print("Container "+k+" contains objects with weight ");
			    k++;
			    for(q=0;q<temp.size();q++)
			    	System.out.print(temp.get(q)+" ");
			    System.out.println();
			    temp.clear();
			}


	}

}
