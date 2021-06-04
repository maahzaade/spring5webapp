package guru.springframework.sfgdi.controllers;/*
 * Created by Mahdiye on 2021, Jun, 02
 */

import guru.springframework.sfgdi.services.PrimaryGreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class PrimaryGreetingController {

    private final PrimaryGreetingService primaryGreetingService;

    public PrimaryGreetingController(PrimaryGreetingService primaryGreetingService) {
        this.primaryGreetingService = primaryGreetingService;
    }

    public String sayHello(){
        return primaryGreetingService.sayGreeting();
    }
}
