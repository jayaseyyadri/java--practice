import java.util.Random;
import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);

        System.out.println("Hello , Let's play guess the number!");
        int userInput = scanner.nextInt();
        guess(userInput);
    }

    public static void guess(int number) {
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int upperBound = 100;
        int numberGenerated = random.nextInt(upperBound);
        int newInput=scanner.nextInt();
        System.out.println(numberGenerated);


            if (number > numberGenerated) {
                System.out.println("LOWER");
                count++;
                System.out.println("Try Again");
                guess(newInput);
            } else if (number < numberGenerated) {
                System.out.println("HIGHER");
                count++;
//                TryAgain();
                guess(newInput);
            } else {
                System.out.println("you guessed it ");
            }
    }

//    public static void TryAgain() {
//        Scanner scanner=new Scanner(System.in);
//        System.out.println("try again");
//        int newInput=scanner.nextInt();
////        guess(newInput);
//
//    }
}