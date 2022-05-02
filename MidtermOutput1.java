//HINGCO, RENIER ANTONY. R.
package javaapplication1;

import java.util.Scanner;
    public class MidtermOutput1{
        
        public static void main(String[] args){
            Scanner input = new Scanner(System.in);
                System.out.println("(Note: The number should be greater than or equal to 1.)");
                
                int x;
                System.out.println("Enter a number:");
                x = input.nextInt();
                
                int y = x*(x-1)+1;

                if (x >= 1){
                    for (int width = 1; width <= y; width++) {
                        for (int length = 1; length <= y; length++) {
                            if (width == 1 || width == y || length == 1 || length == y 
                                    || width == x || length == x 
                                    || width == 2 * x -1 ||  length == 2 * x -1 
                                    || width == 3 * x -2 ||  length == 3 * x -2
                                    || width == 4 * x -3 ||  length == 4 * x -3
                                    || width == 5 * x -4 ||  length == 5 * x -4
                                    || width == 6 * x -5 ||  length == 6 * x -5) {   
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                    }
                        System.out.println();
                    }
                }else{
                    System.out.println("Invalid Output!");
        }
    }
}