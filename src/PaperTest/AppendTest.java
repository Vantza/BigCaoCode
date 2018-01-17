package PaperTest;

import java.util.ArrayList;
import java.util.List;

public class AppendTest {
	public static void append(List list) {list.add("0042");}
	
	public static void main(String[] args) {
		List<Integer> intList = new ArrayList<Integer>();
		append(intList);
		System.out.println(intList.get(0));
	}
}
