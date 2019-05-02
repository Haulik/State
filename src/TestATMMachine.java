import java.util.Scanner;

public class TestATMMachine {

    public static void main(String[] args) {



                ATMMachine atmMachine = new ATMMachine();


        String go;
        Scanner scanner = new Scanner(System.in);
        System.out.println("ATM machine is in the \"no card state\"\n");
        go = scanner.nextLine();
        System.out.println("We insert a card in the machine..\n");


                atmMachine.insertCard();


        System.out.println("We try to call the same method again just to see what happens...\n");
        go = scanner.nextLine();



                atmMachine.insertCard();



        System.out.println("The state has changed, so now the response is a bit diffrent\nNow lets try to eject the card");
        System.out.println();
        go = scanner.nextLine();


                atmMachine.ejectCard();


        System.out.println("Tada, we're back to scratch, now lets set the card in again...");
        System.out.println();
        go = scanner.nextLine();


                atmMachine.insertCard();


        System.out.println("Ok, back on track, now lets enter our pin");
        System.out.println();
        go = scanner.nextLine();


                atmMachine.insertPin(1234);


        System.out.println();
        go = scanner.nextLine();


                atmMachine.requestCash(2000);


        System.out.println();
        go = scanner.nextLine();


                atmMachine.insertCard();


        System.out.println();
        go = scanner.nextLine();


                atmMachine.insertPin(1234);


    }
}
