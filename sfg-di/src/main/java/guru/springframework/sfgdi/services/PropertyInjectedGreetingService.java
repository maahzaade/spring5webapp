package guru.springframework.sfgdi.services;/*
 * Created by Mahdiye on 2021, Jun, 01
 */

import org.springframework.stereotype.Service;

@Service
public class PropertyInjectedGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World! -- Property";
    }
}
