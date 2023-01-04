package polimorfizm;

public class Engineer extends Employee {
	Engineer(String name, String surname){
		super(name,surname);
		setJob("Mühendis");
		setAnnualPermit(30);
		setSalary(12500);
	}
	//<>
	
	Engineer(String name, String surname, int salary){
		super(name,surname);
		setSalary(salary);
		if(salary >15000)
		{
			setJob(" kıdemli yüksek mühendis");
			setAnnualPermit(35);
		}
		
		else if(salary >12500) {
			setJob("yüksek mühendis");
			setAnnualPermit(40);
		}
		
		else {
			setJob("mühendis");
			setAnnualPermit(30);
		}
		
	}
	
	public int makeRaise(double howMuch) {
		double money =(double)(getSalary()*howMuch) + 2500;
		makeRaise((int)money);
		return getSalary();
		
	}
}
