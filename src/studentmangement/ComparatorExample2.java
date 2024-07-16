package studentmangement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorExample2 {
	 public static void main(String[] args) {
			List<Integer> list=new ArrayList<Integer>();
			for(int i=1;i<=10;i++)
				list.add((int)(Math.random()*10));
			System.out.println(list);
//			list.sort((i1,i2)->i1-i2);
			Collections.sort(list,(i1,i2)->i1-i2);
			//list.sort((i1,i2)->i2-i1);
//			Collections.sort(list,(i1,i2)->i2-i1);
			System.out.println(list);
		}
}
