import java.util.Scanner;
public class FactorDecomposer
{
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int toFactor = -1;      // number to be factored

        // get the number to be factored
        System.out.println("Enter a non-negative number to factor:");
        toFactor = kb.nextInt();

        while(toFactor != 0) {                

            String output = toFactor + "'s factors are: ";

            int counter = 1;

            while (counter <= toFactor) {
                if(toFactor % counter == 0) {
                    output += counter;

                    // inelegant hack to print commas except on the last factor
                    if(counter != toFactor) {
                        output += ",";
                    }// ed if counter != factor
                }// end if it's a factor

                // keep track of how many numbers have been analyzed
                counter = counter + 1;
            }// end while factor loop

            // print the list of factors
            System.out.println(output);

            // get another number to be factored
            System.out.println("Enter a non-negative number to factor: 0 to quit");
            toFactor = kb.nextInt();
        }// end quit/continue loop

        // we're done
        System.out.println("Bye!");
    }// end main
}
