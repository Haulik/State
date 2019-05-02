public class ATMMachine {

    ATMState hasCard;
    ATMState noCard;
    ATMState hasCorrectPin;
    ATMState atmOutOfMoney;


    // LOCAL OBJECT, HOLDES WHAT STATE IT CURRENTLY IS IN
    ATMState atmState;

    int cashInMachine = 2000;
    boolean correctPinEntered = false;

    public ATMMachine(){

        hasCard = new HasCard(this);
        noCard = new NoCard(this);
        hasCorrectPin = new HasPin(this);
        atmOutOfMoney = new NoCash(this);

        atmState = noCard;

        if(cashInMachine < 0){
            atmState = atmOutOfMoney;
        }


    }
    void setATMState(ATMState newATMState){
        atmState = newATMState;
    }

    public void setCashInMachine(int newCashInMachine){
        cashInMachine = newCashInMachine;
    }

    public void insertCard(){
        /*
        tænk på det som der står:

        noCard.insertCard();
        hasCorrectPin.insertCard();

        det samme gælder for de næste 3 metoder
         */
        atmState.insertCard();
    }

    public void ejectCard(){
        atmState.ejectCard();
    }

    public void requestCash(int cashToWithdraw){
        atmState.requestCash(cashToWithdraw);
    }

    public void insertPin(int PinEntered){
        atmState.insertPin(PinEntered);
    }

    public ATMState getYesCardState() { System.out.println("is in has card state");return hasCard;}
    public ATMState getNoCardState() {System.out.println("is in no card state"); return noCard;}
    public ATMState getHasPin() {System.out.println("is in has pin state"); return hasCorrectPin;}
    public ATMState getNoCashState() {System.out.println("is in no cash state"); return atmOutOfMoney;}
}
