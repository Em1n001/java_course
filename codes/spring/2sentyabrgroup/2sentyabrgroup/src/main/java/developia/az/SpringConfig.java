package developia.az;

@ComponentScan("com.example.springhome")
public class SpringConfig {
    
    @Bean(initMethod = "init", destroyMethod = "destroy")
    public Home home() {
        return new Home();
    }
}

