package class4;

public class IfElseIfConditionDemo4 {
    public static void main(String[] args) {
        int number1 = 10;
        int number2 = 10;
        /*
        if number1=number2 on the console => numbers are equal
        if number1>number2 on the console => number1 is greater than Number2
        if number2>number1 on the console => number2 us greater than number1
         */
        if (number1 == number2) {
            System.out.println("numbers are equal ");
        } else if (number1 > number2) {
            System.out.println("number1 is greater than number2 ");

        } else if (number2 > number1) {
            System.out.println("number2 is greater than mumber1 ");
    //we could also put only else on the end
        }
    }

}
