package practice;

import java.util.Random;

public class RandomDemo {
    public static void main(String[] args){

        Random rand = new Random();  //create instance of Random class

        int rand_int1 = rand.nextInt(1000);//Generate random integers in rage 0 to 9999
        int rand_int2 = rand.nextInt(1000);

        System.out.println("Random Integers: "+rand_int1);//print random integers
        System.out.println("Random Integers: "+rand_int2);

        double randomDouble1 = rand.nextDouble();//Generate random double
        double randomDouble2 = rand.nextDouble();

        System.out.println(randomDouble1);//print random doubles
        System.out.println(randomDouble2);

    }
}
