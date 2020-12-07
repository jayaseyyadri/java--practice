import java.util.Scanner;

public class factorial {

    public static void main(String[] args) {
        factorial();
    }

    public static void factorial() {
        Scanner userInput = new Scanner(System.in);
        boolean keepGoing = true;
        long fact = 1;
        do {
            System.out.println("enter an integer from 1 to 10");
             String input = userInput.next();
               if(input.equals("no"))
               {
                   break;
               }
            long number=Long.parseLong(input);
                if (number < 1 || number > 10 ) {
                    System.out.println("Enter a valid number please");
                } else {
                    for (long i = 1; i <= number; i++) {
                        fact = fact * i;
                    }
                    System.out.println(fact);
                    fact=1;

                }
        } while (keepGoing);

    }
}
// whatever number i input i need to keep calculating  the multiples all the way till 1
//  so lets say i input 2 i need 2 *1 ,3=3*2*1,4=4*3**2*1,5=5*4*3*2*1