package class5;

public class LogicalOperators2 {
    public static void main(String[] args) {


        double mathScore = 92.5;
        double historyScore = 91.5;
        double ScienceScore = 93.5;

        /*if (mathScore>90){
            System.out.println("Brilliant student");
        }else{
            System.out.println("You need to work hard");

        }
        if (historyScore>90){
            System.out.println("Brilliant student");
        }else{
            System.out.println("You need to work hard");
        }
       if (ScienceScore>90){
           System.out.println("Brilliant student");
       }else{
           System.out.println("You need to work hard");
       }

         */

        if (mathScore > 90 && historyScore > 90 && ScienceScore > 90) {
            System.out.println("You are brilliant student");
        } else {
            System.out.println("You need work harder");
        }

    }
}
