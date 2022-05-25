package Nagarjuna.MainExcution;

import Nagarjuna.ExceptionHandling.SalaryException;
import Nagarjuna.JunitTesting.JUnitMultiplication;
import Nagarjuna.collections.StudentList;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/*
public class MainMethod {
    public static void main(String[] args) {
*/
       /* System.out.println("----------user defined exception----------");
        try {
            int id[] = {1, 2, 3, 4, 5};
            double sal[] = {12000.23, 6428.00, 23900.34, 29000.45, 38987.00, 45678.45};
            System.out.println("empno\t" +  "salary\t");
            for (int i = 0; i < 5; i++) {
                System.out.println(id[i] + "\t\t" + sal[i] + "\t");
                if (sal[i] < 50000) {
                throw new SalaryException();
                }
            }
        }catch(SalaryException e){
            System.out.println("my exception");
            }
        }
    }*/
//        collections example 25-05-22.
/*
List<StudentList> list=new ArrayList();
StudentList sdl1=new StudentList();
sdl1.setId(1);
sdl1.setStdName("nag");
sdl1.setClgName("kvsr");
StudentList sdl2=new StudentList();
sdl2.setId(2);
sdl2.setStdName("prasad");
sdl2.setClgName("bits");
StudentList sdl3=new StudentList();
sdl3.setId(3);
sdl3.setStdName("ravi");
sdl3.setClgName("svist");
list.add(sdl1);
list.add(sdl2);
list.add(sdl3);

       for (StudentList studentList:list) {
            System.out.println("std id :"+studentList.getId());
            System.out.println("student name : "+studentList.getStdName());
            System.out.println("student clg name : "+studentList.getClgName());
            System.out.println("-----------------------------------------");

        }
    }
}

*/


public class MainMethod {
    @Test
   public void testMultiplication () {
        JUnitMultiplication jnm=new JUnitMultiplication();
        Assert.assertEquals(200,JUnitMultiplication.mul(10,20));
    }
}

