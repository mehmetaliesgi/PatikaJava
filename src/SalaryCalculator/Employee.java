package SalaryCalculator;

public class Employee {
    String name;
    int salary, workHours, hireYear;
    int currentYear = 2021;

    public Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    double tax() {
        if (this.salary < 1000) {
            return 0.0;
        } else {
            return salary * 0.03;
        }
    }

    int bonus() {
        if (workHours > 40) {
            return (workHours - 40) * 30;
        }
        return 0;
    }

    double raiseSalary() {
        if (currentYear - hireYear < 10) {
            return this.salary * 5 / 100;
        } else if (currentYear - hireYear >= 10 && currentYear - hireYear < 20) {
            return this.salary * 10 / 100;
        } else if (currentYear - this.hireYear > 19) {
            return this.salary * 15 / 100;
        }
        return 0.0;
    }

    @Override
    public String toString() {
        return "Name: " + this.name +
                "\nSalary: " + this.salary +
                "\nWork Hours: " + this.workHours +
                "\nHire Year: " + this.hireYear +
                "\nTax: " + tax() +
                "\nBonus: " + bonus() +
                "\nSalary increase: " + raiseSalary() +
                "\nSalary with the tax and bonuses: " + (this.salary + bonus() - tax()) +
                "\nNet Salary: " + (this.salary + bonus() - tax() + raiseSalary());
    }
}
