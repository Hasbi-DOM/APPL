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
public class CountLetters {

    public static void main(String[] args) {
        int[] counts = new int[26];
        Scanner scan = new Scanner(System.in);
        //get word from user 
        System.out.print("Enter a single word (letters only, please): ");
        String word = scan.nextLine();
        
        //convert to all upper case 
        word = word.toUpperCase();
        try {
        //count frequency of each letter in string 
        for (int i = 0; i < word.length(); i++) {
            counts[word.charAt(i) - 'A']++;
            }
        } catch (ArrayIndexOutOfBoundsException exc){
            System.out.println("Not a Letter");
        
        //print frequencies
        
        System.out.println();
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] != 0) {
                System.out.println((char) (i + 'A') + ": " + counts[i]);
            }
        }
        }
    }

}
