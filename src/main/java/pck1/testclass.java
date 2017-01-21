package pck1;

import pck1.Employee;

/**
 * Created by RENT on 2017-01-21.
 */
public class testclass

{
    public static void main(String[] args) {

    Employee e = new Clerk();
    printSalary(e);

}

    public static void printSalary(Employee e) {
        if (e instanceof Clerk) System.out.println("true");
        System.out.println(e.getSalary());
    }

    public void start (){
        Employee e = new Clerk();
        printSalary(e);
    }}
