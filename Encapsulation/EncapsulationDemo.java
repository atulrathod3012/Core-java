package Encapsulation;
// encapsulation with private fields + getters/setters
public class EncapsulationDemo {
    private int balance;

    public void deposit(int amt) {
        if (amt > 0) balance += amt;
    }

    public int getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        EncapsulationDemo e = new EncapsulationDemo();
        e.deposit(200);
        System.out.println(e.getBalance());
    }
}

