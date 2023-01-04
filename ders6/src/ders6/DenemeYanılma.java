package ders6;

public class DenemeYanılma {

	public static void main(String[] args) {
		try {
			int[] number = {1,2,3,4,5};
			System.out.println(number[10]);
			System.out.println("try devam ediyor");
		}
		catch(Exception e) {
			System.out.println("Index dışına çıkıldı");
		}
		
		System.out.println("islemlere devam ediliyor");

	}

}
