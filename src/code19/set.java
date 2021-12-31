package code19;
import java.util.*;
import java.io.*;
public class set {
	public static void main(String[] args) throws IOException {
		Set<Student> students = new TreeSet<Student>();
		Scanner input=new Scanner(System.in);
		String inputString=input.next();
		while(!inputString.equals("exit")) {
			Student student=new Student(inputString,input.next(),input.nextInt());
			students.add(student);
			inputString=input.next();
		}
	PrintWriter output=new PrintWriter("output.txt");
	Iterator<Student> it = students.iterator();
	  while(it.hasNext()) {
	    Student student = (Student)it.next();
	    output.println(student.getNum()+"\t"+student.getName()+"\t"+student.getage());
	  }
	output.close();
	}
}