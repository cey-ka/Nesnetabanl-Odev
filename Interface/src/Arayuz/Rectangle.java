package Arayuz;

public class Rectangle implements Poligon{
	public void getArea()
	{
		int length =6;
		int length2 = 5;
		int area = length * length2;
		System.out.println("dikdörtgenin alanı" + area);
	}
	
	public void getSides() {
		System.out.println("kenar sayısı : 4");
	}
}
