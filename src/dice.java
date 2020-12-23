
import java.util.Scanner;
public class dice {

    public static void main(String[] args) {
sides();
    }
    public static void sides(){
        Scanner scanner =new Scanner(System.in);
       int random=(int)(Math.random()*2+6);
        System.out.println("enter the number of sides for a pair of dice!");
        int sidesDice1 = scanner.nextInt();
        int sidesDice2 = scanner.nextInt();
        System.out.println("Let's roll the dice !");
        System.out.printf("you rolled %d",random );
    }
}
/* a dice has 6 sides max and 2 sides min
 */