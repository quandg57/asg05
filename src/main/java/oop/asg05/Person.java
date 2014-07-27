// viet chuong trinh ve Person
package oop.asg05;
import java.util.Date;
import  java.text.SimpleDateFormat;
public class Person{
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
}
