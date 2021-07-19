import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
//沒有把檔案做try的寫法下一版改進,並加強可以選擇中英文題目
public class GuessMovieName {
    public static void main(String[] args) throws FileNotFoundException {
    ArrayList<String> movieList =new ArrayList<>();

        File flie=new File("movies.txt");

        Scanner scannerFile =new Scanner(flie);
    while (scannerFile.hasNextLine()){
        movieList.add(scannerFile.nextLine());
    }
     /* MovieMethod1 movieMethod_guessMovieName =new MovieMethod1(movieList);
        for (int i = 0; i < 20; i++) {
            movieMethod_guessMovieName.guessinput();
      */
        MovieMethod1 movieMethod1 =new MovieMethod1(movieList);
        while (movieMethod1.chance>0){movieMethod1.guessinput();
            if(movieMethod1.win){break;}
            }
        if(movieMethod1.win){
            System.out.println("You Win");
        }else {
            System.out.println("You Lose");
        }

    }
}