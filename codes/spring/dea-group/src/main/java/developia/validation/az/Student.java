package developia.validation.az;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class Student {
    @NotBlank(message = "Ad bos ola bilmez")
    @Size(min = 2, message = "Ad en azı 2 simvol olmalıdır")
    private String name;

    @Min(value = 18, message = "Yas 18-dən az ola bilmez")
    private int age;

}
