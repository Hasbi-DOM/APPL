/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
import java.util.Scanner;
public class Factorials {

    public static void main(String[] args) {
        String keepGoing = “y”; 
        Scanner scan = new Scanner(System.in);
        while (keepGoing.equals(“y”) || keepGoing.equals(“Y”)) 
        { 
        System.out.print("Enter an integer: ");
            int val = scan.nextInt();
            System.out.println("Factorial(" + val + ") = "
                    + MathUtils.factorial(val));
            System.out.print("Another factorial? (y/n) ");
            keepGoing = scan.next();
        }
    }
}
