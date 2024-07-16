package studentmangement;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample1 {
   public static void main(String[] args) {
	List<Integer> list=new ArrayList<Integer>();
	for(int i=1;i<=10;i++)
		list.add((int)(Math.random()*10));
	System.out.println(list);
	list.sort(new SortInDescendending());
	System.out.println(list);
}
}
class SortInAscendending implements Comparator<Integer>{
	public int compare(Integer i1,Integer i2) {
		return i1-i2;
	}
}
class SortInDescendending implements Comparator<Integer>{
	public int compare(Integer i1,Integer i2) {
		return i2-i1;
	}
}
