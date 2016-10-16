/**
 * Created by Lizzi on 16.10.2016.
 */


public class Employee {



    int id, salary;
    String firstName, lastName;
    Employee ( int i, String l, String f, int s)
    {id=i;
        salary=s;
        firstName=f; lastName=l;}

    public int getID()
    {return id;}
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public String getName() {
        return firstName+" "+lastName;
    }

    public int getSalary() {
        return salary;
    }
    public void raiseSalary(int percent) {
        salary=salary + percent/100*salary;
    }
    void setSalary(int s)
    {salary=s;}
    public int getAnnualSalary() {
        return salary*12;
    }
    public String toString()
    {return "Employee [id="+id+", name="+firstName+" "+lastName+", salary= "+salary+"]";

    }}