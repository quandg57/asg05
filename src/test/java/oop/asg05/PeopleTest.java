package oop.asg05;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: GIAQUAN
 * Date: 21/07/2014
 * Time: 10:54
 * To change this template use File | Settings | File Templates.
 */
public class PeopleTest{
    public static void main(String[] args){
        Employee newbie;
        newbie = new Employee("Newbie", new Date(89,1,10), 1000000);
        Manager boss;
        boss = new Manager("Boss", new Date(86,1,23), 4000000);
        Manager biggerBoss;
        biggerBoss = new Manager("Big Boss", new Date(69,2,12), 10000000);
        biggerBoss.setAssistant(boss);
        System.out.println(newbie.toString());
        System.out.println(boss.toString());
        System.out.println(biggerBoss.toString());
        Person [] peo = new Person[3];
        peo[0] = new Employee("Newbie", new Date(89,1,10), 1000000);
        peo[1] = new Manager("Boss", new Date(86,1,23), 4000000);
        peo[2] = new Manager("Big Boss", new Date(69,2,12), 10000000);
        for(int i=0;i<3;i++)
        {
            System.out.println(peo[i].toString());
        }

    }
}}