package practice;

public class ThisKeyword {   //Keyword THIS is reference Variable in Java that refers to the current object
    int a;
    int b;


    public void setData(int a , int b){
        this. a = a;  //when u use the keyword ''this '' is variable
        this. b = b;
    }
    public void showData(){
        System.out.println("Value of a  = " + a);
        System.out.println("Value of b  = " + b);
    }
    public static void main(String args[]){
        ThisKeyword obj = new ThisKeyword();
        obj.setData(2,3);
        obj.showData();
    }
}
