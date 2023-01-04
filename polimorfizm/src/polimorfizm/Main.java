package polimorfizm;

public class Main {

	public static void main(String[] args) {
		Employee Ahmet = new Employee("Ahmet", "mehmet");
		Employee Hasan = new Employee("Hasan", "Kahraman", 6500);
		Employee Leyla = new Engineer("Leyla", "Mecnun");
		Employee Ali = new Engineer("Ali", "veli", 15000);
		Engineer Yasar = new Engineer("Yasar", "Yasamaz");
		Ahmet.info();
		Hasan.info();
		Leyla.info();
		Ali.info();
		Yasar.info();

	}

}
