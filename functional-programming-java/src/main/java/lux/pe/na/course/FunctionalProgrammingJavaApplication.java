package lux.pe.na.course;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@SpringBootApplication
public class FunctionalProgrammingJavaApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(FunctionalProgrammingJavaApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        List<User> users = new ArrayList<>();
        users.add(new User("nicolas", 16));
        users.add(new User("dyana", 17));
        users.add(new User("luis", 18));
        users.add(new User("carlos", 19));
        users.add(new User("maria", 20));
        users.add(new User("maria", 20));
        users.add(new User("maria", 20));

        users.stream().map(User::getUsername).forEach(System.out::println);
    }
}
