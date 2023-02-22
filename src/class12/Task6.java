package class12;

public class Task6 {
    public static void main(String[] args) {


        String[][] countries = {{"USA", "Canada", "Mexico"},
                {"Brasil", "Argentina", "Peru", "Columbia", "Chile"},
                {"Germany", "United", "Kingdom", "France", "Spain"},
                {"China", "India", "Jappan", "Russia"},
                {"Egypt", "Nigeria", "South Africa", "Ethiopia"}
        };


int counter=0;
        for (String[] country : countries) {//this is enhanced for loop
            for (String s : country) {
                System.out.print(s + " ");
                counter++;

            }

            System.out.println();//this helps to everything is looking organize once we print!Other way will print everything on the same line.
        }
        System.out.println("Total countries "+counter);
    }
}

