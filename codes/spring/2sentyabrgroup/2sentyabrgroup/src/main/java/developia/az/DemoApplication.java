package developia.az;

public class DemoApplication implements CommandLineRunner {

    private final ApplicationContext context;

    public DemoApplication(ApplicationContext context) {
        this.context = context;
    }

    public static void main(String[] args) {
    	ConfigurableApplicationContext r = SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) {
        
        Book book = context.getBean(Book.class);
        System.out.println(book.toString()); 
    }
}
