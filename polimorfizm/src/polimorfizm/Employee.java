package polimorfizm;

public class Employee {
	//<>
	protected String ayrac = "-----------------------";
	protected String name, surname,job;
	protected int salary, annualPermit;
	public Employee(String name, String surname) {
		super();
		this.name = name;
		this.surname = surname;
		this.job = "Çalışan";
		this.salary = 5500;
		this.annualPermit = 10;
		
	}
	public Employee(String name, String surname, int saalry) {
		super();
		this.name = name;
		this.surname = surname;
		this.salary = saalry;
		this.annualPermit = 10;
		if(salary > 6000)
		{
			this.job = "kıdemli çalışan";
			annualPermit+=3;
			
		}
		
		else if(salary > 0 && salary <= 6000)
		{
			this.job = "çalışan";
		}
		
		else {
			this.job = "stajyer";
			annualPermit = 0;
		}
		
	}
	
	protected Employee()
	{
	
	}
	
	public int makeRaise(int howMuch)
	{
		salary += howMuch;
		return salary;
	}
	
	public int makeRaise(double howMuch)
	{
		double money = (double)salary*howMuch;
		makeRaise((int)money);
		return salary;
	}
	
	public void setJob(String job) {
		this.job = job;
		
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public void setAnnualPermit(int permit) {
		this.annualPermit = permit;
	}
	
	public String getJob() {
		return job;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public int getAnnualPermit() {
		return annualPermit;
	}
	public void info() {
		System.out.println(getJob() + "bilgileri \n" + ayrac+ "Çalışan ismi: " + name +
	    "\n Çalışan Soyismi: " + surname + "\n Görevi" + getJob() + "\n Maaşı: " + getSalary()
	    + "\n izin günü: " + getAnnualPermit() + "iş  günü \n" + ayrac);
	}
	
	public void raiseinfo() {
		System.out.println(getJob()+ "Zam uygulaması \n" +ayrac +"\n Yeni verilecek maaş: " + getSalary() + "\n" + ayrac);
	}
}
