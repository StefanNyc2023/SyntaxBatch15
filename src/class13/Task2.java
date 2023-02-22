package class13;

public class Task2 {
    public static void main(String[] args) {
        // 2)Create a String and print it in reverse order (Sunday => yadnuS).
        String str = "Sunday";
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));


        }
        //it will print this way reverse
        //This is one of the interview questions
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
    }
}
