package class13;

public class Task3 {
    public static void main(String[] args) {
        // Write a program that reads two people's first names and if they expecting boy or girl?
        //Based on the input suggests a name for a baby;
        //Example Output:
        //Mom's first name? Mary
        //Dad's first name? Daniel
        //Boy or Girl? boy
        //Suggested baby name : DANRY
        //Suggested baby name in this case is base on last two letter from mom's first name and first three letters from father first name

        //Example Output;
        //Mom's fist name? Mary
        //Dad's first name? Daniel
        //Boy or Girl? girl
        //Suggested baby name : MAIEL
        //Suggested baby name in this case is base on first two letters from mom's first name and last three letters from dad's first name


        String dadsName = "Daniel";
        String momsName = "Mary";
        String expectation = "Boy";
        String firstHalf = "";
        String secondHalf = "";

        if (expectation.equalsIgnoreCase("boy")) {
            firstHalf = dadsName.substring(0, dadsName.length() / 2);
            secondHalf = momsName.substring(momsName.length() / 2);
            System.out.println(firstHalf + secondHalf);
        }else {
            firstHalf=momsName.substring(0,momsName.length()/2);
            secondHalf=dadsName.substring(dadsName.length()/2);
        }

    }
}
