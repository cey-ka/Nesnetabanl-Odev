package ders6;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

public class HashmapAndLinkedList {
	int a = 5;

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
		
		LinkedList<String> cars = new LinkedList<String>();
		cars.add("volvo");
		cars.add("BMW");
		cars.add("ford");
		cars.add(1, "Fiat"); //başındaki 1 sayısı fiat marka arabanın indexi olarak atadık 
		//eğer oraya 1 yazmasaydık 0. index volvo 1. index bmw olarak geçecekti
		//linked list ile bir araba listesi oluşturduk
		
		Iterator<String> it = cars.iterator();
		System.out.println(it.next());
		it.next();
		System.out.println(it.next());
		it.next();
		System.out.println(it.hasNext());
		it.next();
		System.out.println(it.hasNext());
		it.next();
		System.out.println(it.hasNext());
		//System.out.println(a.doubletValue);
		System.out.println(cars.get(0).hashCode());
		System.out.println(cars.get(1).hashCode());
		String a = cars.get(1);
		System.out.println(a.hashCode());
		
		String b = "Fiat";
		if(a=="BMW")
		{
			System.out.println("eşitlik sağlandı");
		}
		
		else if(a.equals(cars.get(1)))
		{
			System.out.println("eşitlik sağlandı");
		}
		
		else
		{
			System.out.println("eşitlik sağlanamadı");
		}

	}
	
	//rahilden kodlarını iste

}
