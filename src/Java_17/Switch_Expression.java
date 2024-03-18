package Java_17;

public class Switch_Expression {
    public static void main(String[] args) {
        String day = "Sun";
        String time = "";
        //switch Statement
        /*switch (day){
            case "Sat" ,  "Sun" -> time = "6am";
            case "Wed" -> time = "8am";
            default -> time = "7am";
        }*/
        //switch-expression
        // it also uses arrow and
        // also do : with yield
        time = switch (day){
            case "Sat" , "Sun" : yield "6am";
            case "Wed" : /*->*/ yield "8am";
            default : /*->*/ yield "7am";
        };
        System.out.println(time);
    }
}
