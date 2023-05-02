package practice;

public class SplitArrayExample {

    public static void main(String[] args) {

//  ● Split method we used in order to separate individual word from a string using deliminator
//  ● Example, String names = “John,Mathew,Ali,Abraham” now we can use split method to store value in array
//  individually separated by coma deliminator.

/*        String name = "John,Ali,Mathew,Abraham";
        String[] nameArray = name.split(",");
        for (String person: nameArray){
            System.out.println("Person name is:" + person);
        }*/

        String sentence = "I live in NewYork";
        String[] words = sentence.split(" ");
        for (String word: words){
            System.out.println("Word is: " + word);
        }
//  String reverse = "NewYork in live I".
        String reverse = "";  //first create a blank string

        for (int i = words.length -1; i >0; i--){  //backward for loop
            reverse += words[i] + " ";
        }
        System.out.println("Sentence is: " + reverse);

    }
}
