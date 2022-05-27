package TejaAravind.MainApp;

import TejaAravind.collections.DuplicatesListCount;

import java.util.ArrayList;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("teja");
        list.add("kumar");
        list.add("teja");
        list.add("siva");
        list.add("siva");
        list.add("kumar");
        list.add("kumar");
        list.add("siva");
        list.add("teja");

       DuplicatesListCount.duplicateCount(list);
        //DuplicatesList.Duplicates();

    }
}
