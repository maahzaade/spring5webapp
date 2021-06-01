package guru.springframework.sfgdi.services;/*
 * Created by Mahdiye on 2021, May, 28
 */

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World! -- Constructor";
    }
}
