import java.util.Objects;
import java.util.Scanner;

public class StringToInt {
        //Function to convert a string to int without use of built-in functions
        public static void triangle(int number) throws Exception {
            for(int i=0; i<number; i++){
                for(int j=0; j<number; j++){
                    System.out.print("*");
                }
                System.out.println("");
                System.out.println("");
            }
        }

        //Driver Code
        public static void main(String[] args){
            triangle(4);
        }
}
