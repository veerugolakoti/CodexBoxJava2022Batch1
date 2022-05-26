package BhargavTej27.PracticeProblems.Accesmoififers;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public  class FindDuplicate {
        public void companyname () {
            List<String> companylist = new ArrayList<>();
            companylist.add("codexbox");
            companylist.add("kagool");
            companylist.add("codexbox");
            companylist.add("codexbox");
            companylist.add("microsoft");
            companylist.add("wipro");
            companylist.add("infosis");
            int count = 0;
       List<Integer> dcounts = new ArrayList<>();
       List<String> names = new ArrayList<>();
            for (int i = 0; i < companylist.size(); i++) {
                for (int j = i + 1; j < companylist.size(); j++) {
                    if (companylist.get(i).equals(companylist.get(j)));{

                        dcounts.add(count++) ;
                        names.add(companylist.get(i)) ;
                        break;
                    }
                }
            }
            System.out.println( names + "repeated times =" + dcounts);
        }
    }

