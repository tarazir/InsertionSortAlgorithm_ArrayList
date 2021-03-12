// Programmer: Mr. Tarazi, ASK HS Technology Teacher
// Date: Friday, March 12th, 2021
// Objective: Insertion Sort Algorithm using ArrayList

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // Define an ArrayList of Integers -> -1, 55, 21, -25, 35, -10 by adding them to the ArrayList
        ArrayList<Integer> theList = new ArrayList<>();
        theList.add(-1);
        theList.add(55);
        theList.add(21);
        theList.add(-25);
        theList.add(35);
        theList.add(-10);
        System.out.print("Original ArrayList values -> ");
        // Print the ArrayList content
        print(theList);
        System.out.print("Sorted ArrayList values -> ");
        // Call Insertion Sort Algorithm
        insertionSort(theList);
        // Print the Arralist content after sorting
        print(theList);
    }

    // Static method to print the ArrayList
    public static void print(ArrayList<Integer> theList) {
        for (Integer num : theList) {
            System.out.print(num + " ");
        }
        System.out.print("\n");
    }

    // Insertion Sort Algorithm using ArrayList
    public static void insertionSort(ArrayList<Integer> theList) {
        for (int firstUnsortedIndex = 1; firstUnsortedIndex < theList.size(); firstUnsortedIndex++) {
            int newElement = theList.get(firstUnsortedIndex);
            int i;
            for (i=firstUnsortedIndex; i>0 && theList.get(i-1) > newElement; i--){
                theList.set(i,theList.get(i-1));
            }
            theList.set(i, newElement);
        }
    }
}
