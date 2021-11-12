package code9;

public class Circle2 {
	
	

	public static void main(String[] args) {
		Circle2 circle1=new Circle2();
		System.out.println("The area of the circle of radius "+circle1.radius+" is "+circle1.getArea());
		Circle2 circle2=new Circle2(25);
		System.out.println("The area of the circle of radius "+circle2.radius+" is "+circle2.getArea());
		Circle2 circle3=new Circle2(125);
		System.out.println("The area of the circle of radius "+circle3.radius+" is "+circle3.getArea());
		circle2.radius=100;
		System.out.println("The area of the circle of radius "+circle2.radius+" is "+circle2.getArea());


	}
	double radius;
	Circle2(){
		radius=1;
	}
	Circle2(double newRadius){
		radius=newRadius;
	}
	double getArea() {
		return radius*radius*Math.PI;
	}
	double getPerimeter() {
		return 2*radius*Math.PI;
	}
	void setRadius(double newRadius) {
		radius=newRadius;
	}

}
