package jhansi.main;

import jhansi.ExceptionHandlingExamples.CheckedExample;
import jhansi.collections.TicketDetails;
import jhansi.duplicatevalues.ListOfNames;

import java.util.ArrayList;
import java.util.List;

public class MainApplication {
    public static void main(String[] args) {
       /* Employee OBJECT = new Employee();
        System.out.println("file not found");*/
        // System.out.println("================exceptionhandling");


       /* InterfaceEx imp = new InterfaceEx();
        imp.display();*/
        //System.out.println("=================interface example");


//
//        MarkerExample marker=new MarkerExample("jhansi",8);
//
//        System.out.println(marker.name);
//        System.out.println(marker.id);
//
//
//        System.out.println("==============marker interface");
//
//
//       CheckedExample ckm = new CheckedExample();
//        ckm.method();
        //System.out.println("==========Exception Handling");


      /*  List<TicketDetails> list = new ArrayList<>();
        TicketDetails tcs = new TicketDetails();
        tcs.setName("jhansi");
        tcs.setAge(23);
        tcs.setAmount(780);
        tcs.setAdress("kurnool");
        tcs.setId(78963);

        TicketDetails tcsa = new TicketDetails();
        tcsa.setName("priyanka");
        tcsa.setAge(20);
        tcsa.setAmount(736);
        tcsa.setAdress("hyderabad");
        tcsa.setId(7896399);

        TicketDetails tcsb = new TicketDetails();
        tcsb.setName("sony");
        tcsb.setAge(22);
        tcsb.setAmount(799);
        tcsb.setAdress("chennai");
        tcsb.setId(789669);

        list.add(tcs);
        list.add(tcsa);
        list.add(tcsb);

        for (TicketDetails TicketDetails : list) {

            System.out.println("Name:" + TicketDetails.getName());
            System.out.println("Age:" + TicketDetails.getAge());
            System.out.println("Id Number:" + TicketDetails.getId());
            System.out.println("Amount:" + TicketDetails.getAmount());
            System.out.println("Adress:" + TicketDetails.getAdress());//
            */

            ListOfNames  lsn=new ListOfNames();
        lsn.method();



        }



}