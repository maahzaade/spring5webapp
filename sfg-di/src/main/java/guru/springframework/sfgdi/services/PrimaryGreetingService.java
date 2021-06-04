package guru.springframework.sfgdi.services;/*
 * Created by Mahdiye on 2021, Jun, 02
 */

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class PrimaryGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World! From the Primary Bean";
    }
}
