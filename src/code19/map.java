package code19;
import java.util.*;
public class map {

	public static void main(String[] args) {
		Map<String,Book>books=new TreeMap<String,Book>();
		books.put("00001", new Book("00001","��������",19.9,"�����ձ�������"));
		books.put("00002", new Book("00002","��������",29.9,"�����ձ�������"));
		books.put("00003", new Book("00003","������ʷ",39.9,"����ʱ��������"));
		Iterator iter = books.entrySet().iterator();
		while(iter.hasNext()) {
		   Map.Entry entry = (Map.Entry)iter.next();
		   System.out.println(entry.getKey() +" - "+((Book)entry.getValue()).getName()+"\t\t"+((Book)entry.getValue()).getPrice()+"\t"+((Book)entry.getValue()).getPress());
		}

	}

}
