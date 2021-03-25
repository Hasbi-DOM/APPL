/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CopyFile {

    public static void main(String[] args) throws FileNotFoundException {
        File f;
        String line;
        Scanner scan = new Scanner(System.in);
        boolean found = false;
        String val;
        while (!found) {
            val = scan.nextLine();
        try {
            f = new File("D:\\HASBI\\" + val);
            if (!f.exists()) {
                throw new FileNotFoundException("File Not Found!");
            } 
            Scanner readfile = new Scanner(f);
            while (readfile.hasNextLine()) {
                line = readfile.nextLine();
                System.out.println(line);
            } 
            found = true;
        } catch (FileNotFoundException exc) {
                    System.err.println(exc.getMessage());
            }
        }
    }
}
