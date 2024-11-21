class PageAddition implements Runnable {
    Printer printer;
    int pages;

    PageAddition(Printer printer, int pages) {
        this.printer = printer;
        this.pages = pages;
    }

    @Override
    public void run() {
        printer.addPages(pages);
    }
}