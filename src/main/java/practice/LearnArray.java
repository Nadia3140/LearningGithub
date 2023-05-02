package practice;

import java.util.Arrays;
import java.util.Collections;

public class LearnArray {

    public void StringArray(){

     // instead of declaring individual variables we can declare Arrays and put all the data
     //   String list1 = "Florida";
     //   String list2 =" California";
     //   String list3 = "Georgia";
     //  String list4 = "Texas";




        String[] myList ={"Florida", "California", "Georgia", "Texas"};


        for (int i = 0; i<myList.length; i++) {

            System.out.println("State name is:" + myList[i]);
        }

    }
    public void SortArray(){
    //Sorting Elements in an Array
        String[] states ={"Florida", "California", "Georgia", "Texas"};
        Arrays.sort(states);
        //Print Elements in Array without loop
        System.out.println(Arrays.toString(states));

    }

    //Sorting Elements in an Array in Descending order
     public void SortArrayInDescendingOrder(){
        //Sorting Elements in an Array in Descending order
        String[] states ={"Florida", "California", "Georgia", "Texas"};
        Arrays.sort(states, Collections.reverseOrder());
        //Print Elements in Array without loop
        System.out.println(Arrays.toString(states));

    }
}

