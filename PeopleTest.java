
import java.util.Date;
import  java.text.SimpleDateFormat;
import java.io.*;
import java.lang.*;
/**
 * Created with IntelliJ IDEA.
 * User: GIAQUAN
 * Date: 27/07/2014
 * Time: 09:48
 * To change this template use File | Settings | File Templates.
 */
class Person{
    public String name;
    public Date birthday;
    public String getName()
    {
        return name;
    }
    public String toString()
    {
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
        return name + format.format(birthday)  ;
    }
};
class Employee extends Person{
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
        return name +" "+format.format(birthday) +" "+ String.valueOf(salary);
    }
};

class Manager extends Employee{
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
        return name +" "+ format.format(birthday) +" "+ String.valueOf(salary);
    }
};
public class PeopleTest{
    public static void main(String[] args){
        Employee newbie;
        newbie = new Employee("Newbie", new Date(89,1,10), 1000000);
        Manager boss;
        boss = new Manager("Boss", new Date(86,1,23), 4000000);
        Manager biggerBoss;
        biggerBoss = new Manager("Big Boss", new Date(69,2,12), 1000000);
        biggerBoss.setAssistant(boss);
        System.out.println(newbie.toString());
        System.out.println(boss.toString());
        System.out.println(biggerBoss.toString());
		System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ __  _ __ _ __ ");
        Person [] peo = new Person[3];
        peo[0] = new Employee("Newbie", new Date(89,1,10), 1000000);
        peo[1] = new Manager("Boss", new Date(86,1,23), 4000000);
        peo[2] = new Manager("Big Boss", new Date(69,2,12), 1000000);
        for(int i=0;i<3;i++)
        {
            System.out.println(peo[i].toString());
        }

    }
}