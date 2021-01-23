package com.senera.webApp.Controller;

import com.senera.webApp.repository.AuthorRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Senera Madushan
 * @comment
 */
@Controller
public class AuthorController {

    private final AuthorRepository authorRepository;

    public AuthorController(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @RequestMapping(path = "/authors")
    public String getAuthors(Model model){

        model.addAttribute("authors",authorRepository.findAll());

        return "books/authors/list";
    }
}
