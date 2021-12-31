package code19;
import java.util.*;
public class arrayList {

	public static void main(String[] args) {
		List<Book> books=new ArrayList<Book>();
		Book book1=new Book("00001","动物世界",19.9,"人民日报出版社");
		Book book2=new Book("00002","人类文明",29.9,"光明日报出版社");
		Book book3=new Book("00003","汉代简史",39.9,"环球时报出版社");
		books.add(book1);
		books.add(book2);
		books.add(book3);
		for (int i=0;i<books.size();i++) {
		     System.out.println(books.get(i).getNum()+"\t"+books.get(i).getName()+"\t\t"+books.get(i).getPrice()+"\t"+books.get(i).getPress());
	       }
	}

}
