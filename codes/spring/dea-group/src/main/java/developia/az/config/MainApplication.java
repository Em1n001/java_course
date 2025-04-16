package developia.az.config;

 

import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;

import developia.az.config.Computer;
import developia.az.config.SpringBootApplication;

@SpringBootApplication
public class MainApplication implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }

    @Override
    public void run(String... args) {
        
        BeanFactory context = null;
		Computer computer = ((BeanFactory) context).getBean(Computer.class);
        computer.printComputerInfo();
    }
}
