package class5;

public class LogicalOperators1 {
    public static void main(String[] args) {


        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(true || true);


        boolean broughtCho = true;
        boolean broughtFlowers = false;
        if (broughtCho || broughtFlowers) {
            System.out.println("I am happy");

        } else {
            System.out.println("I am Sad");
        }

        boolean wifi = true;
        boolean fiveG = true;

        if (wifi || fiveG) {
            System.out.println("You are good for browsing internet");
        } else {
            System.out.println("Either connect to wifi or to 5G");

        }


    }
}
