package zaman;

public class timeTest {

	public static void main(String[] args) {
		/*
		time1 saat = new time1();
		saat.setTime(12, 45, 50);
		System.out.println(saat.saat());
		saat.setTime(30, 60, 100);
		System.out.println("set sayisi: " + time1.getCount());
		//System.out.println(time1.hour);
*/
		time2 saat2 = new time2(9,30);
		saat2.setSaatDakika(9, 30);
		System.out.println(saat2.saat());
		
		time2 saat3 = new time2(3,45,55);
		System.out.println(saat3.saat());
		
	}

}
