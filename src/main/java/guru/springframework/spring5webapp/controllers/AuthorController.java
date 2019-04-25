package guru.springframework.spring5webapp.controllers;

import guru.springframework.spring5webapp.repositories.AuthorRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuthorController {
    private AuthorRepository author_Repository;

    public AuthorController(AuthorRepository author_Repository) {
        this.author_Repository = author_Repository;
    }

    @RequestMapping("/a")
    public String getAuthor(Model model){
        model.addAttribute("author",author_Repository.findAll());

        return "author";
    }
}
