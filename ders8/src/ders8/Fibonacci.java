package ders8;

public class Fibonacci {
	
	static int n0=0, n1 = 1, n3=0;
	static void yazfibo(int count)
	{
		if(count>0)
		{
			n3 = n0 +n1;
			n0 = n1;
			n1 = n3;
			System.out.print(" "+ n3);
			yazfibo(count -1);
		}
	}

	public static void main(String[] args) {
		int count = 15;
		System.out.print(n0 + " " + n1);
		yazfibo(count-2);
	}

}
