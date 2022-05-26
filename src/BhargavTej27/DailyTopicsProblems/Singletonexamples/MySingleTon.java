package BhargavTej27.DailyTopicsProblems.Singletonexamples;

import com.sun.org.apache.xalan.internal.xsltc.dom.SingletonIterator;

public class MySingleTon {
   static MySingleTon shivaobj;

   private MySingleTon(){

    }
   public static MySingleTon shiva(){
       if(shivaobj == null){
           shivaobj = new MySingleTon();
       }
         return shivaobj;
    }
  }

