package lux.pe.na.course;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class FunctionalProgrammingJavaApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(FunctionalProgrammingJavaApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {

        List<User> users = new ArrayList<>();

        IUser iUser = User::new;

        User user1 = iUser.create("nicolas", 10);
        User user2 = iUser.create("dyana", 10);
        User user3 = iUser.create("maria", 10);
        User user4 = iUser.create("bertha", 10);
        User user5 = iUser.create("juan", 10);

        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        users.add(user5);

        users.stream().map(User::getName).forEach(System.out::println);
    }
}
