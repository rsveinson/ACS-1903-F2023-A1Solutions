import java.util.Scanner;
/** 
 * ACS-1903 Assignment 1 Question Y
 * @author: Sample Solution
*/

public class ShippingCost{
    public static void main(String[] args) {
        // ** Variables constants and objects **
        Scanner scanner = new Scanner(System.in);
         
        // user input, the weight of items to ship
        int itemKG = 0;
        int itemGrams = 0;
        
        // total weight of items to ship
        int allItemsKG = 0;
        int allItemsGrams = 0;
        int allItemsWeight = 0;    // this is the total weight of all items in grams
        
        int totalKG = 0;
        int totalGrams = 0;
        
        // other stuff
        int itemCount = 0;  //number of items, used for displaying prompt
        
        // shipping cost
        double shippingCost = 0.0;
        int tempTotalKG = 0;
        
        // ** get input **
        
        /* print some instructions about
         * input form and terminating input
         */
        System.out.println("Welcome to the Shipping Cost Calculator\n");
        System.out.print("\nEnter the weight of each item ");
        System.out.println(" in the form kilograms grams.");
        System.out.println("Enter 0 0 when you have entered the weight of all of you items.\n\n");
        
        
        // the while loop will prompt for input until
        // a 0 is entered for both kg and g
        
        // set the item counter to 1
        itemCount = 1;
        
        System.out.println("-------------------------------");
        System.out.println("Enter Shipment Information\n");
        System.out.print("Enter the weight of item " + itemCount);
        System.out.println(" in the form kilograms grams.");
        itemKG = scanner.nextInt();
        itemGrams = scanner.nextInt();
        
        while(itemKG != 0 || itemGrams != 0){
            // add current weight to total weight
            allItemsKG += itemKG;
            allItemsGrams += itemGrams;
                    
            // get the next item's weight
            System.out.println("Enter the weight of item " + ++itemCount);
            itemKG = scanner.nextInt();
            itemGrams = scanner.nextInt();
        }// end while
        
        
        //System.out.println(allItemsKG + "KG: " + allItemsGrams + "G");
        
        // ** processing **
        
        /* get the sum of all of the weights NOTE: no selection allowed
         * my intention was that they do this by converting
         * everything to grams and using div and mod to convert that
         * to KG and G but there are probably other ways to accomplish this
         * task without using selectio
         */ 
        
        allItemsWeight = allItemsKG * 1000 + allItemsGrams;
        
        // get total weight of all items in KG and G
        totalKG = allItemsWeight / 1000;
        totalGrams = allItemsWeight % 1000;
        tempTotalKG = totalKG;
        
        System.out.println("\n---------------------------------------");
        System.out.println("End of items. Total weight is:");
        System.out.println(totalKG + "KG: " + totalGrams + "G");
        System.out.println("---------------------------------------\n");
        
        // get the shipping cose
        /* my original intent was for them to use div and mod once again
         * but this can alos be done using nested if
         */

        if(tempTotalKG >= 250){
            shippingCost = (tempTotalKG - 250) * 1.2;
            shippingCost += totalGrams / 1000.0 * 1.2;
            shippingCost += 372.5;
        }// end > 250
        else if(tempTotalKG >= 200){
            shippingCost = (tempTotalKG - 200) * 1.25;
            shippingCost += totalGrams / 1000.0 * 1.25;
            shippingCost += 310;
        }// end > 200
        else if(tempTotalKG >= 150){
            shippingCost = (tempTotalKG - 150) * 1.3;
            shippingCost += totalGrams / 1000.0 * 1.3;
            shippingCost += 245;
        }//end > 150
        else if(tempTotalKG >= 100){
            shippingCost = (tempTotalKG - 100) * 1.4;
            shippingCost += totalGrams / 1000.0 * 1.4;
            shippingCost += 175;    
        }// end > 100
        else if(tempTotalKG >= 50){
            shippingCost = (tempTotalKG - 50) * 1.5;
            shippingCost += totalGrams / 1000.0 * 1.5;
            shippingCost += 100;
        }// end > 50
        else{
            shippingCost = tempTotalKG  * 2.0;
            shippingCost += totalGrams / 1000.0 * 2;
        }// end less than 50
        
        
        
        // ** output
        System.out.println("\n---------------------------------------");
        System.out.println("Planet Express Shipping and Package Delivery:");
        System.out.println("Total cost for shippment:");
        System.out.println(totalKG + "KG: " + totalGrams + "G");
        System.out.println("---------------------------------------\n");
        System.out.println("Amount owing: $" + shippingCost);
        
        // ** closing message **
        System.out.println("end of program");
    }
}
