package code3;

public class code3_8 {

	public static void main(String[] args) {
		int a=(int)(1.0+Math.random()*13),b=(int)(Math.random()*4);
		System.out.print("The card you picked is ");
		if(a==1)
			System.out.print("Ace");
		else if(a==11)
			System.out.print("Jack");
		else if(a==12)
			System.out.print("Queen");
		else if(a==13)
			System.out.print("King");
		else
			System.out.print(a);
		System.out.print(" of ");
		if(b==0)
			System.out.println("Clubs");
		else if(b==1)
		    System.out.println("Diamonds");
		else if(b==2)
			System.out.println("Hearts");
		else if(b==3)
			System.out.println("Spades");

	}

}
