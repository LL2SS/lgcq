package code9;
import java.util.Scanner;
public class code9_6 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("«Î ‰»Îa,b,c,d,e,fµƒ÷µ£∫");
		double v1=input.nextDouble();
		double v2=input.nextDouble();
		double v3=input.nextDouble();
		double v4=input.nextDouble();
		double v5=input.nextDouble();
		double v6=input.nextDouble();
		LinearEquation expr=new LinearEquation(v1,v2,v3,v4,v5,v6);
		if (expr.isSolvable())
			System.out.println("X:"+expr.getX()+"   Y:"+expr.getY());
		else
			System.out.println("The equation has no solution.");

	}

}
class LinearEquation{
	private double a,b,c,d,e,f;
	public LinearEquation(double v1,double v2,double v3,double v4,double v5,double v6) {
		a=v1;
		b=v2;
		c=v3;
		d=v4;
		e=v5;
		f=v6;
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
	public double getD() {
		return d;
	}
	public double getE() {
		return e;
	}
	public double getF() {
		return f;
	}
	public boolean isSolvable() {
		if((a*d-b*c)!=0)
			return true;
		else
			return false;
	}
	public double getX() {
		return (e*d-b*f)/(a*d-b*c);
	}
	public double getY() {
		return (a*f-e*c)/(a*d-b*c);
	}
}