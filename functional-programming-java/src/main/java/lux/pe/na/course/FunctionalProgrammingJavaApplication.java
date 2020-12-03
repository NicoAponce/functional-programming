package lux.pe.na.course;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class FunctionalProgrammingJavaApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(FunctionalProgrammingJavaApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9,10);

        Calculator calculator = new Calculator();

        list.stream()
                .map(calculator::toCube)
                .forEach(System.out::println);
    }


}
