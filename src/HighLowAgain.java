import java.util.Scanner;

public class HighLowAgain {
    public static void main(String[] args) {
        int randomNumber=(int)(Math.random()*99+1);
        Scanner scanner=new Scanner(System.in);
        System.out.println("let's play guess !");

        System.out.println(randomNumber);
        int userInput;
        int count=0 ;

        do{
            System.out.println("enter a number");
            userInput=(scanner.nextInt());
            if(userInput<0 || userInput>100){
                break;
            } else if (userInput == randomNumber) {
                System.out.println("you guessed it!");
                System.out.println("you tried:"+count);
            } else if (userInput > randomNumber) {
                System.out.println("LOWER");
                System.out.println("try again");
                count++;
            } else if (userInput < randomNumber) {
                System.out.println("HIGHER");
                System.out.println("try again");
                count++;
            }
        }while(count <5);

    }
}
