import java.util.Scanner;

class Employee {
    int eNo;
    String eName;
    double eSalary;

    public Employee(int eNo, String eName, double eSalary) {
        this.eNo = eNo;
        this.eName = eName;
        this.eSalary = eSalary;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();

        Employee[] employees = new Employee[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter employee " + (i + 1) + " details:");
            System.out.print("Employee number: ");
            int eNo = sc.nextInt();
            System.out.print("Employee name: ");
            String eName = sc.next();
            System.out.print("Employee salary: ");
            double eSalary = sc.nextDouble();

            employees[i] = new Employee(eNo, eName, eSalary);
        }

        System.out.print("Enter the employee number to search: ");
        int searchENo = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < n; i++) {
            if (employees[i].eNo == searchENo) {
                System.out.println("Employee " + searchENo + " found:");
                System.out.println("Employee number: " + employees[i].eNo);
                System.out.println("Employee name: " + employees[i].eName);
                System.out.println("Employee salary: " + employees[i].eSalary);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Employee " + searchENo + " not found.");
        }
    }
}

