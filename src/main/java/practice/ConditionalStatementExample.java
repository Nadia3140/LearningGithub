package practice;


public class ConditionalStatementExample {

    public void IfStatements() {  // method

        int x = 10;               // variable

//
        if (x < 20) {  //      if x value is less than 20 then print the value

            System.out.println("This is if statement");
        }
    }


    public void IfElseStatement() {

        int x = 30;
//      if x value is less than 20 then print the value
        if (x < 20) {
            System.out.println("This is if statement");
        } else  //x value is more than 20 then print the value
        {
            System.out.println("This is Else statement");
        }
    }

    public void NestedIfStatements() {
        int x = 30;
        int y = 18;

        if (x < 35) {
            if (y < 15) {
                System.out.println("x = " + x + " and y = " + y);

            }

        }
    }

    public void IfWithoutSwitch() {

        char grade = 'C';

        if (grade == 'A')
            System.out.println("Excellent");
        if (grade == 'B')
            System.out.println("Well Done");
        if (grade == 'C')
            System.out.println("Well Done");
        if (grade == 'D')
            System.out.println("You passed");
        if (grade == 'F')
            System.out.println("Better try again");


        System.out.println("Your grade is " + grade);

    }

    public void SwitchStatements() {
        char grade = 'C';

        switch (grade) {

            case 'A':
                System.out.println("Excellent");
                break;

            case 'B':
            case 'C':
                System.out.println("Well Done");
                break;

            case 'D':
                System.out.println("You passed");
                break;

            case 'F':
                System.out.println("Better try again");
                break;

            default:
                System.out.println("Invalid grade");

        }
        System.out.println("Your grade is " + grade);

    }
    public void ConditionalOperator(){
        int a, b;
        a = 10;
        b = (a==1) ? 20 :30;
        System.out.println("Value of b is : "+ b);

        }

    public void LearnIfElse() {
        char grade = 'A';


        if (grade == 'A') {
            System.out.println("You did excellent in the exam");
        } else if (grade == 'B') {
            System.out.println("You did well in the exam");
        } else if (grade == 'C') {
            System.out.println("You did average in the exam");
        } else if (grade == 'F') {
            System.out.println("You did failed in the exam");
        } else {
            System.out.println("You have invalid entry");

        }


    }
}




