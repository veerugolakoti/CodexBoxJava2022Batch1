package Veeru.sample.employee;

import Veeru.sample.abstraction.EmployeesAbstraction;


public class CodexBoxEmployee extends EmployeesAbstraction {

    @Override
    public String qualification() {
        return "Graduate, P.G, or any other relevant degree";
    }

    @Override
    public String careerPercentage() {
        return "50%";
    }
}
