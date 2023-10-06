package ie.atu.springbootdetails;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello World!" ;
    }
    @GetMapping("/greet/{name}")
    public String greetByName(@PathVariable String name){
        String greetingMessage = "Hello, " + name + " Welcome to my World.";
            return greetingMessage;
    }
    @GetMapping("/details")
    public String details(@RequestParam String name, @RequestParam int age){
        String message = "Name: " + name + ", Age: " + age;

        return message;
    }

}
