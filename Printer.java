class Printer {
    int totalPages = 10;

    synchronized void printPages(int pages) throws InterruptedException {
        while (pages > totalPages) {
            wait();
        }
        totalPages -= pages;
        System.out.println(pages + " pages printed. Remaining pages: " + totalPages);
    }

    synchronized void addPages(int pages) {
        totalPages += pages;
        System.out.println(pages + " pages added. Total pages now: " + totalPages);
        notify();
    }
}