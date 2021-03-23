/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class CopyFile {
    
    public static void main(String[] args) throws IOException 
    {
        BufferedReader br;
        String line;
        Scanner scan = new Scanner(System.in);
        String val = scan.nextLine();
        
        br = new BufferedReader(new FileReader("D:\\HASBI\\" + val));
        try {
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }   
        }catch (FileNotFoundException e) {
                System.out.println("File Not Found!");
                }
    }
}