package Veeru.sample.employee;

import Veeru.sample.abstraction.EmployeesAbstraction;


public class GoogleEmployee extends EmployeesAbstraction {

    @Override
    public String qualification() {
        return "B.e, Btech. M.e, Mtech";
    }

    @Override
    public String careerPercentage() {
        return "90%";
    }


}
