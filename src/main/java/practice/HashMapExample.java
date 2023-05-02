package practice;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

    HashMap<String, String> hmap = new HashMap<>(); //create an empty hash map

    public void addHashmapValue() { //Add elements to the map
        hmap.put("IE", "Internet Explorer");
        hmap.put("CHROME", "Chrome Browser");
        hmap.put("Firefox", "Mozilla Firefox");
        hmap.put("Safari", "Macbook Browser");
        hmap.put("Opera", "Linux Browser");
 //       System.out.println("Browser name of Opera: " + hmap.get("Opera"));  // we put the key name and we retrieve the value

        for (Map.Entry me : hmap.entrySet()) {     //to Iterate over the map we use for loop Map.Entry
            System.out.println("Key = " + me.getKey() + ", Value = " + me.getValue());
        }
        System.out.println();
        System.out.println("Size of the map: " + hmap.size()); //print size of the map

        System.out.println();
        System.out.println("Content of the map: "+ hmap);  //print Content of the map

        System.out.println();
        if (hmap.containsKey("Firefox")) {
            String val = hmap.get("Firefox");
            System.out.println("Value of Firefox : " + val);
        }


  /*      HashMap<String, Integer> map = new HashMap<>();
          map.put("vishal", 10);
          map.put("sachin", 30);
          map.put("vaibhav", 20);

        System.out.println("Size of map is :- " + map.size());
        System.out.println(map);

        if (map.containsKey("vishal")){
            Integer a = map.get("vishal");
            System.out.println("value for key" +;
   */     }




    public static void main(String[] args) {
        HashMapExample hme = new HashMapExample(); //Creating Object of the same class,u can create as many as u want in a class
        hme.addHashmapValue();
    }

}
