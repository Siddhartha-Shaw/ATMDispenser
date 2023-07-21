import java.util.Scanner;

public class AtmDispenser {

    private DispenseChain obj1;

    public AtmDispenser() {

        this.obj1 = new Rupees500();
        DispenseChain obj2 = new Rupees200();
        DispenseChain obj3 = new Rupees100();
        obj1.setNextChain(obj2);
        obj2.setNextChain(obj3);
    }

    public static void main(String[] args) {
        AtmDispenser atmDispenser = new AtmDispenser();
        while (true) {
            System.out.println("Enter amount to dispense");
            Scanner input = new Scanner(System.in);
            int amount = input.nextInt();
            if (amount % 10 != 0) {
                System.out.println("Amount should be in multiple of 10s.");
                return;
            }

            atmDispenser.obj1.dispense(new Currency(amount));
        }

    }

}
