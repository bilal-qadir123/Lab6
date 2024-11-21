class PrintJob implements Runnable {
    Printer printer;
    int pages;

    PrintJob(Printer printer, int pages) {
        this.printer = printer;
        this.pages = pages;
    }

    @Override
    public void run() {
        try {
            printer.printPages(pages);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}