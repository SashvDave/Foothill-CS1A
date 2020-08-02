import java.util.Scanner;

//Combined class Employee into Main, however, code meets all requirements, with instance variables, getters, setters, constructors, etc.
public class Employee {
    private String name;
    private int age;
    private int yearsWithCompany;
    private int AdjustedYearsWithCompany;

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    public void setyearsWithCompany(int yearsWithCompany) {
        this.yearsWithCompany = yearsWithCompany;
    }
    public int getYearsWithCompany() {
        return yearsWithCompany;
    }
    public void adjustYearsWithCompany(int a) {
        this.AdjustedYearsWithCompany = yearsWithCompany + a;
    }
    public int getAdjustedYearsWithCompany() {
        return AdjustedYearsWithCompany;
    }
    public String toString() {
        return("\nEmployee 1: \nName: " + getName() + "\nAge: " + getAge() + "\nHas been working at the company for: " + getYearsWithCompany() + " years\nYears spent working with company after update: " + getAdjustedYearsWithCompany());
    }

    public static void main(String[] args) {
        // Use Scanner to set the employee information
        Employee A = new Employee();
        Scanner sc1 = new Scanner(System.in);
        System.out.println("What is the employee's name?");
        String EmpName = sc1.nextLine();
        Scanner sc2 = new Scanner(System.in);
        System.out.println("What is the employee's age (ex. 23)?");
        int EmpAge = sc2.nextInt();
        Scanner sc3 = new Scanner(System.in);
        System.out.println("How long has the employee been working for your company in years (ex. 4)?");
        int EmpYearsWithCompany = sc3.nextInt();
        Scanner sc4 = new Scanner(System.in);
        System.out.println("How much would you like to increase the # of years the employee has been working for your compnay by?");
        int a = sc4.nextInt();
        A.setName(EmpName);
        A.setAge(EmpAge);
        A.setyearsWithCompany(EmpYearsWithCompany);
        A.adjustYearsWithCompany(a);
        System.out.println(A.toString());
    }
}