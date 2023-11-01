import java.util.Scanner;
public class Wordplay{
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = kb.next();
        String result;
        int length = word.length(); 
        
        System.out.println(length);
        
        if (length <= 3){
            result = "Big question: " + word.toUpperCase() + "?";
        }// end if <= 3
        /* note that I don't have to test for >3 here
         * because if the word is 3 or less we would have done the 
         * code in the if clause
         */ 
        else if (length <= 8){
            result = "First and last letters: " + word.charAt(0) + word.charAt(word.length()-1);
        }// end between 3 and 8
        else{
            int mid = (length)/2;
            if (length % 2 == 0){
                result = "Middle letters: " + word.substring(mid-1, mid+1);
            }// end even
            else{
                result = "Middle letter: " +  word.charAt(mid);
            }// end else not even
        }// end > 8
        System.out.println(result);
    }// end main
}