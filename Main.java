public class Main {
    public static void main(String[] args) throws InterruptedException {
        UserA user1 = new UserA();
        UserB user2 = new UserB();
        Thread u1 = new Thread(() -> user1.withdraw(45000));
        Thread u2 = new Thread(() -> user2.withdraw(20000));

        u1.start();
        u2.start();

        // Wait for both threads to finish
        synchronized (user1) {
            user1.wait();  // Wait for user1 to finish
        }

        synchronized (user2) {
            user2.wait();  // Wait for user2 to finish
        }

        System.out.println("Total amount withdrawn: " + (45000 + 20000) + " Rs.");
    }
}
