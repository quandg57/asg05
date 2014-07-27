// viet class Manager extends Employee
package oop.asg05;
import java.util.Date;
import  java.text.SimpleDateFormat;
public  class Manager extends Employee {
    Employee assistant;
    public Manager(String n, Date d, double s)
    {
        super(n,d,s);
    }
    public boolean setAssistant(Employee e)
    {
        return true;
    }
    public String toString()
    {
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
        return name + format.format(birthday) + String.valueOf(salary);
    }
}