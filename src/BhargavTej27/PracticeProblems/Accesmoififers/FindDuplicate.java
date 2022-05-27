package BhargavTej27.PracticeProblems.Accesmoififers;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public  class FindDuplicate {
    public void companyname() {
        List<String> companylist = new ArrayList<>();
        companylist.add("Codexbox");
        companylist.add("kagool");
        companylist.add("kagool");
        companylist.add("wipro");
        companylist.add("kagool");
        companylist.add("kagool");
        int count = 0;
        List<Integer> dcounts = new ArrayList<>();
        List<String> names = new ArrayList<>();
        for (int i = 0; i < companylist.size(); i++) {
            for (int j = i + 1; j < companylist.size(); j++) {
                if (companylist.get(i).equalsIgnoreCase(companylist.get(j))){
                    names.add(companylist.get(j));
                    break;
//                    System.out.println(names + " repeated times =" + names.size());
                }
            }
        }
        System.out.println(names.get(0) + " repeated times =" + names.size());
    }

}
