// Write a Java program to insert an element into the array list at the first position.

import java.util.ArrayList;

public class ArrayListInsert {
    // Method insert first position
    public static void insertAtFirstPosition(ArrayList<String> list, String element) {
        list.add(0, element);
    }

    public static void main(String[] args) {
        ArrayList<String> colours = new ArrayList<>();
        colours.add("Purple");
        colours.add("Green");
        colours.add("Red");

        System.out.println(colours);
        insertAtFirstPosition(colours, "Blue");
        System.out.println(colours);
    }
}
