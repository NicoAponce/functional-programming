package lux.pe.na.course;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.stream.Collectors;

@SpringBootApplication
public class FunctionalProgrammingJavaApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(FunctionalProgrammingJavaApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> result = numbers.stream()
                .map(number -> number * number)
                .collect(Collectors.toList());
        System.out.println(result);
    }
}
