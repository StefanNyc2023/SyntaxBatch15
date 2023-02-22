package class13;

public class StringRecap {
    public static void main(String[] args) {
        //How can i print all the letters from this String one by one
        //input=its int
        //output=its char

        String str = "Java is Great";
        for (int i = 0; i <str.length() ; i++) {
            System.out.println(str.charAt(i));

        }
        //count how many times the letter a has appeared in the above String
        //this one is very important method
        int count=0;
        for (int i = 0; i <str.length() ; i++) {
            System.out.println(str.charAt(i));
            if (str.charAt(i)=='a'){
                count++;
            }
            System.out.println("Letter a has appeared "+count+" Many times ");
        }

    }
}
