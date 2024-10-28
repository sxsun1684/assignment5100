package part2;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Initiate an ArrayList that contain 5 names
 * Switch the first and last letters in each name in the ArrayList. Do not forget that each name begins with a capital letter, but the other letters are lowercase. The names with switched letters should follow the same rule as there are new names.
 * Organize a nice-looking output to the terminal that looks like the following:
 * Names = { list of names here separated by coma }
 * Names (switched) = { list of names with switched first and last letters here separated by coma }
 */

public class part2 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Hello", "Sakamoto", "Tom", "Jerry", "Ryan"));

        // Create a new list with switched first and last letters
        ArrayList<String> switchedNames = new ArrayList<>();
        for (String name : names) {
            switchedNames.add(switchName(name));
        }

        // Print original and switched names
        System.out.println("Names = " + listToString(names));
        System.out.println("Names (switched) = " + listToString(switchedNames));
    }

    // Method to switch the first and last letters of a name
    public static String switchName(String name) {
        if (name.length() <= 1) {
            return name;
        }
        char firstLetter = Character.toLowerCase(name.charAt(0));
        char lastLetter = Character.toUpperCase(name.charAt(name.length() - 1));
        String middleLetter = name.substring(1, name.length() - 1).toLowerCase();
        return lastLetter + middleLetter + firstLetter;
    }

    // Helper method to convert ArrayList to a comma-separated string
    public static String listToString(ArrayList<String> list) {
        String str = "{ ";
        for (int i = 0; i < list.size(); i++) {
            str += list.get(i);
            if (i < list.size() - 1) {
                str += ", ";
            }
        }
        str += " }";
        return str;
    }
}
