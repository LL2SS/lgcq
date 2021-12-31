package code19;

class Student implements Comparable{
	private String num;
	private String name;
	private int age;
	public Student(String num,String name,int age) {
		this.num=num;
		this.name=name;
		this.age=age;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num=num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public int getage() {
		return age;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public int compareTo(Object o) {
	      if (!(o instanceof Student))
	        throw new RuntimeException("不是Student对象");
	      Student p = (Student) o;
	      if (this.age > p.age)
	        return 1;
	      if (this.age == p.age){
	        return this.name.compareTo(p.name);
	      }
	      return -1;
	}
}
