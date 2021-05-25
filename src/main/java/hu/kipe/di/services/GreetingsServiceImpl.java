package hu.kipe.di.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingsServiceImpl implements GreetingsService {
    @Override
    public String sayHello() {
        System.out.println("Helló, halló...");
        return "Szia";
    }
}
