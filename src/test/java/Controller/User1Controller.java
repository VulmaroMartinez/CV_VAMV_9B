package Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user1")
@CrossOrigin(origins = "*")
public class User1Controller {
    @GetMapping("")
    public String getMessage(){
        return "Hello from User1Controller!";
    }
}
