import java.util.Objects;
import java.util.Scanner;

public class StringToInt {
        //Function to convert a string to int without use of built-in functions
        public static void convert(String s) throws Exception {
            //Create and initialize a placeholder variable for the number
            long numResult = 0;
            //Declare boolean variable for checking if negative and initialize to false
            boolean isNeg = false;

            //Check if passed String equals EXIT
            if(s.equals("EXIT")){
                return;
            }

            //Iterate over the passed string parameter
            for (int i=0; i<s.length(); i++) {
                //Check if first character is -
                if (s.charAt(i) == '-' && i==0) {
                    isNeg = true;
                } else {
                    //Check if not a number, and throw exception
                    if(s.charAt(i) < 48 || s.charAt(i) > 57){
                        throw new Exception(s + " is not a number! Exiting Program!");
                    }
                    //Formula to get to int value
                    numResult = numResult * 10 + ((int) s.charAt(i) - 48);
                }
            }

            //Check if isNeg is true
            if(isNeg){
                //Multiply by -1 to make the number negative
                numResult = numResult*-1;
            }

            //Check if outside int range and throw exception
            if(numResult > Integer.MAX_VALUE){
                throw new Exception("Larger than Integer.MAX_VALUE! Exiting Program!");
            }else if(numResult < Integer.MIN_VALUE){
                throw new Exception("Less then Integer.MIN_VALUE! Exiting Program!");
            }

            //Print out result to console
            System.out.println(numResult);
        }

        //Driver Code
        public static void main(String[] args){
            //Output how to Exit
            System.out.println("Enter EXIT to exit anytime.");
            //Declare a new scanner
            Scanner scanner = new Scanner(System.in);
            //Declare input string
            String input = "";

            //Continually ask for numbers until EXIT is entered or Error Thrown
            while (!Objects.equals(input, "EXIT")) {
                System.out.print("Enter a string number to convert: ");
                input = scanner.nextLine();
                //Call function using input string inside a try/catch block
                try {
                    convert(input);
                } catch (Exception e) {
                    //Error message comes from function, print stacktrace and return
                    e.printStackTrace();
                    return;
                }
            }

        }
}
