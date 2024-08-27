
class Employee
{
    private String firstname;
    private String lastname;
    private double monthly_salary;

    public Employee(String firstname,String lastname,double monthly_salary)
    {

        this.firstname=firstname;
         this.lastname=lastname;
        setMonthlySalary(monthly_salary);

    }

    public void setMonthlySalary(double salary)
    {
        if(salary>0)
        {
            this.monthly_salary=salary;

        }
        else
        {
           this. monthly_salary=0;

        }
    }

    public double getYearlySalary()
    {
        return this.monthly_salary  *12;
    }

    public void displayEmployeeDetails() {
        System.out.println("Employee Name: " + this.firstname + " " + this.lastname);
        System.out.println("Monthly Salary: " + this.monthly_salary);
         System.out.println("Yearly Salary: " + getYearlySalary());
        System.out.println();
    }
    
    public void applyRaise(double percentage) {
        if (percentage > 0) {
            this.monthly_salary += this.monthly_salary * (percentage / 100);
        }
}
}

public class Q11_EmployeeTest {
    public static void main(String[] args)
    {

        Employee emp1 = new Employee("Vijay", "kumar", 3000.0);
        Employee emp2 = new Employee("Rahul", "Mohite", 4000.0);

        System.out.println("Initial Employee Details:");
        emp1.displayEmployeeDetails();
        emp2.displayEmployeeDetails();

        emp1.applyRaise(10);
        emp2.applyRaise(10);

        System.out.println("Employee Details After 10% Raise:");
        emp1.displayEmployeeDetails();
        emp2.displayEmployeeDetails();

    }
    
}
