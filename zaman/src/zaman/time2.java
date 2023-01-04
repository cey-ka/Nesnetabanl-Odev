package zaman;

public class time2 {
	private int hour;
	private int second;
	private int minute;
	
	
	public time2() {
		
	}
	
	public time2(int saat) {
		this.hour = saat;
	}
	
	public time2(int saat, int dakika) {
		this.minute = dakika;
		this.hour = saat;
	}
	
	public time2(int saat, int dakika, int saniye) {
		this.minute = dakika;
		this.hour = saat;
		this.second = saniye;
		
	}
	public void setSaat(int saat)
	{
		if(hour < 0 || hour > 23 )
		{
			System.out.println("hatalı zaman değerleri girdiniz");
			this.hour = hour;
		}
	}
	public void setSaatDakika(int saat, int dakika) {
		if(hour < 0 || hour > 23 || minute < 0 || minute > 59)
		{
			System.out.println("hatalı zaman değerleri girdiniz");
			this.hour = hour;
			this.minute = minute;
		}
	}
	public void setSaatDakikaSaniye(int saat, int dakika, int saniye)
	{
		if(hour < 0 || hour > 23 || minute < 0 || minute > 59 || second < 0 || second > 59)
		{
			System.out.println("hatalı zaman değerleri girdiniz");
		}
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	public String saat()
	{
		return String.format("%02d:%02d:%02d", hour, minute, second);
	}
}


