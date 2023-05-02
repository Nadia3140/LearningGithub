package practice;

public class EnumTest {

    Day day;

    public EnumTest(Day day){

        this.day = day;
    }

    public void dayIsLike(){

        switch (day) {
            case MONDAY:
                System.out.println("Mondays are bad");
                break;


        }
    }
}
