package developia.az.validationtekrar;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = ValidEmailValidator.class)
@Target({ ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidEmail {
    String message() default "Email düzgün formatda deyil";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
