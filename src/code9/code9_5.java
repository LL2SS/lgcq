package code9;
import java.util.Scanner;
public class code9_5 {

	public static void main(String[] args) {
		System.out.print("ÇëÊäÈëa,b,cµÄÖµ£º");
		Scanner input=new Scanner(System.in);
		double x=input.nextDouble();
		double y=input.nextDouble();
		double z=input.nextDouble();
		QuadraticEquation expr=new QuadraticEquation(x,y,z);
		if(expr.getDiscriminant()>0) {
			System.out.println("R1:"+expr.getRoot1()+"   R2:"+expr.getRoot2());
			
		}
		else if(expr.getDiscriminant()==0) {
			System.out.println("R:"+expr.getRoot1());			
		}
		else
			System.out.println("The equation has no roots.");

	}

}
class QuadraticEquation{
	private double a,b,c;
	public QuadraticEquation(double x,double y,double z){
		a=x;
		b=y;
		c=z;
	}
	public double getA() {
		return a;
	}
	public double getB() {
		return b;
	}
	public double getC() {
		return c;
	}
	public double getDiscriminant() {
		return b*b-4*a*c;
	}
	public double getRoot1() {
		double judge=this.getDiscriminant();
		if(judge>=0) {
			return (-b+Math.sqrt(judge))/(2*a);
		}
		else
			return 0;
	}
	public double getRoot2() {
		double judge=this.getDiscriminant();
		if(judge>=0) {
			return (-b-Math.sqrt(judge))/(2*a);
		}
		else
			return 0;
	}
	
}
