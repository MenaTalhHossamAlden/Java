public class Main {
    public static void main(String[] args) {
        Book carmilla = new Book("Carmilla", "Sheridan Le Fanu", 270);
        AudioBook dracula = new AudioBook("Dracula", "Bram Stoker", 30000);
        EBook jeeves = new EBook("Carry On Jeeves", "P. G. Wodehouse", 280, "PDF");

        System.out.println(jeeves.toString());
    }
}