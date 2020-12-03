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
        IData data = (val1, val2) -> val1 + val2;
        int result = data.sum(3, 4);
        System.out.println(result);

        data = (val1, val2) -> {
            int res = val1 + val2;
            System.out.println("the result is: " + res);
            return res;
        };
        data.sum(100, 1);
    }
}
