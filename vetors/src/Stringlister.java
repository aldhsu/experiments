

import java.util.*;

public class Stringlister {
	String[] names = { "Spanky","Alfafa", "Buckwheat", "Daria",
			"Stymie","Marianne", "Scotty","Tommy","Chubby" };
	
	public Stringlister(String[] moreNames) {
		Vector<String> list = new Vector<String>();
		for (int i =0; i <names.length; i++) {
			list.add(names[i]);
		}
		for (int i =0; i < moreNames.length; i++) {
			list.add(moreNames[i]);
		}
		Collections.sort(list);
		for( String name: list) {
			System.out.println(name);
		}
	}
	public static void main(String[] args) {
		Stringlister lister = new Stringlister(args);
	}
}
