package class12;

public class StringDemo9 {
    public static void main(String[] args) {


        String str="jdnfkfd 34982343435454 &^@#*&^^";
        int counter=0;
        for (int i = 0; i < str.length(); i++) {

            if (Character.isDigit(str.charAt(i))){
                counter++;
            }

        }
        System.out.println("Total isAlphabetic is Str "+counter);
    }
}