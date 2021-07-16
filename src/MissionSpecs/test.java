package MissionSpecs;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {

        System.out.println(loadItems("phase-11.txt"));
    }
    public static ArrayList<Item> loadItems(String filename) {
        ArrayList<Item> items = new ArrayList<>();
        File file = new File(filename);

        try {
            Scanner in = new Scanner(file);

            while (in.hasNextLine()) {
                String line = in.nextLine();
                int index = line.indexOf("=");
                String name = line.substring(0, index);
                double weight = Double.parseDouble(line.substring(index + 1));
                Item item = new Item(name, weight);
                items.add(item);
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("ERROR: File " + filename + " not found!");
        }

        return items;
    }

}