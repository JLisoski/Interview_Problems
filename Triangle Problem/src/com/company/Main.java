package com.company;

public class Main {

    public static void printTriangle(int numOfLines){

        int lineCounter = 1;
        int numOfSpaces = numOfLines-1;
        int totalLines = numOfLines*2;

        //While loop
        while(lineCounter != totalLines) {

            if(lineCounter % 2 == 0){
                //Print blank line
                System.out.println();
                //Increase line counter
                lineCounter++;
                //Skip to next iteration
                continue;
            }

            //Print spaces
            for (int i = 0; i < numOfSpaces; i++) {
                System.out.print(" ");
            }

            //Print stars
            for (int i = 0; i < lineCounter; i++) {
                System.out.print("*");
            }

            //End the line
            System.out.println();

            //Increase lineCounter and Decrease numOfSpaces
            lineCounter++;
            numOfSpaces--;
        }
    }

    public static void main(String[] args) {
	    // write your code here
        printTriangle(7);
    }
}
