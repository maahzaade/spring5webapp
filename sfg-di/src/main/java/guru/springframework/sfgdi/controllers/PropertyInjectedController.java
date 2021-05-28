package guru.springframework.sfgdi.controllers;/*
 * Created by Mahdiye on 2021, May, 28
 */

import guru.springframework.sfgdi.services.GreetingService;

public class PropertyInjectedController {

    public GreetingService greetingService;

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
