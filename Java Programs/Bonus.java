import java.util.Scanner;

public class Bonus {
	public static void main(String[] args) {
		//Bonus b = new Bonus();
		EmployeeBonus();
	}
		public static void EmployeeBonus() {
			Scanner s = new Scanner(System.in);
			System.out.println("Enter Employee Experiance: ");
			int x = s.nextInt();
			System.out.println("Enter Employee Salary: ");
			int y = s.nextInt();
			if(x > 5) {
				double result = (double) y+y*0.05;
			 System.out.println("eligible for bonus: " +result);
			}else {
				System.out.println("not eligible for bonus.");
			}
		
	}
}
