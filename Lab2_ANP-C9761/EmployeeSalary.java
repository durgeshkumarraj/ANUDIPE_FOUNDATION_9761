import java.util.Scanner;

public class EmployeeSalary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter employee salary: ");
        double salary = scanner.nextDouble();

        double da = salary * 0.12;
        double hra = salary * 0.13;
        double pf = salary * 0.15;
        double grossSalary = salary + da + hra - pf;

        System.out.println("DA: " + da);
        System.out.println("HRA: " + hra);
        System.out.println("PF: " + pf);
        System.out.println("Gross Salary: " + grossSalary);
        scanner.close();
    }
}
