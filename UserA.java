public class UserA {
    int totalAmount = 50000;

    synchronized void withdraw(int amount) {
        try {
            if (amount <= totalAmount) {
                System.out.println(amount + " withdrawn by User A");
                totalAmount -= amount;
                System.out.println("Balance left " + totalAmount);
            } else {
                System.out.println("Insufficient account balance for User A");
                System.out.println("Balance left " + totalAmount);
            }
            notify();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}