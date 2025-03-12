package developia.az.config1;

import com.example.di.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

        Home home1 = context.getBean(Home.class);
        System.out.println("First Home instance: " + home1);

        Home home2 = context.getBean(Home.class);
        System.out.println("Second Home instance: " + home2);

        context.close();
    }
}
