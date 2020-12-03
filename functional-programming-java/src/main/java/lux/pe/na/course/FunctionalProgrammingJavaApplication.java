package lux.pe.na.course;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class FunctionalProgrammingJavaApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(FunctionalProgrammingJavaApplication.class, args);
    }


    List<Integer> numbers = List.of(11, 2, 12, 4, 15, 10, 9);

    public Integer imperative() {
        int count = 0;
        for (int number : numbers) {
            if (number > 10) {
                count++;
            }
        }
        System.out.println(count);
        return count;
    }

    public Long declarative() {
        Long result = numbers
                .stream()
                .filter(num -> num > 10)
                .count();
        System.out.println(result);
        return result;
    }

    @Override
    public void run(String... args) throws Exception {
        declarative();
    }
}
