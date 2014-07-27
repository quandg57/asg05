// viet class Employee la con cua Person
package oop.asg05;
import java.util.Date;
import  java.text.SimpleDateFormat;
public class Employee extends Person{
    public double salary;
    public Employee(String n, Date d, double s)
    {
        name= n;
        birthday= d;
        salary= s;
    }
    public double getSalary()
    {
        return salary;
    }
    public String toString()
    {
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
        return name + format.format(birthday) + String.valueOf(salary);
    }
}