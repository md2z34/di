package hu.kipe.di.controllers;

import hu.kipe.di.services.GreetingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {
    @Autowired
    public GreetingsService greetingsService;

    public String getGreeting() {
        return greetingsService.sayHello();
    }
}
