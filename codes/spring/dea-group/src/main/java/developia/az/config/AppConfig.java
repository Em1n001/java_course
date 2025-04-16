package developia.az.config;

import org.springframework.context.annotation.Bean;

@Configuration
public class AppConfig {
    @Bean(destroyMethod = "", initMethod = "")
    public Computer getComputer() {
        return new Computer();
    }
}
