package code9;

public class TotalArea {

	public static void main(String[] args) {
		New_Circle[] circleArray;
		circleArray=createCircleArray();
		printCircleArray(circleArray);
		

	}
	public static New_Circle[] createCircleArray() {
		New_Circle[] circleArray=new New_Circle[5];
		for(int i=0;i<circleArray.length;i++) {
			circleArray[i]=new New_Circle(Math.random()*100);
		}
		return circleArray;
	}
	public static void printCircleArray(New_Circle[] circleArray) {
		System.out.printf("%-30s%-15s\n","Radius","Area");
		for(int i=0;i<circleArray.length;i++) {
			System.out.printf("%-30f%-15f\n",circleArray[i].getRadius(),
					circleArray[i].getArea());
		}
		System.out.println("___________________________________________");
		
		System.out.printf("%-30s%-15f\n","The total area of circles is",sum(circleArray));
		
	}
	public static double sum(New_Circle[] circleArray) {
		double sum=0;
		for(int i=0;i<circleArray.length;i++) 
			sum+=circleArray[i].getArea();
			
		return sum;
		
	}

}
