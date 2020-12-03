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
        Greet greet = (message) -> {
            System.out.println("this is not  " + message);
        };
        greet.hello("a  simulacrum");

        Greet greetTwo = message -> {
            if (message.equals("world")) {
                System.out.println("this is a classic message, Hello World");
            } else {
                System.out.println("the message is " + message);
            }
        };
        greetTwo.hello("world");

    }
}
