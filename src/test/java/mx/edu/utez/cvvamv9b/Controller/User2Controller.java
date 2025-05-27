package mx.edu.utez.cvvamv9b.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user2")
public class User2Controller {
    @GetMapping("")
    public String getMessage() {
        return "Hello from User2Controller!";
    }
}
