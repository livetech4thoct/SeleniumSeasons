package dec13th;

import java.util.HashSet;
import java.util.Set;

public class ForEachLoopDemo {

	public static void main(String[] args) {
		
	Set<String> hs=new HashSet<String>();
		
		//List<String> hs=new ArrayList<String>();
		
		System.out.println(hs.size());
		
		hs.add("Live Tech");
		
		hs.add("Selenium");
		
		hs.add("Appium");
		
		hs.add("TOSCA");
		
		System.out.println(hs.size());
		
		System.out.println(hs);
		
		for(String temp:hs)
		{
			System.out.println(temp);
		}
	}

}
