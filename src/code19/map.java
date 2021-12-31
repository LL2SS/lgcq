package code19;
import java.util.*;
public class map {

	public static void main(String[] args) {
		Map<String,Book>books=new TreeMap<String,Book>();
		books.put("00001", new Book("00001","动物世界",19.9,"人民日报出版社"));
		books.put("00002", new Book("00002","人类文明",29.9,"光明日报出版社"));
		books.put("00003", new Book("00003","汉代简史",39.9,"环球时报出版社"));
		Iterator iter = books.entrySet().iterator();
		while(iter.hasNext()) {
		   Map.Entry entry = (Map.Entry)iter.next();
		   System.out.println(entry.getKey() +" - "+((Book)entry.getValue()).getName()+"\t\t"+((Book)entry.getValue()).getPrice()+"\t"+((Book)entry.getValue()).getPress());
		}

	}

}
