public class Task2 {
    public static void main(String[] args) throws InterruptedException {
        Printer printer = new Printer();
        
        Thread printJob1 = new Thread(new PrintJob(printer, 15));
        Thread pageAddition1 = new Thread(new PageAddition(printer, 5));

        printJob1.start();
        pageAddition1.start();

        printJob1.join();
        pageAddition1.join();
        
        Thread printJob2 = new Thread(new PrintJob(printer, 10));
        printJob2.start();
        printJob2.join();
    }
}


