package ders6;

public class enumTipi {
	enum Level{
		LOW,
		MEDIUM, //final değişkenler içeriği değiştirilmezler
		HIGH
	}

	public static void main(String[] args) {
		Level v = Level.LOW;
		System.out.println(v);
		

	}

}
