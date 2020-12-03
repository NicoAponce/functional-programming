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


    @Override
    public void run(String... args) throws Exception {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);

        //TODO: Sum
        int sum = numbers.stream().mapToInt(num -> num).sum();
        System.out.println(sum);

        //TODO: Average
        double average = numbers.stream().mapToInt(num -> num).average().orElse(0);
        System.out.println(average);

        //TODO: Min
        int min = numbers.stream().mapToInt(num -> num).min().getAsInt();
        System.out.println(min);

        //TODO: Max
        int max = numbers.stream().mapToInt(num -> num).max().getAsInt();
        System.out.println(max);
    }
}
