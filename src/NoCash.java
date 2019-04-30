public class NoCash implements ATMState {

    ATMMachine atmMachine;

    public NoCash(ATMMachine newATMMachine){

        atmMachine = newATMMachine;
    }

    @Override
    public void insertCard() {

        System.out.println("We are broke, we don't have money");

    }

    @Override
    public void ejectCard() {

        System.out.println("We are broke, we don't have money AND you didn't even enter a card");

    }

    @Override
    public void insertPin(int pinEntered) {

        System.out.println("We are broke, we don't have money");

    }

    @Override
    public void requestCash(int cashToWithdraw) {

        System.out.println("We are broke, we don't have money");

    }
}
