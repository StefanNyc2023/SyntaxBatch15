package class10;

import java.util.Arrays;
import java.util.Scanner;

public class ScannerDemo1 {
    public static void main(String[] args) {
/* Below code manually store numbers in the array
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter 5 numbers");
        int [] numbers=new int[5];
        numbers[0]=40;
        numbers[1]=50;
        numbers[3]=60;
        numbers[2]=70;
        numbers[4]=80;

 */
//Below code take the numbers from user and store them in the array its good but a lot of code
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter 5 numbers");
        int [] numbers=new int[5];
        numbers[0]= scanner.nextInt();
        numbers[1]= scanner.nextInt();
        numbers[3]= scanner.nextInt();
        numbers[2]= scanner.nextInt();
        numbers[4]= scanner.nextInt();
        System.out.println(Arrays.toString(numbers));
        for (int i =0; i < numbers.length; i++){
            numbers[i]=scanner.nextInt();

        }
        System.out.println(Arrays.toString(numbers));


    }
}
