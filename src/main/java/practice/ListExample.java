package practice;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

    List<String> lists = new ArrayList<>();

    public void addValueToList() {
        lists.add("One");
        lists.add("Two");
        lists.add("Three");
    }

    public void readValueFromTheList() {

        System.out.println(lists);

        for (int i = 0; i < lists.size(); i++) {
            System.out.println("Print value using Loop:" + lists.get(i));
        }
        //For-Each loop
        for (String a : lists) {
            System.out.println("Print Value using Loop: " + a);
        }
    }

    public void removeValueFromTheList() {
        lists.remove("Two");
        System.out.println(lists);

    }
}

