package guru.springframework.spring5webapp.controllers;/*
 * Created by Mahdiye on 2021, May, 06
 */

import guru.springframework.spring5webapp.repositories.AuthorRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuthorController {

    private final AuthorRepository authorRepository;


    public AuthorController(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @RequestMapping("/authors")
    public String getBooks(Model model){

        System.out.println("((((((((((((((");
        model.addAttribute("authors", authorRepository.findAll());
        System.out.println("}}}}"+authorRepository.findAll().iterator().hasNext());

        return "authors/list";
    }
}
