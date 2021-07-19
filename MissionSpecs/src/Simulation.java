
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
/*
loadItems: this method loads all items from a text file and returns an ArrayList of Items:
Each line in the text file consists of the item name followed by = then its weigh in kg. For example:

habitat=100000
colony=50000
food=50000
loadItems should read the text file line by line and create an
Item object for each and then add it to an ArrayList of Items.
 The method should then return that ArrayList.



loadU1: this method takes the ArrayList of
Items returned from loadItems and starts creating U1 rockets.
It first tries to fill up 1 rocket with as many items as possible before creating
a new rocket object and filling that one until all items are loaded.
The method then returns the ArrayList of those U1 rockets that are fully loaded.

loadU2: this method also takes the ArrayList of Items and starts
creating U2 rockets and filling them with those items the same way as with U1 until all items are loaded.
 The method then returns the ArrayList of those U2 rockets that are fully loaded.

runSimulation: this method takes an ArrayList of Rockets and calls launch and land methods
for each of the rockets in the ArrayList. Every time a rocket explodes or crashes
(i.e if launch or land return false) it will have to send that rocket again.
 All while keeping track of the total budget required to send each rocket safely to Mars.
 runSimulation then returns the total budget required to send all rockets (including the crashed ones).

 */
public  class Simulation {
    ArrayList<Item> items;
    public Simulation(){
        items =loadItems("phase-1.txt");
    }
    public static void main(String[] args) {
        System.out.println();
    }
    public static   ArrayList<Item> loadItems(String fileName){//items from a text file and returns an ArrayList of Items:
        ArrayList<Item> items =new ArrayList<Item>();
        //Scanner scannerkey =new Scanner(System.in);
        File file =new File(fileName);
        try {
        Scanner fileScanner = new Scanner(file);
        while (fileScanner.hasNextLine()){
            String line = fileScanner.nextLine();
            int index = line.indexOf("=");
            String itemName=line.substring(0,index);
            double itemWeight=Double.parseDouble(line.substring(index+1));
            items.add(new Item(itemName,itemWeight));
        }

        }catch (FileNotFoundException e){
            System.out.println("It is found "+ fileName +"in the folder \nmodule need put project` src folder");
        }
        return items;
    }


    public ArrayList<Rocket> loadU1(ArrayList<Item> items){//takes the ArrayList of Items
/*
It first tries to fill up 1 rocket with as many items as possible before creating
a "new rocket object" and "filling that one until all items are loaded".//先裝上物品
The method then returns the ArrayList of those U1 rockets that are fully loaded.
 */
        ArrayList<Rocket> rockets =new ArrayList<>();
        rockets.add(new U1());
        int i =0;
        while ( items.size()>0) {
            if(rockets.get(i).canCarry(items.get(0))){
                rockets.get(i).carry(items.remove(0));
            }else //full /cancary ==false
            {i++;//ArrayList<Rocket> rockets index;
                rockets.add(new U1());
                //System.out.println(rockets.get(i).cargoWight());//canot display  arraylist<Item> form arraylist<Rocket>
            }
        }

        return rockets;
    }
    public ArrayList<Rocket> loadU2(ArrayList<Item> items){//takes the ArrayList of Items
        ArrayList<Rocket> rockets =new ArrayList<>();
        rockets.add(new U2());
        int i =0;
        while ( items.size()>0) {
            if(rockets.get(i).canCarry(items.get(0))){
                rockets.get(i).carry(items.remove(0));
            }else //full /cancary ==false
            {i++;//ArrayList<Rocket> rockets index;
                rockets.add(new U2());
            }
        }

        return rockets;
    }
    public int runSimulation(ArrayList<Rocket> rocket){//takes an ArrayList of Rockets
        //calls launch and land methods for each of the rockets in the ArrayList
        //Every time a rocket explodes or crashes
        //(i.e if launch or land return false) it will have to send that rocket again.
        //runSimulation then returns the total budget required to send all rockets (including the crashed ones).
        int budget =0;
        for (int i = 0; i < rocket.size(); i++) {//test how many shoot
            while (!(rocket.get(i).land() && rocket.get(i).launch()))
            {
                rocket.get(i).countAdd();
            }
        }
        /*
        //count how much money;foot all Arraylist<Rocket>;

        for (int i = 0; i < rocket.size(); i++) {
            System.out.println("第"+(i+1)+"號火箭：\n發射"+rocket.get(i).getCount()+"次  花費為："+
                    rocket.get(i).getCount()*rocket.get(i).getCost());//shoot detail
            }

         */
        return rocket.get(0).getCost()*Rocket.getRocketCount();
    }
}