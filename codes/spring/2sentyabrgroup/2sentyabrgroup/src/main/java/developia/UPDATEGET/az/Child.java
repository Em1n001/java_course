package developia.UPDATEGET.az;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class Child {
    private Long id;

    @NotBlank(message = "Ad boş ola bilmez")
    @Size(min = 2, message = "Ad en azı 2 simvol olmalıdır")
    private String name;

    @Min(value = 18, message = "Yas 18-den az ola bilmez")
    private int age;

     public Child(Long id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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
