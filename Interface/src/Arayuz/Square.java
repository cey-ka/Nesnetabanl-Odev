package Arayuz;

public class Square implements Poligon {
	public void getArea()
	{
		int length =6;
		int area = length * length;
		System.out.println("karenin alanı" + area);
	}
	
	public void getSides() {
		System.out.println("kenar sayısı : 4");
	}

}
