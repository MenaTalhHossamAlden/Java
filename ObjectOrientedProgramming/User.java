import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

// declare class as public to make it available within our entire program
public class User {
        private String name;
        private LocalDate birthDate; // reference type for storing dates in Java
        private ArrayList<Book> books = new ArrayList<Book>();

        User(String name, String birthDate) {
            this.name = name;
            this.birthDate = LocalDate.parse(birthDate);
        }

        public String getName() {
            return this.name;
        }

        public String getBirthDay() {
            return this.birthDate.toString();
        }

        public String borrowedBooks() {
            return this.books.toString();
        }

        public void borrow(Book book) {
            books.add(book);
        } 

        public int age() {
            int age = Period.between(birthDate, LocalDate.now()).getYears();

            return age;
        }

}
