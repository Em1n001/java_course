package developia.az.config;

 

import com.example.di.ApplicationContext;

import developia.az.CommandLineRunner;
import developia.az.SpringApplication;
import developia.az.config.Computer;
import developia.az.config.SpringBootApplication;

@SpringBootApplication
public class MainApplication implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }

    @Override
    public void run(String... args) {
        ApplicationContext context = new ApplicationContext();
        Computer computer = ((Object) context).getBean(Computer.class);
        computer.printComputerInfo();
    }
}
