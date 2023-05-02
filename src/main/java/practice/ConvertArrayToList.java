package practice;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertArrayToList {

    public static void main(String args[]){

        //Creating Array

        String[] array= {"Red","Black","Blue","Yellow"};
        System.out.println("Printing Array: " + Arrays.toString(array));


        //Converting Array to List
        List<String> list =new ArrayList<String>();
        for (String lang:array){
            list.add(lang);
        }
        System.out.println("Printing List: "+ list);

    }
}
