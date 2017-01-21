package pck1;

import pck1.Employee;

/**
 * Created by RENT on 2017-01-21.
 */
public class Secretary extends Employee {


    @Override
    public double getSalary (){
        return baseSalary*1.2;
    };

}
