//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        IcCard myCard = new IcCard();
        myCard.number = "D111";
        myCard.balance = 100;
        myCard.printInfo();

        int newBalance = myCard.add(100);
        System.out.println("New balance after adding 100: " + newBalance);
        System.out.println("Current balance: " + myCard.balance);

//        IcCard yourCard = new IcCard();
//        yourCard.number = "D222";
//        yourCard.balance = 300;
//        yourCard.printInfo();
//
//        yourCard = myCard;
//        yourCard.printInfo();
//
//        yourCard.number = "D333";
//        yourCard.balance = 1000;
//        myCard.printInfo();
//        yourCard.printInfo();


    }
}