package Arayuz;

public interface Poligon {
	void getArea();
	default void getSides() {
		System.out.println("poligonun kenar sayısı");
	}
	
	default void getPerimeter(int... sides) {
		int perimeter = 0;
		for(int side: sides) {
			perimeter += side;
		}
		
		System.out.println("çevresi: " + perimeter);
	}


}
