import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class MovieMethod1   {
    String moive ;
    boolean [] moiveBoolean;//對應 moiveWorld
    boolean guseetrue;
    char[] moiveWorld;
    int chance ;
    boolean win ;
    //String[]moiveWorld1;
    ArrayList<Character> arleadyGuessWorld =new ArrayList<>();

    MovieMethod1(ArrayList<String> movieList){//進來的時候就要有string 電影列表了
    int randomMovieIndex = (int)(Math.random()*movieList.size());
        //System.out.println((int)(Math.random()*movieList.size()));
        moive = movieList.get(randomMovieIndex);
        //System.out.println(moive);匯出電影名
        moiveWorld =moive.toCharArray();
        //moiveWorld1= moive.split("");
        moiveBoolean = new boolean [moiveWorld.length];
        chance =10;
    }

    public void guessinput()  {// play guess game
        guseetrue =false;//有此判對是否該進行減少機會

        //char enterworld = 0;
        System.out.println("Gust Moive name");
        System.out.println("Place Type The Chart ");
        Scanner scanner =new Scanner(System.in);
        String enter=scanner.nextLine();
        String showWold ="";
        if(enter.toCharArray().length==1){
            win =true;//輸入正確的字元才有判斷的意義，假設初始為trun沒有match到字元為false
            char []guessworld = enter.toCharArray();
            for (int i = 0; i < moiveWorld.length; i++) {
                if(guessworld[0]==moiveWorld[i]){
                    moiveBoolean[i]=true;
                    guseetrue =true; }
            }
            if(!guseetrue){
                chance=chance-1;
                arleadyGuessWorld.add(enter.toCharArray()[0]);
            }
            for (int i = 0; i <moiveWorld.length ; i++) {
                if (moiveBoolean[i]) {
                    showWold += moiveWorld[i];
                } else {
                    showWold += "_";
                }
            }
            for (int i = 0; i < moiveBoolean.length ; i++) {
                if(!moiveBoolean[i]){win=false;break;}
            }
            System.out.println(showWold);
            if(arleadyGuessWorld.size()>0){
                String eorrWorld;
                System.out.println("You Already Guess"+arleadyGuessWorld);}
            System.out.println("You have"+chance+" Cance ,Place Enter The Chart");

        }else if(enter.toCharArray().length==0){
            System.out.println("請勿輸入空白");
        }else {
            System.out.println("請輸入單字元非多個字元");
        }
    }
}