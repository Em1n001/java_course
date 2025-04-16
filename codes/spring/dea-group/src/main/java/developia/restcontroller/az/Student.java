package developia.restcontroller.az;

public class Student {
    private boolean id;
    private String name;
    private int age;

    public Student(int id2, String name2, int age2) {
 	}

     public boolean getId() {
        return id;
    }

    public void setId(boolean id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}