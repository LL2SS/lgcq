package code19;
import java.util.*;
public class arrayList {

	public static void main(String[] args) {
		List<Book> books=new ArrayList<Book>();
		Book book1=new Book("00001","��������",19.9,"�����ձ�������");
		Book book2=new Book("00002","��������",29.9,"�����ձ�������");
		Book book3=new Book("00003","������ʷ",39.9,"����ʱ��������");
		books.add(book1);
		books.add(book2);
		books.add(book3);
		for (int i=0;i<books.size();i++) {
		     System.out.println(books.get(i).getNum()+"\t"+books.get(i).getName()+"\t\t"+books.get(i).getPrice()+"\t"+books.get(i).getPress());
	       }
	}

}
