package class10;

import java.util.Arrays;

public class ForEachLoopDemo4 {
    public static void main(String[] args) {
//first limitations of Array---we can't update elements from this example

        int[] arr={10,13,20,25,45,50};
        //we can't update elements in for each loop because we don;t have access to the index;

        for (int x:arr){
            if (x%2!=0){
                x=0;

            }
        }
        //Below code prints all the elements from an array without a loop
        System.out.println(Arrays.toString(arr));








    }
}
