package guru.springframework.sfgdi.controllers;/*
 * Created by Mahdiye on 2021, May, 26
 */

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String sayHello(){
        System.out.println("Hello World!!!");

        return "Hi Folks!";
    }
}
