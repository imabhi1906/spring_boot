package net.engineeringdigest.journalApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyClass {

    @GetMapping("123")
    public String sayHello(){
        System.out.println("hello bro");
        return ("Hello Buddy");
    }
}

