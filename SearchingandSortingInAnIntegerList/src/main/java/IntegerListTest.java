/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS S410UN
 */
import java.util.Scanner;
public class IntegerListTest {

    static Integerlist list = new Integerlist(10);
    static Scanner scan = new Scanner(System.in);
//-------------------------------------------------------
// Create a list, then repeatedly print the menu and do what the
// user asks until they quit
//-------------------------------------------------------

    public static void main(String[] args) {
        printMenu();
        int choice = scan.nextInt();
        while (choice != 0) {
            dispatch(choice);
            printMenu();
            choice = scan.nextInt();
        }
    }
//-------------------------------------------------------
// Do what the menu item calls for
//-------------------------------------------------------

    public static void dispatch(int choice) {
        int loc;
        switch (choice) {
            case 0:
                System.out.println("Bye!");
                break;
            case 1:
                System.out.println("How big should the list be?");
                int size = scan.nextInt();
                list = new Integerlist(size);
                list.randomize();
                break;
            case 2:
                list.selectionSort();
                break;
            case 3:
                System.out.print("Enter the value to look for: ");
                loc = list.search(scan.nextInt());
                if (loc != -1) {
                    System.out.println("Found at location " + loc);
                } else {
                    System.out.println("Not in list");
                }
                break;
            case 4:
                list.print();
                break;
            default:
                System.out.println("Sorry, invalid choice");
        }
    }

    public static void printMenu() {
        System.out.println("\n Menu ");
        System.out.println(" ====");
        System.out.println("0: Quit");
        System.out.println("1: Create a new list (** do this first!! **)");
        System.out.println("2: Sort the list using selection sort");
        System.out.println("3: Find an element in the list using linear search");
        System.out.println("4: Print the list");
        System.out.print("\nEnter your choice: ");
    }
}
