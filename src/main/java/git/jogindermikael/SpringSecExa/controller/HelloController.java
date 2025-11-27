package git.jogindermikael.SpringSecExa.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/")
    public String hello(HttpServletRequest request){
        return "Welcome Joginder " + request.getSession().getId();
    }

}
