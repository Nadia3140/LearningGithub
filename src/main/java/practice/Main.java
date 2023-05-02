package practice;

public class Main {

    public static void main(String[] args) {

    //  Class_name             Object name
        MethodParameterExample mepObject = new MethodParameterExample();
        int numbers = mepObject.AddNumbers(5,6);
        System.out.println(numbers);



        Variables varObj = new Variables();
        varObj.intVariables();
        varObj.FloatVariables();
        varObj.booleanVariables();
        varObj.characterVariables();
        varObj.stingVariables();


    }
}
