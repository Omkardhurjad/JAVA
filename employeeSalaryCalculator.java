import java.util.Scanner;

public class EmployeeSalaryCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter basic payment : ");
            double basicPayment = scanner.nextDouble();
            
            if (basicPayment == -1) {
                System.out.println("Exiting the program.");
                break;
            }

            System.out.print("Enter your age: ");
            int age = scanner.nextInt();

            if (basicPayment >= 4500 && basicPayment <= 6500 && age >= 18) {
                calculateAndPrintSalary(basicPayment, age);
            } else {
                System.out.println("Invalid input.");
            }
        }

        scanner.close();
    }

    public static void calculateAndPrintSalary(double basicPayment, int age) {
        double ta = 0.02 * basicPayment;
        double da = 0.01 * basicPayment;
        double pra = 0.03 * basicPayment;

        double grossSalary = basicPayment + ta + da + pra;

        double eligiblePA = 0.05 * grossSalary;

        if (grossSalary > 10000) {
            grossSalary -= 1000;
        }

        double netSalary = grossSalary + eligiblePA;

        int retirementAge = 55;
        int currentYear = 2023;
        int retirementYear = currentYear + (retirementAge - age);

        System.out.println("Gross Salary: " + grossSalary);
        System.out.println("Net Salary: " + netSalary);
        System.out.println("Your retirement age date is " + retirementYear);
    
    }
}
