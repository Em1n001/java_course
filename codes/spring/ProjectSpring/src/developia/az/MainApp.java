package developia.az;

public class MainApp {
    public static void main(String[] args) {
         AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

         Home home1 = context.getBean(Home.class);
        Home home2 = context.getBean(Home.class);

         System.out.println("Home1 hash: " + home1.hashCode());
        System.out.println("Home2 hash: " + home2.hashCode());

         context.close();
    }
}
