package code9;

public class TestPassObjects {

	public static void main(String[] args) {
		New_Circle myCircle=new New_Circle(1);
		int n=5;
		printAreas(myCircle,n);
		System.out.println("\n"+"Radius is "+myCircle.getRadius());
		System.out.println("n is "+n);

	}
	
	public static void printAreas(New_Circle c,int times) {
		System.out.println("Radius \t\tArea");
		while(times>=1) {
			System.out.println(c.getRadius()+"\t\t"+c.getArea());
			c.setRadius(c.getRadius()+1);
			times--;
		}
	}

}
