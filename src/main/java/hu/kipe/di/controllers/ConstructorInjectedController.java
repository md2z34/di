package hu.kipe.di.controllers;

import hu.kipe.di.services.GreetingsService;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {
    private GreetingsService greetingsService;

    public ConstructorInjectedController(GreetingsService greetingsService) {
        this.greetingsService = greetingsService;
    }

    public String getGreetings() {
        return greetingsService.sayHello();
    }
}
