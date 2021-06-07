package guru.springframework.sfgdi.services;/*
 * Created by Mahdiye on 2021, Jun, 03
 */

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"ES","default"})
@Service("i18nService")
public class I18nSpanishGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hola Mundo!";
    }
}
