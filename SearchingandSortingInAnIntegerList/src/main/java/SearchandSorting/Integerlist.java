package SearchandSorting;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS S410UN
 */
import SearchandSorting.IntegerListTest;
import static SearchandSorting.IntegerListTest.scan;
import java.util.Scanner;

public class Integerlist {

    int[] list; //values in the list
//-------------------------------------------------------
//create a list of the given size
//-------------------------------------------------------

    public Integerlist(int size) {
        list = new int[size];
    }
//-------------------------------------------------------
//fill array with integers between 1 and 100, inclusive
//-------------------------------------------------------

    public void randomize() {
        for (int i = 0; i < list.length; i++) {
            list[i] = (int) (Math.random() * 100) + 1;
        }
    }
//-------------------------------------------------------
//print array elements with indices
//-------------------------------------------------------

    public void print() {
        for (int i = 0; i < list.length; i++) {
            System.out.println(i + ":\t" + list[i]);
        }
    }
//-------------------------------------------------------
//return the index of the first occurrence of target in the list.
//return -1 if target does not appear in the list
//-------------------------------------------------------

    public int search(int target) {
        int location = -1;
        for (int i = 0; i < list.length && location == -1; i++) {
            if (list[i] == target) {
                location = i;
            }
        }
        return location;
    }
//-------------------------------------------------------
//sort the list into ascending order using the selection sort algorithm
//-------------------------------------------------------

    public void selectionSort() {
        int minIndex;
        for (int i = 0; i < list.length - 1; i++) {
//find smallest element in list starting at location i
            minIndex = i;
            for (int j = i + 1; j < list.length; j++) {
                if (list[j] < list[minIndex]) {
                    minIndex = j;
                }
            }
//swap list[i] with smallest element
            int temp = list[i];
            list[i] = list[minIndex];
            list[minIndex] = temp;
        }
    }
    public void replaceFirst(int oldVal, int newVal){
        int listPosition = search(oldVal);
        if (listPosition != -1) {
            list[listPosition] = newVal;
        }
    }
    void replaceAll(){
        for(int i = 0; i < list.length; i++){
            System.out.println("Enter the new value for list no " + i + ":");                    
            list[i] = scan.nextInt();            
        }
    }
   void sortDecreasing(){
        int maxIndex;
        for(int i = 0; i < list.length - 1; i++){
            //find biggest element in list starting at location i
            maxIndex = i;
            for(int j = i + 1; j < list.length; j++){
                if(list[j] > list[maxIndex]){
                    maxIndex = j;
                }
            }
            
            //swap list[i] with biggest element
            int temp = list[i];
            list[i] = list[maxIndex];
            list[maxIndex] = temp;
        }
    }
   int binarySearch(int target){
        int min = 0, max = list.length-1, mid = 0, location = -1;
        while(location == -1 && min <= max){
            mid = (min + max) / 2;
            if(target == list[mid])
                location = mid;
            else{
                if (target > list[mid])
                    max = mid - 1;
                else
                    min = mid + 1;
            }
        }
        return location;
    }
}
