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
        users.add(new User("nicolas", 16));
        users.add(new User("dyana", 17));
        users.add(new User("luis", 18));
        users.add(new User("carlos", 19));
        users.add(new User("maria", 20));
        users.add(new User("maria", 20));
        users.add(new User("maria", 20));

        //TODO: Imperative
        int count = 0;
        for (User user : users) {
            if (user.getAge() > 18) {
                count++;
            }
        }
        System.out.println("users over 18 years old are " + count);


        //TODO: Declarative
        count= (int) users.stream().filter(user -> user.getAge()>18).count();
        System.out.println(count);
    }
}
