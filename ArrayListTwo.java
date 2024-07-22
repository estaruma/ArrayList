// Write a Java program to iterate through all elements in an array list.

import java.util.ArrayList;

public class ArrayListTwo {
    public static void main(String[] args) {
        ArrayList<String> colours = new ArrayList<>();
        colours.add("Purple");
        colours.add("Green");
        colours.add("Red");


        // Iterate through the ArrayList
        for (String colour : colours) {
            System.out.println(colour);
        }

        // Iterate through the ArrayList using a for loop
        for (int i = 0; i < colours.size(); i++) {
            System.out.println(colours.get(i));
        }
    }

    // Method
    public static ArrayList<String> getColoursList() {
        ArrayList<String> colours = new ArrayList<>();
        colours.add("Purple");
        colours.add("Green");
        colours.add("Red");
        return colours;
    }
}

