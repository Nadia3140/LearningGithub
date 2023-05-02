package practice;

public class StringExample {

    public void indexOf(){

        //The indexOf() method returns the position of the first occurrence of specified character(s) in a string.
        //indexOf(String str)
        String myStr ="Hello planet earth, you are a great planet.";
        System.out.println(myStr.indexOf("planet"));

        //indexOf(String str, int fromIndex)
        System.out.println(myStr.indexOf("e",5));
        System.out.println(myStr.indexOf("planet",15));

        //if the searched String unable to find then it will return -1
        System.out.println(myStr.indexOf("homework"));  //-1

    }

    //substring(int startIndex)
    public void ShowSubString(){
        String str = "JavaPoint";
        String subStr =str.substring(2);
        System.out.println(subStr);
    }
    //substring(int startIndex, int endIndex)
    public void ShowSubString1() {
        String str = "JavaPoint";
        String subStr = str.substring(0, 4);
        System.out.println(subStr);


        //Note: The length of an empty string is 0.
        String emptyString = "";

    }
    public void length(){
        //The length() method returns the length of a specified string.
        String txt ="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println(txt.length());   //26
    }

    public void trim(){  //The trim() method removes whitespace from both ends of a string.
        String myStr ="    Hello World    ";
        System.out.println(myStr);
        System.out.println(myStr.trim());  //Note: This method does not change the original string.

    }

    public void charAt(){  //Return the character on a specific location.

        String myStr = "Hello";

        char result = myStr.charAt(0);  //Return the first character (0) of a String.
        System.out.println(result);

        char result1 = myStr.charAt(2);
        System.out.println(result1);
    }
    public void valueOf(){ //The java string valueOf() method converts different types of values into string
        int value = 30;
        String s1 = String.valueOf(value);
        System.out.println(s1 + 10); //concatenating string with 10

    }
    public void format(){   //The java string format method is used to concatenate the other data type value with String
        String name = "Jonathan";
        int age = 20;
        int salary = 4000;
        //without string.format
        System.out.println("My name is " + name + " and i am " + age + "years old and my salary is $" + salary + " yearly");

        //With the help of String.format it will be much simpler and easy to manage
        String s = String.format("My name is %s and I am %d years old and my salary is $%d yearly", name, age, salary);
        System.out.println(s);
    }

    public void contains(){    //The contains() method checks whether a string contains a sequence of characters.
        // Returns true if the characters exist and false if not.

        String myStr = "Hello";
        System.out.println(myStr.contains("Hel"));
        System.out.println(myStr.contains("e"));
        System.out.println(myStr.contains("Hi"));

    }



}

