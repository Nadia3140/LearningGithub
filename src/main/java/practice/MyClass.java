package practice;

public class MyClass {

    int a;       //variable
    int b;
    int c;
    int d;
    int e;

    //First Constructor
    public MyClass() { //declare constructor inside the class

        a = 10;  //variable values
        b = 15;
        c = 20;
        d = 25;
        e = 30;

    }
    //Second Constructor   (u can create as many constructor as u want in a class)
    public MyClass(int objectA, int objectB, int objectC, int objectD, int objectE ){
        a = objectA;
        b = objectB;
        c = objectC;
        d = objectD;
        e = objectE;

    }

    public static void main(String[] args) {  //(This will call the constructor)

        MyClass myObj1 = new MyClass();    //declare object out of the class

        System.out.println("myObj1 a = " + myObj1 .a);
        System.out.println("myObj1 b = " + myObj1 .b);
        System.out.println("myObj1 c = " + myObj1 .c);
        System.out.println("myObj1 d = " + myObj1 .d);
        System.out.println("myObj1 e = " + myObj1 .e);



        MyClass myObj3 = new MyClass(101, 103, 119, 125, 137);//initializing values inside parameter list
        System.out.println("myObj3 a = " + myObj3 .a);
        System.out.println("myObj3 b = " + myObj3 .b);
        System.out.println("myObj3 c = " + myObj3 .c);
        System.out.println("myOb3j d = " + myObj3 .d);
        System.out.println("myObj3 e = " + myObj3 .e);


        MyClass myObj4 = new MyClass(223, 219, 287, 256, 201);//parameter list8
        System.out.println("myObj4 a = " + myObj4 .a);
        System.out.println("myObj4 b = " + myObj4 .b);
        System.out.println("myObj4 c = " + myObj4 .c);
        System.out.println("myObj4 d = " + myObj4 .d);

    }
}
