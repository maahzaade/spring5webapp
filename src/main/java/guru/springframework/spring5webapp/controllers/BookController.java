package guru.springframework.spring5webapp.controllers;/*
 * Created by Mahdiye on 2021, May, 04
 */

import guru.springframework.spring5webapp.repositories.BookRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookController {

    private final BookRepository bookRepository;


    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @RequestMapping("/books")
    public String getBooks(Model model){

        System.out.println("((((((((((((((");
        model.addAttribute("books", bookRepository.findAll());
        System.out.println("}}}}"+bookRepository.findAll().iterator().hasNext());

        return "books/list";
    }
}
