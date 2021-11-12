package code9;

public class TsetNew_Circle {

	public static void main(String[] args) {
		New_Circle mycircle=new New_Circle(5.0);
		System.out.println("The area of the circle of radius "+mycircle.getRadius()+" is "+mycircle.getArea());
		mycircle.setRadius(mycircle.getRadius()*1.1);
		System.out.println("The area of the circle of radius "+mycircle.getRadius()+" is "+mycircle.getArea());
		System.out.println("The number of objects created is "+New_Circle.getNumberOfObjects());

	}

}
