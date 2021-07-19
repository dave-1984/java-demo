

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Simulation u1 =new Simulation();
        ArrayList<Item> u1filePhase_1 = u1.loadItems("phase-1.txt");
        ArrayList<Rocket> u1Rocket_p1= u1.loadU1(u1filePhase_1);
        long u1money =u1.runSimulation(u1Rocket_p1);
        ArrayList<Item> u1filePhase_2 = u1.loadItems("phase-2.txt");
        ArrayList<Rocket> u1Rocket_P2= u1.loadU1(u1filePhase_2);
        long u1money_p2 =u1.runSimulation(u1Rocket_P2);


        System.out.println("###########  U1 Rocket ######################");
        if(u1money>=1000){
            System.out.println("u1 Rocket cost for phase-1 $"+(double)u1money/1000+" Billion");
        }else {
            System.out.println("u1 Rocket cost for phase-1 $"+u1money+" million");
        }
        System.out.println("u1 Rocket  cost for phase- $"+NumberFormat.getNumberInstance().format(u1money*1000000));
        if(u1money_p2>=1000) {
            System.out.println("u1 Rocket cost for phase-2 $" + (double)u1money_p2 / 1000 + " Billion");
        }else{
            System.out.println("u1 Rocket cost for phase-2 $"+u1money_p2+" million");}
        System.out.println("u1 Rocket cost for phase-2 $"+NumberFormat.getNumberInstance().format(u1money_p2*1000000));
        if(u1money+u1money_p2>=1000){
            System.out.println("u1 Rocket total cost $" + (double)(u1money_p2+u1money) / 1000 + " Billion");
        }else{
            System.out.println("u1 Rocket total cost $"+(u1money_p2+u1money)+" million");}
        System.out.println("u1 Rocket total cost $"+NumberFormat.getNumberInstance().format((u1money_p2+u1money)*1000000));
//https://www.itread01.com/content/1543477082.html

        ArrayList<Item> u2filePhase_1 = u1.loadItems("phase-1.txt");
        ArrayList<Rocket> u2Rocket_p1= u1.loadU2(u2filePhase_1);
        long u2money =u1.runSimulation(u2Rocket_p1);
        ArrayList<Item> u2filePhase_2 = u1.loadItems("phase-2.txt");
        ArrayList<Rocket> u2Rocket_P2= u1.loadU2(u2filePhase_2);
        long u2money_p2 =u1.runSimulation(u2Rocket_P2);
        System.out.println("###########  U2 Rocket ######################");
        if(u2money>=1000){
            System.out.println("u2 Rocket cost for phase-1 $"+(double)u2money/1000+" Billion");
        }else {
            System.out.println("u2 Rocket cost for phase-1 $"+u2money+" million");
        }
        System.out.println("u2 Rocket cost for phase-1 $"+NumberFormat.getInstance(Locale.US).format((u2money)*1000000));
        if(u2money_p2>=1000) {
            System.out.println("u2 Rocket cost for phase-2 $" + (double)u2money_p2 / 1000 + " Billion");
        }else{
            System.out.println("u2 Rocket cost for phase-2 $"+u2money_p2+" million");}
        System.out.println("u2 Rocket cost for phase-2 $"+NumberFormat.getInstance(Locale.US).format((u2money_p2)*1000000));
        if(u2money+u2money_p2>=1000){
            System.out.println("u2 Rocket total cost $" + (double)(u2money_p2+u2money) / 1000 + " Billion");
        }else{
            System.out.println("u2 Rocket total cost $"+(u2money_p2+u2money)+" million");}
        System.out.println("u2 Rocket total cost $"+NumberFormat.getInstance(Locale.US).format((u2money_p2+u2money)*1000000));



    }
}