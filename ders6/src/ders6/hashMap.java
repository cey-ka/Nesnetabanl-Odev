package ders6;

import java.util.HashMap;

public class hashMap {

	public static void main(String[] args) {
		HashMap<String, Integer> people = new HashMap<String, Integer> ();
		people.put("Çağla", 20);
		people.put("gamze", 19);
		people.put("umut", 14);
		people.put("sevim", 43);
		people.put("hasan", 45);
		
		for(String i : people.keySet())
		{
			System.out.println("key : " + i + " value : " + people.get(i));
		}
		
		
		
	}
}
