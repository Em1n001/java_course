package developia.DTO.az;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class StudentDTO {
    @NotBlank(message = "Ad boş ola bilməz")
    @Size(min = 2, message = "Ad ən azı 2 simvol olmalıdır")
    private String name;

    @Min(value = 18, message = "Yaş 18-dən az ola bilməz")
    private int age;

     public StudentDTO(String name, int age) {
        this.name = name;
        this.age = age;
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
