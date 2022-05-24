package BhargavTej27.DailyTopicsProblems.Singletonexamples;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;

public class SingleTon2 {
 static SingleTon2  dbs= null;
  private SingleTon2(){

    }
    static SingleTon2 getcompany(){
      return dbs;
    }
}
