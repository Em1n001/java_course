package developia.az.config;

import developia.az.Bean;

@Configuration
public class AppConfig {
    @Bean(destroyMethod = "", initMethod = "")
    public Computer getComputer() {
        return new Computer();
    }
}
