package lux.pe.na.course;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@SpringBootApplication
public class FunctionalProgrammingJavaApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(FunctionalProgrammingJavaApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        List<Book> books = new ArrayList<>();
        books.add(new Book("Harry Potter", 400));
        books.add(new Book("Hobbit", 130));
        books.add(new Book("Dracula", 101));
        books.add(new Book("Memo", 190));
        books.add(new Book("Zoe", 10));

        Comparator<Book> comparator = Comparator.comparing(book -> book.getCopies());
        books.stream()
                .sorted(comparator.reversed())
                .limit(3)
                .forEach(book -> System.out.println(book));
    }
}
