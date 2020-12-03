package lux.pe.na.course;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
public class FunctionalProgrammingJavaApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(FunctionalProgrammingJavaApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        List<String> user1 = Arrays.asList("nicolas", "dyana");
        List<String> user2 = Arrays.asList("maria", "pedro");
        List<String> user3 = Arrays.asList("juan", "bertha");

        List<String> result = Stream.of(user1, user2, user3)
                .flatMap(value -> value.stream())
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
