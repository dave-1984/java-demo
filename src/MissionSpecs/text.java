package MissionSpecs;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class  text  {
    public static void main(String[] args)  {
        ArrayList<Item> items =new ArrayList<Item>();
        Scanner scannerkey =new Scanner(System.in);//key is mean , using key method for keyboard;
        String filename=scannerkey.next();
        File file =new File(filename);//get file .need location
        try {//it have it donot have throws Exception
            Scanner scannerFile = new Scanner(file);//scanner content and useing Scanner transform
            ;//key is mean , using key method for file;
            while (scannerFile.hasNext()) {
                String line = scannerFile.nextLine();
                int cutNumber = line.indexOf("=");
                String itemName = line.substring(0, cutNumber);
                double itemWeight = Double.parseDouble(line.substring(cutNumber + 1));
                items.add(new Item(itemName, itemWeight));
            }
        }catch (FileNotFoundException e){
            System.out.println("It can not find \""+filename+"\" in the project Folder");
        }
            System.out.println(items);

        }
    }
