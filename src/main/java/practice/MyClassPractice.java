package practice;

public class MyClassPractice {   // Create a MyClass class
    int x;              // Create a class attribute

    public MyClassPractice() {    //Create a class constructor for the MyClass class
        x = 5;            //Set the initial value for the class attribute x


    }

    public static void main(String[] args) {  //(This will call the constructor)
        MyClassPractice myObj = new MyClassPractice();   //Create an object of class MyClass
        System.out.println(myObj.x);     //print the value of x

    }

}


