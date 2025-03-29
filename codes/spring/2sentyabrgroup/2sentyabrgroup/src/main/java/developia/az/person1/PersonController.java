package developia.az.person1;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import ch.qos.logback.core.model.Model;

@Controller
public class PersonController {

    @GetMapping("/persons")
    public String getPersons(Model model) {
        List<Person> persons = Arrays.asList(
                new Person(1, "Emin", 25, "Bakı"),
                new Person(2, "Alex", 30, "London"),
                new Person(3, "Junior", 28, "Brazil")
        );

        ((Object) model).addAttribute("persons", persons);
        return "persons";
    }
}
