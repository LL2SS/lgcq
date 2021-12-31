package code19;

class Book {
	private String num;
	private String name;
	private double price;
	private String press;
	public Book(String num,String name,double price,String press) {
		this.num=num;
		this.name=name;
		this.price=price;
		this.press=press;
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
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price=price;
	}
	public String getPress() {
		return press;
	}
	public void setPress(String press) {
		this.press=press;
	}

}
