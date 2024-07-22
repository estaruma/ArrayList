// Write a Java program to create an array list, add some colors (strings) and print out the collection.

import java.util.ArrayList;

public class ColourList {
    public static void main(String[] args) {
        ColourList colourList = new ColourList();
        ArrayList<String> colours = colourList.createColourList();

        for (String colour : colours) {
            System.out.println(colour);
        }
    }

    // Method to create and return color list
    public ArrayList<String> createColourList() {
        ArrayList<String> colours = new ArrayList<>();
        colours.add("Purple");
        colours.add("Green");
        colours.add("Red");
        return colours;
    }
}
