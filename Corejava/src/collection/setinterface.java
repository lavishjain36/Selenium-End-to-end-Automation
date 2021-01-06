package collection;

import java.util.HashSet;
import java.util.Iterator;

public class setinterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Hashset ,treeset,LinkedHashSet implements set interface
		//doesnot accept duplicate values
		//There is no guarantee elements stored in sequential order.
		
		HashSet<String> hs=new HashSet<String>();
		hs.add("Lavish");
		hs.add("Kushal");
		hs.add("Jain");
		hs.add("Jain");
//System.out.println(hs);
//System.out.println(hs.remove("Jain"));
//System.out.println(hs.isEmpty());
//System.out.println(hs.size());
//System.out.println(hs);

		Iterator<String> i= hs.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}



		

	}

}
