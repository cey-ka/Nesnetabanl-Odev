package ders6;

public class Test {

	public static void main(String[] args) {
		int result = sum(10);
		System.out.println(result);
		
		//<>|
		
	}
	public static int sum(int v) {
		if(v>0)
			return v + sum(v-1);
		else
			return 0;
		
	}
	
	
	//10 faktöriyel değerini hesaplama
	


	
}
